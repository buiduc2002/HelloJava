import java.util.Scanner;

public class Toan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Chickens: ");
        int chickens = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of Dogs: ");
        int dogs = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of feet: ");
        int feet = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of horns: ");
        int horns = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The number of chickens is: " + chickens);
        System.out.println("The number of dogs is: " + dogs);
        System.out.println("The number of feet is: " + feet);
        System.out.println("The number of horns is: " + horns);

        // Solves for the chickens and horns
        int f ;
        int a = chickens;
        int b = goats - a;
        int c = goats * f;
        int d = dogs * f;
        int e = f;
    
        if (a > 0 && f > 0) {
            f = (b / c) - 1;
            System.out.println("There are " + a + " chickens and " + c + " horns.");
        } else if (a > 0) {
            f = (b / c) - 1;
            System.out.println("There are " + a + " chickens.");
        } else {
            System.out.println("There are " + b + " goats.");
        }

        // Solves for the dogs and horns
        int f = horns - c;
        a = chickens;
        b = dogs - a;
        c = dogs * f;

