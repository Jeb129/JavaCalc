public class DecNum extends Num{
    public DecNum(String val, byte s){
        super(val, s, "^-?\\d+$");
    }
}