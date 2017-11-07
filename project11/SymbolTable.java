import java.util.HashMap;

public abstract class SymbolTable {
    protected HashMap<String, SymbolInfo> table;
    private static final HashMap<String, String> segmentCorrelation = new HashMap<String, String>();

    static {
        segmentCorrelation.put("field", "this");
        segmentCorrelation.put("static", "static");
        segmentCorrelation.put("var", "local");
        segmentCorrelation.put("argument", "argument");
    }

    public SymbolTable() {
        table = new HashMap<String, SymbolInfo>();
    }

    public abstract void addSymbol(String identifier, String type, String segment);

    public boolean contains(String identifier) {
        return table.containsKey(identifier);
    }

    public String getVmSegment(String identifier) {
        SymbolInfo info = table.get(identifier);
        String segment = info.getSegment();
        String vmSegment = segmentCorrelation.get(segment);
        if (vmSegment == null) {
            System.err.println("**Error: el segmento de memoria no existe");
            System.exit(1);
        }
        return vmSegment;
    }

    public int getPosition(String identifier) {
        SymbolInfo info = table.get(identifier);
        int position = info.getPosition();
        return position;
    }

    public boolean isPrimitive(String identifier) {
        SymbolInfo info = table.get(identifier);
        String type = info.getType();
        if (type.equals("int") || type.equals("boolean") || type.equals("char")) {
            return true;
        }
        return false;
    }

    public String getType(String identifier) {
        SymbolInfo info = table.get(identifier);
        String type = info.getType();
        return type;
    }

    public void printTable() {
        for (HashMap.Entry<String, SymbolInfo> entry: table.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().printInfo();
        }
    }
}
