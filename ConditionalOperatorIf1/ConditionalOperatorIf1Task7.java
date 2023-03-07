import java.util.Scanner;

public class ConditionalOperatorIf1Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int a_avg = (a%10 + a/10%10 + a/100%10 + a/1000);
        int b_avg = (b%10 + b/10%10 + b/100%10 + b/1000);
        int c_avg = (c%10 + c/10%10 + c/100%10 + c/1000);

        int  max_avg = Math.max(a_avg, Math.max(b_avg, c_avg));

        if (a_avg == max_avg){
            System.out.print(a);
        } else if (b_avg == max_avg){
            System.out.print(b);
        } else {
            System.out.print(c);
        }

    }
}
