import java.util.Scanner;

public class Palindrom {

    static boolean palindromdur(int n) {
        int orijinal = n;
        int ters = 0;
        while (n > 0) {
            ters = ters * 10 + n % 10;
            n /= 10;
        }
        return orijinal == ters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədəd daxil edin: ");
        int ədəd = sc.nextInt();
        System.out.println(ədəd + (palindromdur(ədəd) ? " palindromdur." : " palindrom deyil."));
        sc.close();
    }
}