import java.util.HashMap;

public class VmWriter {
    private static final HashMap<Character, String> operations = new HashMap<Character, String>();

    static {
        operations.put('+', "add");
        operations.put('-', "sub");
        operations.put('n', "neg");
        operations.put('=', "eq");
        operations.put('>', "gt");
        operations.put('<', "lt");
        operations.put('&', "and");
        operations.put('|', "or");
        operations.put('~', "not");
    }

    public static String push(String segment, int index) {
        String code = "push " + segment + " " + index + "\n";
        return code;
    }

    public static String pop(String segment, int index) {
        String code = "pop " + segment + " " + index + "\n";
        return code;
    }

    public static String function(String functionName, int nlocals) {
        String code = "function " + functionName + " " + nlocals + "\n"; 
        return code;
    }

    public static String call(String function, int nargs) {
        String code = "call " + function + " " + nargs + "\n"; 
        return code;
    }

    public static String label(String name) {
        String code = "label " + name + "\n"; 
        return code;
    }

    public static String goTo(String label) {
        String code = "goto " + label + "\n"; 
        return code;
    }

    public static String ifGoto(String label) {
        String code = "if-goto " + label + "\n"; 
        return code;
    }

    public static String returns() {
        String code = "return" + "\n";
        return code;
    }

    public static String basicOperation(char operator) {
        String code = operations.get(operator) + "\n";
        return code;
    }
}
