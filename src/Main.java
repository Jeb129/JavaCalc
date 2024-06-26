import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        String currentKey = "";
        while (!currentKey.equals("5")) {
            System.out.println(
                    """
                            1.Действия в BIN
                            2.Действия в OCT
                            3.Действия в DEC
                            4.Действия в HEX
                            5.Выход"""
            );
            currentKey = sc.nextLine();
            switch (currentKey){
                case "1": {
                    Calculation(BinNum.class);
                    break;
                }
                case "2": {
                    Calculation(OctNum.class);
                    break;
                }
                case "3": {
                    Calculation(DecNum.class);
                    break;
                }
                case "4": {
                    Calculation(HexNum.class);
                    break;
                }
                default: break;
            }
        }
    }
    public static void Calculation(Class<? extends Num> numClass){
        Num a,b,result;
        String op;
        try {
            System.out.println("Введи первое число: ");
            String t = sc.nextLine();
            a = numClass.getConstructor(String.class).newInstance(t);
            System.out.println("Введи второе число: ");
            t = sc.nextLine();
            b = numClass.getConstructor(String.class).newInstance(t);
            System.out.println("Введи оператор ");
            op = sc.nextLine();
            result = numClass.getConstructor(int.class).newInstance(doOperation(a,b,op));
            System.out.println("В двоичной: "+result.convent(2));
            System.out.println("В восьмиричной: "+result.convent(8));
            System.out.println("В десятичной: "+result.convent(10));
            System.out.println("В шестнадцатиричной: "+result.convent(16));
        } catch (Exception e) {
            System.out.println("Ошибка");
            System.out.println(e.getMessage());
        }
    }
    public static int doOperation(Num a, Num b, String op){

        return switch (op) {
            case "+" -> a.getValue() + b.getValue();
            case "-" -> a.getValue() - b.getValue();
            case "*" -> a.getValue() * b.getValue();
            case "/" -> a.getValue() / b.getValue();
            default -> throw new RuntimeException("Указан невалидный оператор");
        };
    }
}