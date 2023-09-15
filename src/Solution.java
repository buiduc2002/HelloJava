import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Equation has no integer solution");
            return;
        }

        int e = euclid(a, b);

        if (e == 1) {
            int x = a / e;
            int y = -b / e;
            System.out.println("x = " + x + ", y = " + y + "");
        } else {
            System.out.println("Equation has no positive integer solution");
            return;
        }
    }

    public static int euclid(int a, int b) {
        if (b == 0) return a;
        else return euclid(b, a % b);
    }
}
