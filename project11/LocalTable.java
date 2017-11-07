
public class LocalTable extends SymbolTable {
    int countArg, countVar;
    
    public LocalTable() {
        super();
        countArg = 0;
        countVar = 0;
    }

    public void addSymbol(String identifier, String type, String segment) {
        if (segment.equals("argument")) {
            SymbolInfo info = new SymbolInfo(type, segment, countArg);
            ++countArg;
            table.put(identifier, info);
        } else if (segment.equals("var")) {
            SymbolInfo info = new SymbolInfo(type, segment, countVar);
            ++countVar;
            table.put(identifier, info);
        } else {
            System.err.println("**Error: variable no pertenece a tabla local");
            System.exit(1);            
        }
    }

    public int numberLocalVars() {
        return countVar;
    }

    public int numberLocalArgs() {
        return countArg;
    }
}
