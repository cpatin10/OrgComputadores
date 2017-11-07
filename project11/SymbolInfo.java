import java.util.HashMap;

public class SymbolInfo {
    private String type, segment;
    private int segmPosition;
    
    public SymbolInfo(String type, String segment, int segmPosition) {
        this.type = type;
        this.segment = segment;
        this.segmPosition = segmPosition;
    }

    public String getType() {
        return type;
    }

    public String getSegment() {
        return segment;
    }

    public int getPosition() {
        return segmPosition;
    }

    public void printInfo() {
        System.out.println("t: " + type + " s: " + segment + " p: " + segmPosition);
    }
}
