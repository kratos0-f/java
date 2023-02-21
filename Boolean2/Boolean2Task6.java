import java.util.Scanner;

public class Boolean2Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a1 = a % 10;
        int a2 = a / 10 % 10;
        int a3 = a / 100 % 10;
        int a4 = a / 1000 % 10;

        Boolean result1 = (Math.max(a1, a2) == Math.max(a2, a3) && Math.max(a3, a4) == Math.max(a2, a3) && Math.max(a1, a3) == Math.max(a1, a2) && Math.max(a2, a4) == Math.max(a1, a2)) && !(a1 == a2 && a2 == a3 && a3 == a4);
        Boolean result2 = (Math.min(a1, a2) == Math.min(a2, a3) && Math.min(a3, a4) == Math.min(a2, a3) && Math.min(a1, a3) == Math.min(a1, a2) && Math.min(a2, a4) == Math.min(a1, a2)) && !(a1 == a2 && a2 == a3 && a3 == a4);

        System.out.print(result1 || result2);
    }
}
