import java.util.HashMap;
import java.util.Scanner;

public class StringSubsetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the subset string
        System.out.print("Enter the first string (subset): ");
        String subset = scanner.nextLine();
        
        // Prompt the user for the superset string
        System.out.print("Enter the second string (superset): ");
        String superset = scanner.nextLine();
        
        // Check if the subset is contained in the superset
        boolean isSubset = checkSubset(subset, superset);
        
        // Print the result
        if (isSubset) {
            System.out.println("\"" + subset + "\" is a subset of \"" + superset + "\".");
        } else {
            System.out.println("\"" + subset + "\" is NOT a subset of \"" + superset + "\".");
        }
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }

    // Method to check if the first string is a subset of the second string
    public static boolean checkSubset(String subset, String superset) {
        // Create a HashMap to count character occurrences in the superset
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count each character in the superset
        for (char c : superset.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check each character in the subset
        for (char c : subset.toCharArray()) {
            // If the character is not in the superset or not enough occurrences, return false
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false; // Subset not found
            }
            // Decrease the count of the character in the superset
            charCount.put(c, charCount.get(c) - 1);
        }

        return true; // All characters of subset are found in the superset
    }
}
