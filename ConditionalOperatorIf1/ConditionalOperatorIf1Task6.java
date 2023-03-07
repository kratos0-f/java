import java.util.Scanner;

public class ConditionalOperatorIf1Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        if ((int)a % 5 >= 3){
            System.out.print("КРАСНЫЙ");
        } else {
            System.out.print("ЗЕЛЁНЫЙ");
        }

    }
}
