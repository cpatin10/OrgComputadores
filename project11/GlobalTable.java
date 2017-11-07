
public class GlobalTable extends SymbolTable {
    int countField, countStatic;
    
    public GlobalTable() {
        super();
        countField = 0;
        countStatic = 0;
    }

    public void addSymbol(String identifier, String type, String segment) {
        if (segment.equals("field")) {
            SymbolInfo info = new SymbolInfo(type, segment, countField);
            ++countField;
            table.put(identifier, info);
        } else if (segment.equals("static")) {
            SymbolInfo info = new SymbolInfo(type, segment, countStatic);
            ++countStatic;
            table.put(identifier, info);
        } else {
            System.err.println("**Error: variable no pertenece a tabla global: " + identifier + " de tipo " + type + " del segmento " + segment);
            System.exit(1);            
        }
    }

    public int numberClassFields() {
        return countField;
    }
}
