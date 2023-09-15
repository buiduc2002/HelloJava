
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter end number: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The primes are: ");

        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
           int count = 0;
           int num = 1;
        while (count <= m) {
            if (isPrime(num)) {
                count++;
                System.out.print(num + " ");

            }
        num++;
            
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        int count = 0;
        if (num == 1) return true;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;
        return count == 2;
    }
}
    


