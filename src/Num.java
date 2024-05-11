public abstract class Num {
    protected  Num (String val, int s, String rx){
        regex = rx;
        sys = s;
        value = toInt(val);
    }
    protected  Num (int val, int s, String rx){
        regex = rx;
        sys = s;
        value = val;
    }
    protected int value;
    final int sys;
    protected String regex;

    public int getNumSys(){
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
