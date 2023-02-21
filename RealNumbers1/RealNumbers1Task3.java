import java.util.Scanner;

public class RealNumbers1Task3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double Tf = scanner.nextDouble();
        double Tc = ((double) 5/ (double) 9) * (Tf - 32);

        System.out.printf("%.2f", Tc);
    }
}
