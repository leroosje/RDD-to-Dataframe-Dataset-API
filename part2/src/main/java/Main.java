import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void run(String expr){

        final RddLexer lexer = new RddLexer(CharStreams.fromString(expr));

        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final RddParser parser = new RddParser(tokens);
        final RddListenerImpl listener = new RddListenerImpl();
        parser.addParseListener(listener);
        parser.start();
        System.out.println(listener.outPut());
        //System.out.println("done");
    }

    public static void main(String[] args){
        String test1 = "sc.range(10,100).map(i=>(i,i+i,i*10)).map(r=>r._1+r._2+r._3).collect()";
        String test2 = "sc.range(10,100)\n" +
                ".map(i=>i+3)\n" +
                ".collect()\n";
        String test3 = "sc.range(10,100)\n" +
                "  .map(i=>{val j=i%3;(i, if(j==0)i*10 else i*2)})\n" +
                "  .map(r=>r._1+r._2)\n" +
                "  .collect()\n";
        System.out.println("***output for test1***");
        run(test1);
        System.out.println("***output for test2***");
        run(test2);
        System.out.println("***output for test3***");
        run(test3);
    }
}
