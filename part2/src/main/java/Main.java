import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void run(String expr){

        final RddLexer lexer = new RddLexer(CharStreams.fromString(expr));

        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        final RddParser parser = new RddParser(tokens);
        final RddListenerImpl listener = new RddListenerImpl();
        parser.addParseListener(listener);
        parser.start();
        System.out.println(listener.outPut());
        System.out.println("done");
    }

    public static void main(String[] args){
        String test = "sc.range(10,100).map(x=>{val z=x%2;(x+2,if(z+3>0) x else y)}).collect()";
        String test1 = "sc.range(10,100)\n" +
                "  .map(r=>r._1+r._2)\n" +
                ".collect()\n";
        String test2 = "sc.range(10,100)\n" +
                "  .map(i=>{val j=i%3;(i, if(j==0)i*10 else i*2)})\n" +
                "  .map(r=>r._1+r._2)\n" +
                "  .collect()\n";

        run(test1);
        run(test2);
    }
}
