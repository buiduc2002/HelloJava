import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 2, 5, 6 };
        int[] arr = new int[4];
        // arr = {0, 0, 0, 0}
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Bubble sort
        // 4 1 2 3
        // 1 4 2 3
        // 1 2 4 3
        // 1 2 3 4



        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        // 1 2 3 4
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }
}
