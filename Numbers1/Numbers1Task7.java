import java.util.Scanner;

public class Numbers1Task7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        System.out.print((a / 100) * 1 + (a % 10) * 100 + (a % 100 / 10) * 10);
    }
}


