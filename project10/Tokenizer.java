import org.antlr.v4.runtime.*;

public class Tokenizer {

    public static String tokenizeText(GrammarJackLexer lexer) {
        Token token = lexer.nextToken();
        Token eof = lexer.emitEOF();
        String xml = "<tokens>" + "\n";
        int tokenType = token.getType();
        while (tokenType != eof.getType()) {
            xml = xml + defineToken(tokenType, token);
            token = lexer.nextToken();
            tokenType = token.getType();
        }
        xml = xml + "</tokens>";
        return xml;
    }

    public static String defineToken(int tokenType, Token token) {
        String xmlToken = "";
        switch (tokenType) {
        case GrammarJackLexer.INTEGERCONSTANT:
            xmlToken = "<integerConstant>" + token.getText() + "</integerConstant>";
            break;
        case GrammarJackLexer.STRINGCONSTANT:
            String temp = token.getText();
            temp = temp.substring(1, temp.length()-1);
            xmlToken = "<stringConstant>" + temp + "</stringConstant>";
            break;
        case GrammarJackLexer.KW1:        // class
        case GrammarJackLexer.KW2:        // constructor
        case GrammarJackLexer.KW3:        // function
        case GrammarJackLexer.KW4:        // method
        case GrammarJackLexer.KW5:        // field
        case GrammarJackLexer.KW6:        // static
        case GrammarJackLexer.KW7:        // var
        case GrammarJackLexer.KW8:        // int
        case GrammarJackLexer.KW9:        // char
        case GrammarJackLexer.KW10:       // boolean
        case GrammarJackLexer.KW11:       // void
        case GrammarJackLexer.KW12:       // true
        case GrammarJackLexer.KW13:       // false
        case GrammarJackLexer.KW14:       // null
        case GrammarJackLexer.KW15:       // this
        case GrammarJackLexer.KW16:       // let
        case GrammarJackLexer.KW17:       // do
        case GrammarJackLexer.KW18:       // if
        case GrammarJackLexer.KW19:       // else
        case GrammarJackLexer.KW20:       // while
        case GrammarJackLexer.KW21:       // return
            xmlToken = "<keyword>" + token.getText() + "</keyword>";
            break;
        case GrammarJackLexer.SIM1:        // {
        case GrammarJackLexer.SIM2:        // }
        case GrammarJackLexer.SIM3:        // (
        case GrammarJackLexer.SIM4:        // )
        case GrammarJackLexer.SIM5:        // [
        case GrammarJackLexer.SIM6:        // ]
        case GrammarJackLexer.SIM7:        // .
        case GrammarJackLexer.SIM8:        // ,
        case GrammarJackLexer.SIM9:        // ;
        case GrammarJackLexer.SIM10:       // +
        case GrammarJackLexer.SIM11:       // -
        case GrammarJackLexer.SIM12:       // *
        case GrammarJackLexer.SIM13:       // /
        case GrammarJackLexer.SIM15:       // |
        case GrammarJackLexer.SIM18:       // =
        case GrammarJackLexer.SIM19:       // ~
            xmlToken = "<symbol>" + token.getText() + "</symbol>";
            break;
        case GrammarJackLexer.SIM14:       // &
            xmlToken = "<symbol>" + "&amp;" + "</symbol>";
            break;
        case GrammarJackLexer.SIM16:       // <
            xmlToken = "<symbol>" + "&lt;" + "</symbol>";
            break;
        case GrammarJackLexer.SIM17:       // >
            xmlToken = "<symbol>" + "&gt;" + "</symbol>";
            break;
        case GrammarJackLexer.IDENTIFIER:
            xmlToken = "<identifier>" + token.getText() + "</identifier>";
            break;
        case GrammarJackLexer.WS:
            break;
        case GrammarJackLexer.LINE_COMMENT:
            break;
        case GrammarJackLexer.BLOCK_COMMENT:
            break;
        default:
            System.err.println("**LexerError: token: "+ token.getText() + " en la línea: " + token.getLine() + " y columna: " + token.getCharPositionInLine());
            System.exit(1);
        }
        return xmlToken + "\n";
    }
}
