import java.util.Scanner;

public class DegreeOneEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        double result = -b / a;
        if ( a == 0 && b == 0){
            System.out.println("Infinity");
        }
         else if (Double.isNaN(result) || result == Double.POSITIVE_INFINITY ||result == Double.NEGATIVE_INFINITY) {
            System.out.println("No solution");
        }
        else {
            System.out.println("Solution: " + result);
        }
    }
}
