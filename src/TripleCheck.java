import java.util.Scanner;

public class TripleCheck {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(tripleCheck(a, b, c));
    }

    public static boolean tripleCheck(int a, int b, int c) {
        // a <= b && b <= c || a >= b && b >= c
        if (a == b && a == c) {
            return true;
        } else {
            return false;
        }
    }
}



