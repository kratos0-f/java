import java.util.Scanner;

public class ConditionalOperatorIf2Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (Math.PI * a * a > b*b){
            System.out.print("У КРУГА");
        } else {
            System.out.print("У КВАДРАТА");
        }
    }
}
