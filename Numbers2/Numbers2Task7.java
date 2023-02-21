import java.util.Scanner;

public class Numbers2Task7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int ch1 = a / 100;
        int ch2 = a /10 % 10;
        int ch3 = a % 10;
        System.out.println(ch1 * 100 + ch2 * 10 + ch3);
        System.out.println(ch1 * 100 + ch3 * 10 + ch2);
        System.out.println(ch2 * 100 + ch1 * 10 + ch3);
        System.out.println(ch2 * 100 + ch3 * 10 + ch1);
        System.out.println(ch3 * 100 + ch1 * 10 + ch2);
        System.out.println(ch3 * 100 + ch2 * 10 + ch1);
    }
}
