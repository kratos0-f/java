import java.util.Scanner;

public class ConditionalOperatorIf1Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int c1 = a % 10;
        int c2 = a/10%10;
        int c3 = a/100%10;
        int c4 = a/1000;

        int min = Math.min(c1, Math.min(c2, Math.min(c3, c4)));

        int cnt = 0;
        if (c1 == min) cnt++;
        if (c2 == min) cnt++;
        if (c3 == min) cnt++;
        if (c4 == min) cnt++;

        if (cnt == 1){
            System.out.print(min);
        } else {
            System.out.println(min);
            System.out.print(">1");
        }
    }
}
