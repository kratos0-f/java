import java.util.Scanner;

public class Boolean3Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean a = scanner.nextBoolean();
        Boolean b = scanner.nextBoolean();
        Boolean c = scanner.nextBoolean();


        System.out.println(a && !b);
        System.out.println(!a && b && !c);
        System.out.println((a && b && c) || (!a && !c));
        System.out.println((a && !b && !c) || (!a && !b && c));
        System.out.println((!a && c) || (a && b));
    }
}
