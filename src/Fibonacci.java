import java.util.Scanner;

public class Fibonacci {

    static void fibonacci(int n) {
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long novbeti = a + b;
            a = b;
            b = novbeti;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Neçə element çap olunsun: ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}