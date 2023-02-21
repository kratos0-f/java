import java.util.Scanner;

public class Boolean2Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a1 = a % 10;
        int a2 = a / 10 % 10;
        int a3 = a / 100 % 10;
        int a4 = a / 1000 % 10;

        
        System.out.print(Math.max(a1, Math.max(a2, Math.max(a3, Math.max(a4, a5)))) == Math.min(a1, Math.min(a2, Math.min(a3, a4))));
    }
}
