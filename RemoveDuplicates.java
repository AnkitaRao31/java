import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("Array after removing duplicates:");
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            for (int j = 0; j < i; j++) {
                
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }

            }
            
            if (!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}