import java.util.*;

// Reverse an array

public class Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // Print entered array
        System.out.println("Entered elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Reverse array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Print reversed array
        System.out.println("\nReversed array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}