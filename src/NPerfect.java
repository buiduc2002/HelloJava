import java.util.Scanner;

public class NPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NPerfect(n);
    }
public static boolean IsPerfect(int n) {
    int Sum = 0;
    if (n == 1) {
        return true;
    }

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

    public static void NPerfect (int n) {
        for (int i = 1; i < n; i++) {
            if (IsPerfect(i) ) {
                System.out.println(i) ;
            }

        }
       
       
    }
}