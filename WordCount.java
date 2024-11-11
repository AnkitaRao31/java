import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        String[] words = input.trim().split("\\s+");
        
        int wordCount = words.length;
        
        if (input.trim().isEmpty()) {
            wordCount = 0;
        }
        
        System.out.println("Number of words: " + wordCount);
        
        sc.close();
    }
}
