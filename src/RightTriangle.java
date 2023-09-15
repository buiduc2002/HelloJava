import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(IsSides(a, b, c));
        System.out.println(IsRightTriangle(a, b, c));
    }

    public static boolean IsRightTriangle(double a, double b, double c) {
        if (c > a && c > b) {
            return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
        } else if (a > c && a > b) {
            return Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2);
        } else if (b > a && b > c) {
            return Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
        }
        return false;
    }
     

    public static boolean IsSides(double a, double b, double c) {
        return (a + b > c || a + c > b || c + b > a);
    }

}

