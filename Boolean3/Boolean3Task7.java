import java.util.Scanner;

public class Boolean3Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean a = scanner.nextBoolean();
        Boolean b = scanner.nextBoolean();
        Boolean c = scanner.nextBoolean();
        Boolean d = scanner.nextBoolean();


        System.out.println(a && b);
        System.out.println(!a && !b && c);
        System.out.println(a && !b && !d);
        System.out.println(b && d && !c);
        System.out.println((a && d) || (!a && !c));
        System.out.println((!b && c && !d) || (!b && !c && d));
        System.out.println((!a && b && !c && !d) || (a && !b && c));
        System.out.println((a && b && !d) || (a && b && c));
    }
}
