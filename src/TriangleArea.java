import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double  a = sc.nextDouble();
        double  b = sc.nextDouble();
        double  c = sc.nextDouble();

        System.out.println(IsSides(a,b,c));
        System.out.println(area(a, b, c));
    }

    public static double area(double a, double b, double c) {
        double  q = (a + b + c)/2;
        return Math.sqrt(q * (q - a) * (q - b) * (q - c));
    }

    public static boolean IsSides(double a, double b, double c) {
        return (a + b > c || a + c > b || c + b > a);
    }

}


