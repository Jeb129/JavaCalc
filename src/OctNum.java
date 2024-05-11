public class OctNum extends Num {
    public OctNum(String val) {
        super(val, 8, "^[-]?[0-7]+$");
    }
    public OctNum(int val) {
        super(val, 8, "^[-]?[0-7]+$");
    }
}
