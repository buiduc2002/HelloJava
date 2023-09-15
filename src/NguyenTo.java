import java.util.Scanner;

public class NguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of primes (N): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] primeNumbers = new int[m];

    public static boolean isPrime(int m) {
        if (m == 1)
            return true;
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }
}

    Arrays.sort(primeNumbers);

    for(

    int i = 0;i<primeNumbers.length;i++)
    {
        System.out.print(primeNumbers[i] + "\t");
    }

    System.out.println();

    scanner.close();
}
}
