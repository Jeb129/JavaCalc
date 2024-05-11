public class BinNum extends Num {
    public BinNum(String val, byte s){
        super(val, s, "^[-]?[0-1]+$");
    }
}
