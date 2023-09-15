import java.util.Scanner;

public class Toan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e = scanner.nextInt();
        int d = scanner.nextInt();

        for (int x = 0; x <= e; x++) {
            for (int y = 0; y <= e - x; y++) {
                int z = e - x - y;
                // ax + by + cz = d
                if (z >= 0 && a * x + b * y + c * z == d) {
                    System.out.println("nghiệm x: " + x + ", nghiệm y: " + y + "nghiệm z: " + z);
                }
            }
        }
        if (a == 0 && b == 0 && c == 0 && e != 0) {
            System.out.println("Equation has no integer solution");

        }

        // ax + by = c
         a = scanner.nextInt();
         b = scanner.nextInt();
         c = scanner.nextInt();
         d =  scanner.nextInt();
        for (int x = 0; x <= c; x++) {
            int y = (c - x);
            if (a * x + b * y == d && y > 0) {
                System.out.println("Nghiệm x: " + x + ", Nghiệm y: " + y);
            }
        }
    }
}