import java.util.Scanner;

public class ThreeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sort(a, b, c);
    }
    // a b c -> 2 4 3
    // 2 3 4
    // Math.min(Math.min(2,Math.min(3,4)) , Math.max(3,4));
    //
    // 2 + 4 + 3 - max - min
    public static void sort(int a, int b, int c){
        int min = Math.min(a, Math.min(c, b));
        int max = Math.max(a, Math.max(c, b));
        int mid = a + b + c - max - min;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
      }
}