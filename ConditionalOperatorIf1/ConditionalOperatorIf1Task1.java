import java.util.Scanner;

public class ConditionalOperatorIf1Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a < b && b < c){
            System.out.printf("%.3f\n",2*a);
            System.out.printf("%.3f\n",2*b);
            System.out.printf("%.3f\n",2*c);
        } else {
            System.out.printf("%.3f\n",-a);
            System.out.printf("%.3f\n",-b);;
            System.out.printf("%.3f\n",-c);;
        }
    }
}
