public class HexNum extends Num{
    public HexNum(String val, byte s){
        super(val, s, "[-]?[0-9A-Fa-f]+");
    }
}