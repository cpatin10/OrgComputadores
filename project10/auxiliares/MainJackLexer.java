import java.io.*;
import java.lang.*;
import org.antlr.v4.runtime.*;

public class MainJackLexer {

    private static void tokenizer(String fileName) throws Exception {
        checkFile(fileName);
        GrammarJackLexer lexer = new GrammarJackLexer(CharStreams.fromFileName(fileName));
        System.out.println("> Fichero: " + fileName);
        String xml = Tokenizer.tokenizeText(lexer);        
        writeFile(fileName, xml);
        System.out.println("> XML creado exitosamente");
        System.out.println();
    }

    private static void checkFile(String fileName) throws Exception {
        if (fileName.indexOf(".jack") != fileName.length()-5) {
            Exception e = new Exception("**Error: el fichero " + fileName + " no es extensión .jack");
            throw e;
        }
    }
    
    private static void writeFile(String fileName, String xmlText) {
        try {
            fileName = fileName.substring(0, fileName.length()-5);
            PrintWriter writer = new PrintWriter(fileName + "Tc.xml", "UTF-8");
            writer.print(xmlText);
            writer.close();
        } catch (IOException e) {
            System.err.println("**Error: no es posible crear y/o escribir en el fichero");
            System.exit(1);
        }
    }
    
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; ++i) {
                try {
                    tokenizer(args[i]);
                } catch (Exception e) {
                    System.err.println("**Error: " + e);
                    System.exit(1);
                }
            }
        }
        else {
            System.err.println("**Error: el fichero(s) se pasan como argumento");
            System.exit(1);
        }
    }
}
