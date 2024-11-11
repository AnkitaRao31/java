import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String userInput = sc.nextLine();
        
        // Reverse the string
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed += userInput.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversed);
        
        sc.close();
    }
}