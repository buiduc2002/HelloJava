import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(divisibility(a, b));
    }



    public static boolean divisibility(int a, int b) {
        if (a % 7 == 0 && b % 7 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}