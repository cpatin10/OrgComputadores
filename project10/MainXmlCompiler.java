import java.io.*;
import java.lang.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MainXmlCompiler {

    private static void visitorParsing(String fileName) throws Exception {
        checkFile(fileName);
        System.out.println("> Fichero: " + fileName);
        createTokensXml(fileName);
        GrammarJackLexer lexer = new GrammarJackLexer(CharStreams.fromFileName(fileName));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarJackParser parser = new GrammarJackParser(tokens);
        ParseTree tree = parser.classAxiom();
        if(parser.getNumberOfSyntaxErrors() == 0){
            System.out.println("> Fichero sintácticamente correcto");
        }else{
            System.err.println("**Error: error de sintáxis, no se puede continuar con ejecución");
            System.exit(1);
        }
        createFullXml(fileName, tree);
        System.out.println();
    }

    private static void checkFile(String fileName) throws Exception {
        if (fileName.indexOf(".jack") != fileName.length()-5) {
            Exception e = new Exception("**Error: el fichero " + fileName + " no es extensión .jack");
            throw e;
        }
    }
    
    private static void createTokensXml(String fileName) throws IOException {
        GrammarJackLexer lexer = new GrammarJackLexer(CharStreams.fromFileName(fileName));
        String tokensXml = Tokenizer.tokenizeText(lexer);
        writeFile(fileName, tokensXml, "Tc");
        System.out.println("> XML de tokens creado exitosamente");
    }

    private static void createFullXml(String fileName, ParseTree tree) throws IOException {
        GrammarJackLexer lexer = new GrammarJackLexer(CharStreams.fromFileName(fileName));
        XmlVisitor visitor = new XmlVisitor(lexer);
        String fullXml = visitor.visit(tree);
        writeFile(fileName, fullXml, "C");        
        System.out.println("> XML completo creado exitosamente");
    }

    private static void writeFile(String fileName, String xmlText, String nameExtension) {
        try {
            fileName = fileName.substring(0, fileName.length()-5);
            PrintWriter writer = new PrintWriter(fileName + nameExtension + ".xml", "UTF-8");
            writer.print(xmlText);
            writer.close();
        } catch (IOException e) {
            System.err.println("**Error: no es posible crear y/o escribir en el fichero");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("**Error: el fichero(s) se pasa como argumento");
            System.exit(1);
        }
        for (int i = 0; i < args.length; ++i) {
            try {
                visitorParsing(args[i]);//
            } catch (Exception e) {
                System.err.println("**Error: " + e);
                System.exit(1);
            }
        }
    }
}
