import org.antlr.v4.runtime.*;

public class XmlVisitor extends GrammarJackBaseVisitor<String> {
    private GrammarJackLexer lexer;
    private Token token;
    int tokenType, eof;
    boolean foundEof;
    int tabCounter;
    
    public XmlVisitor(GrammarJackLexer lexer) {
        super();
        this.lexer = lexer;
        token = lexer.nextToken();
        Token eofToken = lexer.emitEOF();
        eof = eofToken.getType();
        tokenType = token.getType();
        foundEof = false;
        tabCounter = 0;
    }

    public String writeNextToken() {
        String xml = "";
        if (tokenType != eof) {
            xml = Tokenizer.defineToken(tokenType, token);
            token = lexer.nextToken();
            tokenType = token.getType();
        } else {
            System.err.println("**Error: fin de fichero, no hay más tokens");
            System.exit(1);
        }
        return xml;            
    }

    public String tab() {
        String retS = "";
        String tabulator = "   ";
        for (int i = 0; i < tabCounter; ++i) {
            retS += tabulator;
        }
        return retS;
    }

    public String tabulate(String s) {
        return tab() + s;
    }

    @Override
    public String visitClassAxiom(GrammarJackParser.ClassAxiomContext ctx) {
        String xml = "<class>" + "\n";
        ++tabCounter;
        xml += tabulate(writeNextToken());                   // class
        xml += visit(ctx.className());
        xml += tabulate(writeNextToken());                  // {
        for (GrammarJackParser.ClassVarDecContext c: ctx.classVarDec()) {
            xml += visit(c);            
        } 
        for (GrammarJackParser.SubroutineDecContext c: ctx.subroutineDec()) {
            xml += visit(c);            
        }
        xml += tabulate(writeNextToken());                 // }
        --tabCounter;
        xml += "</class>" + "\n";
        return xml;
    }

    @Override
    public String visitClassVarDec(GrammarJackParser.ClassVarDecContext ctx) {
        String xml = tabulate("<classVarDec>" + "\n");
        ++tabCounter;
        // System.out.println(tabCounter);
        xml += tabulate(writeNextToken());                // static | field
        xml += visit(ctx.type()) + visit(ctx.varName(0));
        int listSize = ctx.varName().size();
        for (int i = 1; i < listSize; ++i) {
            xml += tabulate(writeNextToken());            // ,
            xml += visit(ctx.varName(i));
        }
        xml += tabulate(writeNextToken());                // ;
        --tabCounter;
        xml += tabulate("</classVarDec>" + "\n");
        return xml;
    }

    @Override
    public String visitEntero(GrammarJackParser.EnteroContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitCaracter(GrammarJackParser.CaracterContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitBooleano(GrammarJackParser.BooleanoContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitNombreClase(GrammarJackParser.NombreClaseContext ctx) {
        String xml = visit(ctx.className());
        return xml;
    }

    @Override
    public String visitSubroutineDec(GrammarJackParser.SubroutineDecContext ctx) {
        String xml = tabulate("<subroutineDec>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());      // constructor | function | method
        if (ctx.type() == null) {
            xml += tabulate(writeNextToken());          // void
        } else {
            xml += visit(ctx.type());
        }
        xml += visit(ctx.subroutineName());
        xml += tabulate(writeNextToken());              // (
        xml += visit(ctx.parameterList());
        xml += tabulate(writeNextToken());              // )
        xml += visit(ctx.subroutineBody());
        --tabCounter;
        xml += tabulate("</subroutineDec>" + "\n");
        return xml;
    }

    @Override
    public String visitParameterList(GrammarJackParser.ParameterListContext ctx) {
        String xml = tabulate("<parameterList>" + "\n");
        ++tabCounter;
        if (!ctx.type().isEmpty()) {
            xml += visit(ctx.type(0));
            xml += visit(ctx.varName(0));
            int listSize = ctx.type().size();
            for (int i = 1; i < listSize; ++i) {
                xml += tabulate(writeNextToken());      // ,
                xml += visit(ctx.type(i)) + visit(ctx.varName(i));
            }
        }
        --tabCounter;
        xml += tabulate("</parameterList>" + "\n");
        return xml;
    }

    @Override
    public String visitSubroutineBody(GrammarJackParser.SubroutineBodyContext ctx) {
        String xml = tabulate("<subroutineBody>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());            // {
        for (GrammarJackParser.VarDecContext c: ctx.varDec()) {
            xml += visit(c);            
        }
        xml += visit(ctx.statements());
        xml += tabulate(writeNextToken());           // }
        --tabCounter;
        xml += tabulate("</subroutineBody>" + "\n");
        return xml;
    }

    @Override
    public String visitVarDec(GrammarJackParser.VarDecContext ctx) {
        String xml = tabulate("<varDec>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());          // var
        xml += visit(ctx.type()) + visit(ctx.varName(0)); 
        int listSize = ctx.varName().size();
        for (int i = 1; i < listSize; ++i) {
            xml += tabulate(writeNextToken());     // ,
            xml += visit(ctx.varName(i));
        }
        xml += tabulate(writeNextToken());         // ;
        --tabCounter;
        xml += tabulate("</varDec>" + "\n");
        return xml;
    }

    @Override
    public String visitClassName(GrammarJackParser.ClassNameContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitSubroutineName(GrammarJackParser.SubroutineNameContext ctx) {
        return  tabulate(writeNextToken());
    }

    @Override
    public String visitVarName(GrammarJackParser.VarNameContext ctx) {
        return  tabulate(writeNextToken());
    }

    @Override
    public String visitStatements(GrammarJackParser.StatementsContext ctx) {
        String xml = tabulate("<statements>" + "\n");
        ++tabCounter;
        for (GrammarJackParser.StatementContext c: ctx.statement()) {
            xml += visit(c);
        }
        --tabCounter;
        xml += tabulate("</statements>" + "\n");
        return xml;
    }

    @Override
    public String visitOperationLet(GrammarJackParser.OperationLetContext ctx) {
        String xml = visit(ctx.letStatement());
        return xml;
    }

    @Override
    public String visitOperationIf(GrammarJackParser.OperationIfContext ctx) {
        String xml = visit(ctx.ifStatement());
        return xml;
    }

    @Override
    public String visitOperationWhile(GrammarJackParser.OperationWhileContext ctx) {
        String xml = visit(ctx.whileStatement());
        return xml;
    }

    @Override
    public String visitOperationDo(GrammarJackParser.OperationDoContext ctx) {
        String xml = visit(ctx.doStatement());
        return xml;
    }

    @Override
    public String visitOperationReturn(GrammarJackParser.OperationReturnContext ctx){ 
        String xml = visit(ctx.returnStatement());
        return xml;
    }

    @Override
    public String visitLetStatement(GrammarJackParser.LetStatementContext ctx) {
        String xml = tabulate("<letStatement>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());         // let
        xml += visit(ctx.varName());
        int expCount = 0;
        if (tokenType == 28) {           // es '['?
            xml += tabulate(writeNextToken());     // [
            xml += visit(ctx.expression(expCount));
            xml += tabulate(writeNextToken());     // ]
            ++expCount;
        }
        xml += tabulate(writeNextToken());         // =
        xml += visit(ctx.expression(expCount));
        xml += tabulate(writeNextToken());         // ;
        --tabCounter;
        xml += tabulate("</letStatement>" + "\n");
        return xml;
    }

    @Override
    public String visitIfStatement(GrammarJackParser.IfStatementContext ctx) {
        String xml = tabulate("<ifStatement>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());         // if
        xml += tabulate(writeNextToken());         // (
        xml += visit(ctx.expression());
        xml += tabulate(writeNextToken());         // )
        xml += tabulate(writeNextToken());         // {
        xml += visit(ctx.statements(0)); 
        xml += tabulate(writeNextToken());         // }
        int listSize = ctx.statements().size();
        if (listSize > 1) {
            xml += tabulate(writeNextToken());     // else
            xml += tabulate(writeNextToken());     // {
            xml += visit(ctx.statements(1));
            xml += tabulate(writeNextToken());     // }
        }
        --tabCounter;
        xml += tabulate("</ifStatement>" + "\n");
        return xml;
    }

    @Override
    public String visitWhileStatement(GrammarJackParser.WhileStatementContext ctx) {
        String xml = tabulate("<whileStatement>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());         // while
        xml += tabulate(writeNextToken());         // (
        xml += visit(ctx.expression());
        xml += tabulate(writeNextToken());         // )
        xml += tabulate(writeNextToken());         // {
        xml += visit(ctx.statements());
        xml += tabulate(writeNextToken());         // }
        --tabCounter;
        xml += tabulate("</whileStatement>" + "\n");
        return xml;
    }

    @Override
    public String visitDoStatement(GrammarJackParser.DoStatementContext ctx) {
        String xml = tabulate("<doStatement>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());         // do
        xml += visit(ctx.subroutineCall());
        xml += tabulate(writeNextToken());         // ;
        --tabCounter;
        xml += tabulate("</doStatement>" + "\n");
        return xml;
    }

    @Override
    public String visitReturnStatement(GrammarJackParser.ReturnStatementContext ctx) {
        String xml = tabulate("<returnStatement>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());         // return
        if (ctx.expression() != null) {
            xml += visit(ctx.expression());
        }
        xml += tabulate(writeNextToken());         // ;
        --tabCounter;
        xml += tabulate("</returnStatement>" + "\n");
        return xml;
    }

    @Override
    public String visitExpression(GrammarJackParser.ExpressionContext ctx) {
        String xml = tabulate("<expression>" + "\n");
        ++tabCounter;
        xml += visit(ctx.term(0));
        int listSize = ctx.operator().size();
        for (int i = 0; i < listSize; ++i) {
            xml += visit(ctx.operator(i)) + visit(ctx.term(i+1));
        }
        --tabCounter;
        xml += tabulate("</expression>" + "\n");
        return xml;
    }

    @Override
    public String visitConstantInt(GrammarJackParser.ConstantIntContext ctx) {
        String xml = tabulate("<term>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());
        --tabCounter;
        xml += tabulate("</term>" + "\n");
        return xml;
    }

    @Override
    public String visitConstantString(GrammarJackParser.ConstantStringContext ctx) {
        String xml = tabulate("<term>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());
        --tabCounter;
        xml += tabulate("</term>" + "\n");
        return xml;
    }

    @Override
    public String visitConstantKeyword(GrammarJackParser.ConstantKeywordContext ctx) {
        String xml = tabulate("<term>" + "\n");
        ++tabCounter;
        xml += visit(ctx.keywordConstant());
        --tabCounter;
        xml += tabulate("</term>" + "\n");
        return xml;
    }

    @Override
    public String visitVariableName(GrammarJackParser.VariableNameContext ctx) {
        String xml = tabulate("<term>" + "\n");
        ++tabCounter;
        xml += visit(ctx.varName());
        --tabCounter;
        xml += tabulate("</term>" + "\n");
        return xml;
    }

    @Override
    public String visitVarArray(GrammarJackParser.VarArrayContext ctx) {
        String xml = tabulate("<term>" + "\n");
        ++tabCounter;
        xml += visit(ctx.varName());
        xml += tabulate(writeNextToken());        // [
        xml += visit(ctx.expression());
        xml += tabulate(writeNextToken());        // ]
        --tabCounter;
        xml += tabulate("</term>" + "\n");
        return xml;
    }

    @Override
    public String visitSubroutCall(GrammarJackParser.SubroutCallContext ctx) {
        String xml = tabulate("<term>" + "\n");
        ++tabCounter;
        xml += visit(ctx.subroutineCall());
        --tabCounter;
        xml += tabulate("</term>" + "\n");
        return xml;
    }

    @Override
    public String visitExpresionParent(GrammarJackParser.ExpresionParentContext ctx) {
        String xml = tabulate("<term>" + "\n");
        ++tabCounter;
        xml += tabulate(writeNextToken());        // (
        xml += visit(ctx.expression());
        xml += tabulate(writeNextToken());        // )
        --tabCounter;
        xml += tabulate("</term>" + "\n");
        return xml;
    }

    @Override
    public String visitUnaryOp(GrammarJackParser.UnaryOpContext ctx) {
        String xml = tabulate("<term>" + "\n");
        ++tabCounter;
        xml += visit(ctx.unaryOperator()) + visit(ctx.term());
        --tabCounter;
        xml += tabulate("</term>" + "\n");
        return xml;
    }

    @Override
    public String visitDirectCall(GrammarJackParser.DirectCallContext ctx) {
        String xml = visit(ctx.subroutineName());
        xml += tabulate(writeNextToken());        // (
        xml += visit(ctx.expressionList());
        xml += tabulate(writeNextToken());        // )
        return xml;
    }

    @Override
    public String visitObjectCall(GrammarJackParser.ObjectCallContext ctx) {
        String xml = "";
        if (ctx.className() != null) {
            xml += visit(ctx.className());
        } else {
            xml += visit(ctx.varName());
        }
        xml += tabulate(writeNextToken());        // .
        xml += visit(ctx.subroutineName());
        xml += tabulate(writeNextToken());        // (
        xml += visit(ctx.expressionList());
        xml += tabulate(writeNextToken());        // )
        return xml;
    }

    @Override
    public String visitExpressionList(GrammarJackParser.ExpressionListContext ctx) {
        String xml = tabulate("<expressionList>" + "\n");
        ++tabCounter;
        if (!ctx.expression().isEmpty()) {
            xml += visit(ctx.expression(0));
            int listSize = ctx.expression().size();
            for (int i = 1; i < listSize; ++i) {
                xml += tabulate(writeNextToken());            // ,
                xml += visit(ctx.expression(i));
            }
        }
        --tabCounter;
        xml += tabulate("</expressionList>" + "\n");
        return xml;
    }

    @Override
    public String visitSuma(GrammarJackParser.SumaContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitResta(GrammarJackParser.RestaContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitMult(GrammarJackParser.MultContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitDivision(GrammarJackParser.DivisionContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitAnd(GrammarJackParser.AndContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitOr(GrammarJackParser.OrContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitMenor(GrammarJackParser.MenorContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitMayor(GrammarJackParser.MayorContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitIgual(GrammarJackParser.IgualContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitNeg(GrammarJackParser.NegContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitNot(GrammarJackParser.NotContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitTrue(GrammarJackParser.TrueContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitFalse(GrammarJackParser.FalseContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitNull(GrammarJackParser.NullContext ctx) {
        return tabulate(writeNextToken());
    }

    @Override
    public String visitThis(GrammarJackParser.ThisContext ctx) {
        return tabulate(writeNextToken());
    }
}
