import java.util.Scanner;

public class ConditionalOperatorIf2Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum_a = a%10 + a/10%10 + a/100;
        int sum_b = b%10 + b/10%10 + b/100;

        if(sum_a > sum_b){
            System.out.print("1");
        } else if (sum_b > sum_a){
            System.out.print("2");
        } else {
            System.out.print("РАВНЫ");
        }
    }
}
