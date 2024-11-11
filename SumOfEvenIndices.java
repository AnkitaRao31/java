import java.util.Scanner;

public class SumOfEvenIndices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int sum = 0;
        
        // Calculate the sum of elements at even indices
        for (int i = 0; i < n; i += 2) {
            sum += array[i];
        }
        
        System.out.println("The sum of elements at even indices is: " + sum);
        scanner.close();
    }
}