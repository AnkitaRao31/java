import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Reverse the array
        int start = 0;
        int end = n - 1;
        while (start < end) {
            // Swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move towards the middle
            start++;
            end--;
        }
        
        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        scanner.close();
    }
}
