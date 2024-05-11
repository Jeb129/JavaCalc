public class HexNum extends Num{
    public HexNum(String val){
        super(val, 16, "[-]?[0-9A-Fa-f]+");
    }
    public HexNum(int val){
        super(val, 16, "[-]?[0-9A-Fa-f]+");
    }
}