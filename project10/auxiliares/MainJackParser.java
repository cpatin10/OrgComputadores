import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class MainJackParser{

    public static void main(String []args){
	System.out.println("Llego hasta el main");
	if(args.length < 1) {
            System.err.println("**Error: fichero(s) se pasa como argumento.");
            System.exit(1);
	}
	for(int i = 0; i < args.length; i++){
	    String in = args[i];
	    System.out.println("> Fichero: "+ in);
	    try{
		GrammarJackLexer lexer = new GrammarJackLexer(CharStreams.fromFileName(args[i]));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GrammarJackParser parser = new GrammarJackParser(tokens);
		ParseTree tree = parser.classAxiom();

		if(parser.getNumberOfSyntaxErrors() == 0){
		    System.out.println("> Fichero sintácticamente correcto");
		}else{
		    System.out.println("> Fichero sintácticamente incorrecto");
		}
		
	    }catch(IOException io){
		System.err.println("**Exception: "+ io);
		System.exit(1);
	    }catch(RuntimeException e){
		System.err.println("**Error en tiempo de ejecucion Invalido >>");
	    }
	}
	System.exit(0);
    }
}
