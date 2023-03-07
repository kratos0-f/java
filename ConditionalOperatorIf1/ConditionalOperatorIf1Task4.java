import java.util.Scanner;

public class ConditionalOperatorIf1Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a >= 0 && a < 10){
            System.out.print("ЦИФРА");
        } else if ( a >= 10 && a < 100){
            System.out.print("ЧИСЛО");
        } else {
            System.out.print("ДРУГОЕ");
        }
    }
}
