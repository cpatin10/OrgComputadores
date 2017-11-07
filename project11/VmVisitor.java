import org.antlr.v4.runtime.*;
import java.util.HashMap;

public class VmVisitor extends GrammarJackBaseVisitor<String> {
    private GrammarJackLexer lexer;
    private Token token;
    private int tokenType, eof;
    private boolean foundEof;
    private String currentClass;
    private GlobalTable globalTable;
    private LocalTable localTable;
    private HashMap<String, Integer> subroutines;
    private int labelCounter, callArgs;
    
    public VmVisitor(GrammarJackLexer lexer) {
        super();
        this.lexer = lexer;
        token = lexer.nextToken();
        Token eofToken = lexer.emitEOF();
        eof = eofToken.getType();
        tokenType = token.getType();
        foundEof = false;
        currentClass = "";
        labelCounter = 0;
    }

    private void nextToken() {
        if (tokenType != eof) {
            token = lexer.nextToken();
            tokenType = token.getType();
        } else {
            System.err.println("**Error: fin de fichero, no hay más tokens");
            System.exit(1);
        }
    }

    private String getTextAndMove() {
        String text = token.getText();
        nextToken();
        return text;
    }

    private void checkVariable(String varName) {
        if (!globalTable.contains(varName) && !localTable.contains(varName)) {
            System.err.println("**Error: variable no declarada: " + varName);
            /*
            System.out.println("locales");
            localTable.printTable();
            System.out.println("globales");
            globalTable.printTable();
            */
            System.exit(1);
        }
    }

    private SymbolTable getTable(String varName) {
        if (globalTable.contains(varName)) {
            return globalTable;
        }
        return localTable;
    }

    private String newLabel() {
        String label = "L" + labelCounter;
        ++labelCounter;
        return label;
    }

    @Override
    public String visitClassAxiom(GrammarJackParser.ClassAxiomContext ctx) {
        subroutines = new HashMap<String, Integer>();
        globalTable = new GlobalTable();
        String code = "";
        nextToken();                         // class
        currentClass = visit(ctx.className());
        nextToken();                         // {
        for (GrammarJackParser.ClassVarDecContext c: ctx.classVarDec()) {
            code += visit(c);            
        } 
        for (GrammarJackParser.SubroutineDecContext c: ctx.subroutineDec()) {
            code += visit(c);            
        }
        nextToken();                          // }
        return code;
    }

    @Override
    public String visitClassVarDec(GrammarJackParser.ClassVarDecContext ctx) {
        String code = "";
        String varsSegment = getTextAndMove();
        String varsType = visit(ctx.type());
        String varName = visit(ctx.varName(0));
        globalTable.addSymbol(varName, varsType, varsSegment);        
        int listSize = ctx.varName().size();
        for (int i = 1; i < listSize; ++i) {
            nextToken();                          // ,
            varName = visit(ctx.varName(i));            
            globalTable.addSymbol(varName, varsType, varsSegment);
        }
        nextToken();                              // ;
        return code;
    }

    @Override
    public String visitEntero(GrammarJackParser.EnteroContext ctx) {
        return getTextAndMove();
    }

    @Override
    public String visitCaracter(GrammarJackParser.CaracterContext ctx) {
        return getTextAndMove();
    }

    @Override
    public String visitBooleano(GrammarJackParser.BooleanoContext ctx) {
        return getTextAndMove();
    }

    @Override
    public String visitNombreClase(GrammarJackParser.NombreClaseContext ctx) {
        String code = visit(ctx.className());
        return code;
    }

    @Override
    public String visitSubroutineDec(GrammarJackParser.SubroutineDecContext ctx) {        
        localTable = new LocalTable();
        String code = "";
        String subroutType = getTextAndMove();   // constructor | function | method
        String returnType = "";
        if (ctx.type() == null) {
            returnType = getTextAndMove();
        } else {
            returnType = visit(ctx.type());
        }
        String subroutName = visit(ctx.subroutineName());
        String temp = "";
        if (subroutType.equals("method")) {
            localTable.addSymbol("this", currentClass, "argument");
            temp = VmWriter.push("argument", 0);
            temp += VmWriter.pop("pointer", 0);
        }
        
        nextToken();                             // (
        code += visit(ctx.parameterList());
        nextToken();                             // )
        temp += visit(ctx.subroutineBody());
        int locals = localTable.numberLocalVars();
        
        code += VmWriter.function(currentClass+"."+subroutName, locals);
        if (subroutType.equals("constructor")) {
            if (!returnType.equals(currentClass)) {
                System.err.println("**Error: el tipo de dato de retorno del constructor debe corresponder a la clase");
                System.exit(1);
            }
            if (!subroutName.equals("new")) {
                System.err.println("**Error: el nombre del constructor debe ser \"new\"");
                System.exit(1);
            }
            int fields = globalTable.numberClassFields();
            code += VmWriter.push("constant", fields);
            code += VmWriter.call("Memory.alloc", 1);
            code += VmWriter.pop("pointer", 0);
        }
        code += temp;
        int args = localTable.numberLocalArgs();
        subroutines.put(subroutName, args);
        return code;
    }

    @Override
    public String visitParameterList(GrammarJackParser.ParameterListContext ctx) {
        String code = "";
        if (!ctx.type().isEmpty()) {
            String varType = visit(ctx.type(0));
            String varName = visit(ctx.varName(0));
            localTable.addSymbol(varName, varType, "argument");
            int listSize = ctx.type().size();
            for (int i = 1; i < listSize; ++i) {
                nextToken();                         // ,
                varType = visit(ctx.type(i));
                varName = visit(ctx.varName(i));
                localTable.addSymbol(varName, varType, "argument");
            }
        }        
        return code;
    }

    @Override
    public String visitSubroutineBody(GrammarJackParser.SubroutineBodyContext ctx) {
        String code = "";
        nextToken();                                 // {
        for (GrammarJackParser.VarDecContext c: ctx.varDec()) {
            code += visit(c);            
        }
        code += visit(ctx.statements());
        nextToken();                                 // }
        return code;
    }

    @Override
    public String visitVarDec(GrammarJackParser.VarDecContext ctx) {
        String code = "";
        nextToken();                               // var
        String varsType = visit(ctx.type());
        String varName = visit(ctx.varName(0));
        localTable.addSymbol(varName, varsType, "var");
        int listSize = ctx.varName().size();
        for (int i = 1; i < listSize; ++i) {
            nextToken();                           // ,
            varName = visit(ctx.varName(i));
            localTable.addSymbol(varName, varsType, "var");
        }
        nextToken();                               // ;
        return code;
    }

    @Override
    public String visitClassName(GrammarJackParser.ClassNameContext ctx) {
        return getTextAndMove();
    }

    @Override
    public String visitSubroutineName(GrammarJackParser.SubroutineNameContext ctx) {
        return getTextAndMove();
    }

    @Override
    public String visitVarName(GrammarJackParser.VarNameContext ctx) {
        return getTextAndMove();
    }

    @Override
    public String visitStatements(GrammarJackParser.StatementsContext ctx) {
        String code = "";
        for (GrammarJackParser.StatementContext c: ctx.statement()) {
            code += visit(c);
        }
        return code;
    }

    @Override
    public String visitOperationLet(GrammarJackParser.OperationLetContext ctx) {
        String code = "";
        code += visit(ctx.letStatement());
        return code;
    }

    @Override
    public String visitOperationIf(GrammarJackParser.OperationIfContext ctx) {
        String code = "";
        code += visit(ctx.ifStatement());
        return code;
    }

    @Override
    public String visitOperationWhile(GrammarJackParser.OperationWhileContext ctx) {
        String code = "";
        code += visit(ctx.whileStatement());
        return code;
    }

    @Override
    public String visitOperationDo(GrammarJackParser.OperationDoContext ctx) {
        String code = "";
        code += visit(ctx.doStatement());
        return code;
    }

    @Override
    public String visitOperationReturn(GrammarJackParser.OperationReturnContext ctx){ 
        String code = "";
        code += visit(ctx.returnStatement());        
        return code;
    }

    @Override
    public String visitLetStatement(GrammarJackParser.LetStatementContext ctx) {
        String code = "";
        nextToken();                       // let
        String varName = visit(ctx.varName());
        checkVariable(varName);
        SymbolTable table = getTable(varName);
        int expCount = 0;
        boolean isArray = false;
        if (token.getText().equals("[")) {
            isArray = true;
            nextToken();                   // [
            code += visit(ctx.expression(expCount));
            code += VmWriter.push(table.getVmSegment(varName), table.getPosition(varName));
            code += VmWriter.basicOperation('+');
            nextToken();                   // ]
            ++expCount;
        }
        nextToken();                       // =
        code += visit(ctx.expression(expCount));
        if (isArray) {
            code += VmWriter.pop("temp", 0);
            code += VmWriter.pop("pointer", 1);
            code += VmWriter.push("temp", 0);
            code += VmWriter.pop("that", 0);
        } else {
            code += VmWriter.pop(table.getVmSegment(varName), table.getPosition(varName));
        }

        nextToken();                       // ;
        return code;
    }

    @Override
    public String visitIfStatement(GrammarJackParser.IfStatementContext ctx) {
        String code = "";
        String falseLabel = newLabel() + "_FALSE";
        String endLabel = newLabel() + "_ENDIF";
        nextToken();                     // if
        nextToken();                     // (
        code += visit(ctx.expression());
        nextToken();                     // )
        code += VmWriter.basicOperation('~');
        code += VmWriter.ifGoto(falseLabel);        
        nextToken();                     // {
        code += visit(ctx.statements(0));
        nextToken();                     // }
        code += VmWriter.goTo(endLabel);
        code += VmWriter.label(falseLabel);
        int listSize = ctx.statements().size();
        if (listSize > 1) {
            nextToken();                 // else
            nextToken();                 // {
            code += visit(ctx.statements(1));
            nextToken();                 // }
        }
        code += VmWriter.label(endLabel);        
        return code;
    }

    @Override
    public String visitWhileStatement(GrammarJackParser.WhileStatementContext ctx) {
        String code = "";
        String whileLabel = newLabel() + "_WHILE";
        String endLabel = newLabel() + "_ENDWHILE";
        nextToken();                     // while
        code += VmWriter.label(whileLabel);
        nextToken();                     // (
        code += visit(ctx.expression());
        code += VmWriter.basicOperation('~');
        code += VmWriter.ifGoto(endLabel);
        nextToken();                     // )
        nextToken();                     // {
        code += visit(ctx.statements());
        code += VmWriter.goTo(whileLabel);
        nextToken();                     // }
        code += VmWriter.label(endLabel);
        return code;
    }

    @Override
    public String visitDoStatement(GrammarJackParser.DoStatementContext ctx) {
        String code = "";       
        nextToken();                     // do
        code += visit(ctx.subroutineCall());
        nextToken();                     // ;
        code += VmWriter.pop("temp", 0); 
        return code;        
    }

    @Override
    public String visitReturnStatement(GrammarJackParser.ReturnStatementContext ctx) {
        String code = "";
        nextToken();                     // return
        if (ctx.expression() != null) {
            code += visit(ctx.expression());
        } else {
            code += VmWriter.push("constant", 0);
        }
        code += VmWriter.returns();
        nextToken();                     // ;
        return code;
    }

    @Override
    public String visitExpression(GrammarJackParser.ExpressionContext ctx) {
        String code = "";
        code += visit(ctx.term(0));
        int listSize = ctx.operator().size();
        for (int i = 0; i < listSize; ++i) {
            String temp = visit(ctx.operator(i));
            code += visit(ctx.term(i+1)) + temp;
        }
        return code;
    }

    @Override
    public String visitConstantInt(GrammarJackParser.ConstantIntContext ctx) {
        String code = "";
        int constInt = Integer.parseInt(getTextAndMove());        
        if (constInt > 32767) {
            System.err.println("**Error: valor numérico fuera del rango: " + constInt);
            System.exit(1);
        }
        code += VmWriter.push("constant", constInt);
        return code;
    }

    @Override
    public String visitConstantString(GrammarJackParser.ConstantStringContext ctx) {
        String code = "";
        String str = getTextAndMove();
        int strLength = str.length();
        code += VmWriter.push("constant", strLength-2);
        code += VmWriter.call("String.new", 1);
        for (int i = 1; i < strLength-1; ++i) {
            code += VmWriter.push("constant", (int)str.charAt(i));
            code += VmWriter.call("String.appendChar", 2);
        }
        return code;
    }

    @Override
    public String visitConstantKeyword(GrammarJackParser.ConstantKeywordContext ctx) {
        String kwconstant = visit(ctx.keywordConstant());
        return kwconstant;
    }

    @Override
    public String visitVariableName(GrammarJackParser.VariableNameContext ctx) {
        String code = "";
        String variable = visit(ctx.varName());
        checkVariable(variable);
        SymbolTable table = getTable(variable);
        code += VmWriter.push(table.getVmSegment(variable), table.getPosition(variable));
        return code;
    }

    @Override
    public String visitVarArray(GrammarJackParser.VarArrayContext ctx) {
        String code = "";
        String variable = visit(ctx.varName());
        checkVariable(variable);
        nextToken();                           // [
        SymbolTable table = getTable(variable);
        code += visit(ctx.expression());
        code += VmWriter.push(table.getVmSegment(variable), table.getPosition(variable));
        code += VmWriter.basicOperation('+');
        code += VmWriter.pop("pointer", 1);
        code += VmWriter.push("that", 0);
        nextToken();                           // ]
        return code;
    }

    @Override
    public String visitSubroutCall(GrammarJackParser.SubroutCallContext ctx) {
        String code = visit(ctx.subroutineCall());
        return code;
    }

    @Override
    public String visitExpresionParent(GrammarJackParser.ExpresionParentContext ctx) {
        String code = "";
        nextToken();                          // (
        code += visit(ctx.expression());
        nextToken();                          // )
        return code;
    }

    @Override
    public String visitUnaryOp(GrammarJackParser.UnaryOpContext ctx) {
        String temp = visit(ctx.unaryOperator());
        String code = visit(ctx.term()) + temp;
        return code;
    }

    @Override
    public String visitDirectCall(GrammarJackParser.DirectCallContext ctx) {
        String code = "";
        String subroutName = getTextAndMove();
        callArgs = 1;
        code += VmWriter.push("pointer", 0);
        nextToken();                       // (
        code += visit(ctx.expressionList());
        nextToken();                       // )
        code += VmWriter.call(currentClass + "." + subroutName, callArgs);
        return code;
    }

    @Override
    public String visitObjectCall(GrammarJackParser.ObjectCallContext ctx) {
        String code = "";
        String objName = visit(ctx.className());
        SymbolTable table = getTable(objName);
        String subroutName = "";
        String callName = "";
        callArgs = 0;
        if (!table.contains(objName)) {
            callName = objName;
        } else {
            checkVariable(objName);
            if (table.isPrimitive(objName)) {
                System.err.println("**Error: la variable no es un objeto");
                System.exit(1);
            }
            code += VmWriter.push(table.getVmSegment(objName), table.getPosition(objName));
            callName = table.getType(objName);
            callArgs = 1;
        }
        nextToken();                       // .
        subroutName = getTextAndMove();
        callName += "." + subroutName;
        nextToken();                       // (
        code += visit(ctx.expressionList());
        nextToken();                       // )
        code += VmWriter.call(callName, callArgs);
        return code;
    }

    @Override
    public String visitExpressionList(GrammarJackParser.ExpressionListContext ctx) {
        String code = "";
        if (!ctx.expression().isEmpty()) {
            code += visit(ctx.expression(0));
            int listSize = ctx.expression().size();
            for (int i = 1; i < listSize; ++i) {
                nextToken();
                code += visit(ctx.expression(i));
            }
            callArgs += listSize;
        }        
        return code;
    }

    @Override
    public String visitSuma(GrammarJackParser.SumaContext ctx) {
        String code = VmWriter.basicOperation('+');
        nextToken();
        return code;
    }

    @Override
    public String visitResta(GrammarJackParser.RestaContext ctx) {
        String code = VmWriter.basicOperation('-');
        nextToken();
        return code;
    }

    @Override
    public String visitMult(GrammarJackParser.MultContext ctx) {
        String code = VmWriter.call("Math.multiply", 2);
        nextToken();
        return code;
    }

    @Override
    public String visitDivision(GrammarJackParser.DivisionContext ctx) {
        String code = VmWriter.call("Math.divide", 2);
        nextToken();
        return code;
    }

    @Override
    public String visitAnd(GrammarJackParser.AndContext ctx) {
        String code = VmWriter.basicOperation('&');
        nextToken();
        return code;
    }

    @Override
    public String visitOr(GrammarJackParser.OrContext ctx) {
        String code = VmWriter.basicOperation('|');
        nextToken();
        return code;
    }

    @Override
    public String visitMenor(GrammarJackParser.MenorContext ctx) {
        String code = VmWriter.basicOperation('<');
        nextToken();
        return code;
    }

    @Override
    public String visitMayor(GrammarJackParser.MayorContext ctx) {
        String code = VmWriter.basicOperation('>');
        nextToken();
        return code;
    }

    @Override
    public String visitIgual(GrammarJackParser.IgualContext ctx) {
        String code = VmWriter.basicOperation('=');
        nextToken();
        return code;
    }

    @Override
    public String visitNeg(GrammarJackParser.NegContext ctx)  {
        String code = VmWriter.basicOperation('n');
        nextToken();
        return code;
    }

    @Override
    public String visitNot(GrammarJackParser.NotContext ctx) {
        String code = VmWriter.basicOperation('~');
        nextToken();
        return code;
    }

    @Override
    public String visitTrue(GrammarJackParser.TrueContext ctx) {
        String code = VmWriter.push("constant", 0);
        code += VmWriter.basicOperation('~');
        nextToken();
        return code;
    }

    @Override
    public String visitFalse(GrammarJackParser.FalseContext ctx) {
        String code = VmWriter.push("constant", 0);
        nextToken();
        return code;
    }

    @Override
    public String visitNull(GrammarJackParser.NullContext ctx) {
        String code = VmWriter.push("constant", 0);
        nextToken();
        return code;
    }

    @Override
    public String visitThis(GrammarJackParser.ThisContext ctx) {
        String code = VmWriter.push("pointer", 0);
        nextToken();
        return code;
    }
}
