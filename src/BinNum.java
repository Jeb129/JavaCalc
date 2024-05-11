public class BinNum extends Num {
    public BinNum(String val){
        super(val, 2, "^[-]?[0-1]+$");
    }
    public BinNum(int val){
        super(val, 2, "^[-]?[0-1]+$");
    }
}
