public class DecNum extends Num{
    public DecNum(String val){
        super(val, 10, "^-?\\d+$");
    }
    public DecNum(int val){
        super(val, 10, "^-?\\d+$");
    }
}