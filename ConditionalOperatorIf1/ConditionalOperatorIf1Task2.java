import java.util.Scanner;

public class ConditionalOperatorIf1Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if ((a < b && b < c) || (a > b && b > c)){
            System.out.printf("%.3f\n",3*a);
            System.out.printf("%.3f\n",3*b);
            System.out.printf("%.3f\n",3*c);
        } else {
            System.out.printf("%.3f\n",a/2);
            System.out.printf("%.3f\n",b/2);;
            System.out.printf("%.3f\n",c/2);;
        }
    }
}
