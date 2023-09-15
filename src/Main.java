import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("num1 ");
        int num1 = scanner.nextInt();

        System.out.print("num2 ");
        int num2 = scanner.nextInt();

        if (gcd(num1, num2) == 1) {
            System.out.print("ngto cung nhau");

        } else {
            System.out.print("ko ngto cung nhau");
        }

        scanner.close();
    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int tmp = num2;
            num2 = num1 % num2;
            num1 = tmp;
        }
        return num1;
    
    }
}
