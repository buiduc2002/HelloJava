import java.util.Scanner;

public class IsPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(IsPerfect(n));
    }

    public static boolean IsPerfect(int n) {
        int Sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                Sum += i;
            }
        }
        if (Sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
