import java.util.Scanner;

public class Numbers2Task6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println((a / 1000) * 1000 + (a / 100 % 10) * 0 + (a / 10 % 10) * 10 + (a % 10) * 1);
    }
}
