import java.util.Scanner;

public class Doubleforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double G = 6.67408 * Math.pow(10, -11);
        double Mass1 = sc.nextDouble();
        double Mass2 = sc.nextDouble();
        double r = sc.nextDouble();

        //double a = 35.74 + 0.6215 * Mass1 + (0.4275 * Mass2 - 35.75)* Math.pow(v,0.16);
        double a = (G * Mass1 * Mass2) / (r * r);
        System.out.println(a);
    }
}
