import java.util.HashMap;
import java.util.Map;

public class RddListenerImpl extends RddBaseListener {

    private StartCtxTransformer transformer;
    private Map<String,String> idMap = new HashMap<>();
    public String outPut(){
        if (transformer == null) return "not parsed!";
        return transformer.transform();
    }

    @Override
    public void exitStart(RddParser.StartContext ctx) {
        transformer = new StartCtxTransformer(ctx);
    }

    //start
    class StartCtxTransformer{
        private RddParser.StartContext ctx;
        StartCtxTransformer(RddParser.StartContext ctx){
            this.ctx = ctx;
        }


        String transform() {
            MapopsCtxTransformer mapopsCtxTransformer = new MapopsCtxTransformer(ctx.mapops());
            return "spark"
                    + String.format(".range(%s, %s).selectExpr(\"id as _1\")", ctx.NUMBER(0), ctx.NUMBER(1))
                    + mapopsCtxTransformer.transform()
                    + ".collect()";

        }
    }

    //mapops
    class MapopsCtxTransformer{
        private RddParser.MapopsContext ctx;
        MapopsCtxTransformer(RddParser.MapopsContext ctx){
            this.ctx = ctx;
        }

        String transform() {
            //epsilon
            if(ctx.getChildCount()==0){
                return "";
            }
            MapopsCtxTransformer mapopsCtxTransformer = new MapopsCtxTransformer(ctx.mapops());
            UdfCtxTranformer udfCtxTranformer = new UdfCtxTranformer(ctx.udf());

            return mapopsCtxTransformer.transform() + String.format(".selectExpr(%s)",udfCtxTranformer.transform());
        }
    }

    //udf
    class UdfCtxTranformer{
        private RddParser.UdfContext ctx;
        UdfCtxTranformer(RddParser.UdfContext ctx){
            this.ctx = ctx;
        }

        String transform() {
            ExprCtxTransformer exprCtxTransformer = new ExprCtxTransformer(ctx.expression());
            return exprCtxTransformer.transform();

        }
    }

    //expression
    class ExprCtxTransformer{
        private RddParser.ExpressionContext ctx;
        ExprCtxTransformer(RddParser.ExpressionContext ctx){
            this.ctx = ctx;
        }

        String transform() {
            if(ctx.complexexpression() == null){
                SimpleExprCtxTransformer simpleExprCtxTransformer = new SimpleExprCtxTransformer(ctx.simpleexpression(), 1);
                return simpleExprCtxTransformer.transform();
            }
            ComplexExprCtxTransformer complexExprCtxTransformer = new ComplexExprCtxTransformer(ctx.complexexpression(), 1);
            return complexExprCtxTransformer.transform();
        }
    }

    //simpleexpression
    class SimpleExprCtxTransformer{
        private RddParser.SimpleexpressionContext ctx;
        private int nextCol;
        SimpleExprCtxTransformer(RddParser.SimpleexpressionContext ctx, int col){
            this.ctx = ctx;
            this.nextCol = col;
        }

        String transform() {
            if(ctx.pureexpression() == null){
                TupleExprCtxTransformer tupleExprCtxTransformer = new TupleExprCtxTransformer(ctx.tupleexpression(), nextCol);
                return String.format("%s", tupleExprCtxTransformer.transform());
            }
            PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(), nextCol);
            return String.format("\"%s as _1\"", pureExprCtxTransformer.transfrom());
        }
    }

    //tupleexpression
    class TupleExprCtxTransformer{
        private RddParser.TupleexpressionContext ctx;
        private int nextCol;
        TupleExprCtxTransformer(RddParser.TupleexpressionContext ctx, int col){
            this.ctx = ctx;
            this.nextCol = col;
        }

        String transform() {
            if(ctx.tupleexpression() == null){
                PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(1),1);
                return String.format("\"%s as _%d\"", pureExprCtxTransformer.transfrom(), nextCol++);
            }

            TupleExprCtxTransformer tupleExprCtxTransformer = new TupleExprCtxTransformer(ctx.tupleexpression(), 1);
            PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), 1);

            //return String.format("%s, %s as _%d", tupleExprCtxTransformer.transform(), pureExprCtxTransformer.transfrom(), asId++);
            return String.format("%s, %s as _%d", tupleExprCtxTransformer.transform(), pureExprCtxTransformer.transfrom(), 1);
        }
    }

    //complexexpression
    class ComplexExprCtxTransformer{
        private RddParser.ComplexexpressionContext ctx;
        private int nextCol;
        ComplexExprCtxTransformer(RddParser.ComplexexpressionContext ctx, int col){
            this.ctx = ctx;
            this.nextCol = col;
        }

        String transform() {
            if (ctx.SEMICOLON()==null){
                SimpleExprCtxTransformer simpleExprCtxTransformer = new SimpleExprCtxTransformer(ctx.simpleexpression(), nextCol);
                return simpleExprCtxTransformer.transform();
            }
            //assignments ; simple
            AssignExprsCtxTransformer assignExprsCtxTransformer = new AssignExprsCtxTransformer(ctx.assignmentexpressions(),nextCol++);
            SimpleExprCtxTransformer simpleExprCtxTransformer = new SimpleExprCtxTransformer(ctx.simpleexpression(),nextCol++);
            return assignExprsCtxTransformer.transform()+","+simpleExprCtxTransformer.transform();

        }
    }

    //assignmentexpressions
    class AssignExprsCtxTransformer{
        private RddParser.AssignmentexpressionsContext ctx;
        private int nextCol;
        AssignExprsCtxTransformer(RddParser.AssignmentexpressionsContext ctx, int col){
            this.ctx = ctx;
            this.nextCol = col;
        }
        String transform() {
            //assignmentexpressions->assignmentexpression
            if(ctx.SEMICOLON()==null){
                AssignExprCtxTransformer assignExprCtxTransformer = new AssignExprCtxTransformer(ctx.assignmentexpression(), nextCol);
                return assignExprCtxTransformer.transform();
            }
            //return "";
            //assignmentexpressions->assignmentexpressions ; assignmentexpression
            AssignExprsCtxTransformer assignExprsCtxTransformer = new AssignExprsCtxTransformer(ctx.assignmentexpressions(),nextCol);
            AssignExprCtxTransformer assignExprCtxTransformer = new AssignExprCtxTransformer(ctx.assignmentexpression(),nextCol);
            return assignExprsCtxTransformer.transform()+assignExprCtxTransformer.transform();
        }
    }

    class AssignExprCtxTransformer{
        private RddParser.AssignmentexpressionContext ctx;
        private int nextCol;
        AssignExprCtxTransformer(RddParser.AssignmentexpressionContext ctx, int col){
            this.ctx = ctx;
            this.nextCol = col;
        }
        String transform() {
            idMap.put(ctx.ID().getText(),ctx.pureexpression().getText().substring(1));
//            //test
//            System.out.println(ctx.ID().getText());
//            //test
//            System.out.println(ctx.pureexpression().getText().substring(1));
            return "\"_1 as _"+nextCol+"\"";
        }
    }

    //pureexpression
    class PureExprCtxTransformer{
        private RddParser.PureexpressionContext ctx;
        private int nextCol;
        PureExprCtxTransformer(RddParser.PureexpressionContext ctx, int col){
            this.ctx = ctx;
            this.nextCol = col;
        }

        String transfrom() {
            if(ctx.IF()!=null) {
                CompExprCtxTranformer compExprCtxTranformer = new CompExprCtxTranformer(ctx.comparisonexpression(), nextCol);
                PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), nextCol);
                PureExprCtxTransformer pureExprCtxTransformer1 = new PureExprCtxTransformer(ctx.pureexpression(1), nextCol);
                return String.format("if(%s,%s,%s)", compExprCtxTranformer.transform(), pureExprCtxTransformer.transfrom(), pureExprCtxTransformer1.transfrom());
            }
            //NUMBER
            if(ctx.NUMBER() != null){
                return ctx.NUMBER().getText();
            }
            //ID DOT ID
            else if(ctx.ID(0)!=null && ctx.DOT()!=null){
                return "_"+nextCol;
            }
            //ID
            else if(ctx.ID()!=null && ctx.OP() == null){
                String expr = idMap.getOrDefault(ctx.ID(0).getText(),"");
                return "_"+nextCol+expr;
            }
            //(pureexpression)
            else if(ctx.LP()!=null && ctx.pureexpression(0)!=null && ctx.pureexpression(1)==null){
                PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), nextCol);
                return String.format("(%s)", pureExprCtxTransformer.transfrom());
            }
            //pureexpression OP pureexpression
            else if(ctx.pureexpression(0)!=null && ctx.OP()!=null && ctx.pureexpression(1)!=null){
                PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), nextCol++);
                PureExprCtxTransformer pureExprCtxTransformer1 = new PureExprCtxTransformer(ctx.pureexpression(1), nextCol++);
                return String.format("%s %s %s", pureExprCtxTransformer.transfrom(),ctx.OP().getText(),pureExprCtxTransformer1.transfrom());
            }
            return "";
            //IF LP comparisonexpression RP pureexpression ELSE pureexpression
            //else
        }
    }

    //comparisonexpression
    class CompExprCtxTranformer{
        private RddParser.ComparisonexpressionContext ctx;
        private int nextCol;
        CompExprCtxTranformer(RddParser.ComparisonexpressionContext ctx, int col){
            this.ctx = ctx;
            this.nextCol = col;
        }

        String transform(){
            PureExprCtxTransformer pureExprCtxTransformer = new PureExprCtxTransformer(ctx.pureexpression(0), nextCol);
            PureExprCtxTransformer pureExprCtxTransformer1 = new PureExprCtxTransformer(ctx.pureexpression(1), nextCol);
            return String.format("%s %s %s", pureExprCtxTransformer.transfrom(), ctx.COMP().getText(),pureExprCtxTransformer1.transfrom());
        }
    }
}
