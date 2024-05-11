import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        String currentKey = "";
        while (currentKey != "5") {
            System.out.print(
                    "1.Действия в BIN\n" +
                            "2.Действия в OCT\n" +
                            "3.Действия в DEC\n" +
                            "4.Действия в HEX\n" +
                            "5.Выход"
            );
            currentKey = sc.nextLine();
        }
    }
    public int doOperation(Num a, Num b, String op){
        return switch (op) {
            case "+" -> a.getValue() + b.getValue();
            case "-" -> a.getValue() - b.getValue();
            case "*" -> a.getValue() * b.getValue();
            case "/" -> a.getValue() / b.getValue();
            default -> throw new RuntimeException("Указан невалидный оператор");
        };
    }
}