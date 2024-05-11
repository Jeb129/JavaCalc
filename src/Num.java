public abstract class Num {
    public Num(int val, byte s){
        value = val;
        sys = s;
    }
    public  Num (String val, byte s){
        value = toInt(val);
        sys = s;
    }
    protected int value;
    final byte sys;
    protected String regex;

    public byte getNumSys(){
        return sys;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int val){
        value = val;
    }
    @Override
    public abstract String toString();
    public int toInt(String val){
        if (!val.matches(regex) || val.matches("[ ,;:]"))
            throw new IllegalArgumentException("Невозможно преобразовать в указанную систму счисления: " + sys);
        return Integer.parseInt(val,sys);
    }
}
