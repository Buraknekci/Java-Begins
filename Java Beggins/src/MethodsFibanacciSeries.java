import java.util.Scanner;

public class MethodsFibanacciSeries {

    static int fib(int n) {
        int a = 0, b = 1, c;
        // Assume that a (0) is the first and b (1) is the second element of the
        // fibonacci series.
        if (n == 0)
            return a;
        else if (n == 1) {
            System.out.print(a);
            return a;
        } else if (n == 2) {
            System.out.print(a + ", " + b);
            return b;
        } else {
            System.out.print(a + ", " + b + ", ");
            for (int i = 2; i < n; i++) {

                c = a + b;
                a = b;
                b = c;
                System.out.print(b + ", ");
            }
            return b;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        System.out.println("\n" + n + "th element of fibonacci series is " + fib(n));
    }

}



