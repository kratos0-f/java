import java.util.Scanner;

public class ConditionalOperatorIf2Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        // number a
        int a_1 = a%10;
        int a_2 = a/10%10;
        int a_3 = a/100%10;
        int a_4 = a/1000;
        int a_max_4 = Math.max(a_1, Math.max(a_2, Math.max(a_3, a_4)));
        int a_max_1 = Math.min(a_1, Math.min(a_2, Math.min(a_3, a_4)));
        int a_max_2 = 0;
        int a_max_3 = 0;
        if (a_1 == a_max_4){  // a1 - max
            if (a_2 == a_max_1){ // a2 - min
                a_max_2 = Math.min(a_3, a_4);
                a_max_3 = Math.max(a_3, a_4);
            } else if (a_3 == a_max_1){ // a3 - min
                a_max_2 = Math.min(a_2, a_4);
                a_max_3 = Math.max(a_2, a_4);
            } else { // a4 - min
                a_max_2 = Math.min(a_2, a_3);
                a_max_3 = Math.max(a_2, a_3);
            }
        } else if (a_2 == a_max_4){ // a2 - max
            if (a_1 == a_max_1){ // a1 - min
                a_max_2 = Math.min(a_3, a_4);
                a_max_3 = Math.max(a_3, a_4);
            } else if (a_3 == a_max_1){ // a3 - min
                a_max_2 = Math.min(a_1, a_4);
                a_max_3 = Math.max(a_1, a_4);
            } else { // a4 - min
                a_max_2 = Math.min(a_1, a_3);
                a_max_3 = Math.max(a_1, a_3);
            }
        } else if (a_3 == a_max_4){  // a3 - max
            if (a_1 == a_max_1){ // a1 - min
                a_max_2 = Math.min(a_2, a_4);
                a_max_3 = Math.max(a_2, a_4);
            } else if (a_2 == a_max_1){ // a2 - min
                a_max_2 = Math.min(a_1, a_4);
                a_max_3 = Math.max(a_1, a_4);
            } else { // a4 - min
                a_max_2 = Math.min(a_1, a_2);
                a_max_3 = Math.max(a_1, a_2);
            }
        } else if (a_4 == a_max_4){ // a4 - max
            if (a_1 == a_max_1){ // a1 - min
                a_max_2 = Math.min(a_2, a_3);
                a_max_3 = Math.max(a_2, a_3);
            } else if (a_2 == a_max_1){ // a2 - min
                a_max_2 = Math.min(a_1, a_3);
                a_max_3 = Math.max(a_1, a_3);
            } else { // a3 - min
                a_max_2 = Math.min(a_1, a_2);
                a_max_3 = Math.max(a_1, a_2);
            }
        }
        int a_sort = a_max_4 * 1000 + a_max_3 * 100 + a_max_2 * 10 + a_max_1;





        // number b
        int b_1 = b%10;
        int b_2 = b/10%10;
        int b_3 = b/100%10;
        int b_4 = b/1000;
        int b_max_4 = Math.max(b_1, Math.max(b_2, Math.max(b_3, b_4)));
        int b_max_1 = Math.min(b_1, Math.min(b_2, Math.min(b_3, b_4)));
        int b_max_2 = 0;
        int b_max_3 = 0;
        if (b_1 == b_max_4){  // b1 - max
            if (b_2 == b_max_1){ // b2 - min
                b_max_2 = Math.min(b_3, b_4);
                b_max_3 = Math.max(b_3, b_4);
            } else if (b_3 == b_max_1){ // b3 - min
                b_max_2 = Math.min(b_2, b_4);
                b_max_3 = Math.max(b_2, b_4);
            } else { // b4 - min
                b_max_2 = Math.min(b_2, b_3);
                b_max_3 = Math.max(b_2, b_3);
            }
        } else if (b_2 == b_max_4){ // b2 - max
            if (b_1 == b_max_1){ // b1 - min
                b_max_2 = Math.min(b_3, b_4);
                b_max_3 = Math.max(b_3, b_4);
            } else if (b_3 == b_max_1){ // b3 - min
                b_max_2 = Math.min(b_1, b_4);
                b_max_3 = Math.max(b_1, b_4);
            } else { // b4 - min
                b_max_2 = Math.min(b_1, b_3);
                b_max_3 = Math.max(b_1, b_3);
            }
        } else if (b_3 == b_max_4){  // b3 - max
            if (b_1 == b_max_1){ // b1 - min
                b_max_2 = Math.min(b_2, b_4);
                b_max_3 = Math.max(b_2, b_4);
            } else if (b_2 == b_max_1){ // b2 - min
                b_max_2 = Math.min(b_1, b_4);
                b_max_3 = Math.max(b_1, b_4);
            } else { // b4 - min
                b_max_2 = Math.min(b_1, b_2);
                b_max_3 = Math.max(b_1, b_2);
            }
        } else if (b_4 == b_max_4){ // b4 - max
            if (b_1 == b_max_1){ // b1 - min
                b_max_2 = Math.min(b_2, b_3);
                b_max_3 = Math.max(b_2, b_3);
            } else if (b_2 == b_max_1){ // b2 - min
                b_max_2 = Math.min(b_1, b_3);
                b_max_3 = Math.max(b_1, b_3);
            } else { // b3 - min
                b_max_2 = Math.min(b_1, b_2);
                b_max_3 = Math.max(b_1, b_2);
            }
        }
        int b_sort = b_max_4 * 1000 + b_max_3 * 100 + b_max_2 * 10 + b_max_1;




        // number c
        int c_1 = c%10;
        int c_2 = c/10%10;
        int c_3 = c/100%10;
        int c_4 = c/1000;
        int c_max_4 = Math.max(c_1, Math.max(c_2, Math.max(c_3, c_4)));
        int c_max_1 = Math.min(c_1, Math.min(c_2, Math.min(c_3, c_4)));
        int c_max_2 = 0;
        int c_max_3 = 0;
        if (c_1 == c_max_4){  // c1 - max
            if (c_2 == c_max_1){ // c2 - min
                c_max_2 = Math.min(c_3, c_4);
                c_max_3 = Math.max(c_3, c_4);
            } else if (c_3 == c_max_1){ // c3 - min
                c_max_2 = Math.min(c_2, c_4);
                c_max_3 = Math.max(c_2, c_4);
            } else { // c4 - min
                c_max_2 = Math.min(c_2, c_3);
                c_max_3 = Math.max(c_2, c_3);
            }
        } else if (c_2 == c_max_4){ // c2 - max
            if (c_1 == c_max_1){ // c1 - min
                c_max_2 = Math.min(c_3, c_4);
                c_max_3 = Math.max(c_3, c_4);
            } else if (c_3 == c_max_1){ // c3 - min
                c_max_2 = Math.min(c_1, c_4);
                c_max_3 = Math.max(c_1, c_4);
            } else { // c4 - min
                c_max_2 = Math.min(c_1, c_3);
                c_max_3 = Math.max(c_1, c_3);
            }
        } else if (c_3 == c_max_4){  // c3 - max
            if (c_1 == c_max_1){ // c1 - min
                c_max_2 = Math.min(c_2, c_4);
                c_max_3 = Math.max(c_2, c_4);
            } else if (c_2 == c_max_1){ // c2 - min
                c_max_2 = Math.min(c_1, c_4);
                c_max_3 = Math.max(c_1, c_4);
            } else { // c4 - min
                c_max_2 = Math.min(c_1, c_2);
                c_max_3 = Math.max(c_1, c_2);
            }
        } else if (c_4 == c_max_4){ // c4 - max
            if (c_1 == c_max_1){ // c1 - min
                c_max_2 = Math.min(c_2, c_3);
                c_max_3 = Math.max(c_2, c_3);
            } else if (c_2 == c_max_1){ // c2 - min
                c_max_2 = Math.min(c_1, c_3);
                c_max_3 = Math.max(c_1, c_3);
            } else { // c3 - min
                c_max_2 = Math.min(c_1, c_2);
                c_max_3 = Math.max(c_1, c_2);
            }
        }
        int c_sort = c_max_4 * 1000 + c_max_3 * 100 + c_max_2 * 10 + c_max_1;

        System.out.print(Math.max(a_sort, Math.max(b_sort, c_sort)));
    }
}
