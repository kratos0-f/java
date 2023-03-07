import java.util.Scanner;

public class ConditionalOperatorIf1Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a > 0 && b > 0){
            System.out.print(1);
        } else if (a > 0 && b < 0) {
            System.out.print(4);
        } else if (a < 0 && b > 0) {
            System.out.print(2);
        } else {
            System.out.print(3);
        }
    }
}
