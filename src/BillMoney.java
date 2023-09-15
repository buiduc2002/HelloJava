import java.util.Scanner;

public class BillMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        System.out.println(billMoney(number, m1, m2));
    }

    public static int billMoney(int x, int m1, int m2) {
        int n = 0;
        if (1 <= x && x <= 100) {
            n = x * m1;
        } else if (x > 100) {
            n = 100 * m1 + (x - 100) * m2;
        }
        return n;
    }
}
