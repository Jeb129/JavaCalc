public class NumOperation {
    final Num a;
    final Num b;
    final String op;

    public NumOperation(Num fst, Num snd, String operator){
        a =fst;
        b=snd;
        op=operator;
    }
    public int doOperation(){
        return switch (op) {
            case "+" -> a.getValue() + b.getValue();
            case "-" -> a.getValue() - b.getValue();
            case "*" -> a.getValue() * b.getValue();
            case "/" -> a.getValue() / b.getValue();
            default -> throw new RuntimeException("Указан невалидный оператор");
        };
    }
}
