public abstract class Num {
    protected  Num (String val, byte s, String rx){
        value = toInt(val);
        sys = s;
        regex = rx;
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
    public String toString(){
        return Integer.toUnsignedString(value,sys);
    };
    public int toInt(String val){
        if (!val.matches(regex) || val.matches("[ ,;:]"))
            throw new IllegalArgumentException("Невозможно преобразовать в указанную систму счисления: " + sys);
        return Integer.parseInt(val,sys);
    }
}
