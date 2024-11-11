import java.util.Scanner;

public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length; // n is the size of the array
        int expectedSum = n * (n + 1) / 2; // Sum of the first n natural numbers
        int actualSum = 0;

        // Calculate the sum of the elements in the array
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // Input the array elements
        System.out.println("Enter " + n + " distinct numbers from 0 to " + n + ":");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Find and print the missing number
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);

        // Close the scanner
        scanner.close();
    }
}
