import java.util.Scanner;

public class ConditionalOperatorIf2Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.print(a + " " + b + " " + c);
        } else if (a < c && c < b){
            System.out.print(a + " " + c + " " + b);
        } else if (b < c && c < a){
            System.out.print(b + " " + c + " " + a);
        } else if (b < a && a < c){
            System.out.print(b + " " + a + " " + c);
        } else if (c < a && a < b){
            System.out.print(c + " " + a + " " + b);
        } else {
            System.out.print(c + " " + b + " " + a);
        }
    }
}
