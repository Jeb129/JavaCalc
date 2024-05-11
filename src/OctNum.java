public class OctNum extends Num{
    public OctNum(String val, byte s){
        super(val, s, "^[-]?[0-7]+$");
    }
}
