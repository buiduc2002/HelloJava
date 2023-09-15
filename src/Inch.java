import java.util.Scanner;

public class Inch {
    public static void main(String[] args) {
        // int a = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(((a + b + c) / 3) * 39.37);
        
    }
}
