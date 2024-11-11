import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String Input = sc.nextLine();

        
        String reversedInput = new StringBuilder(Input).reverse().toString();
        
        if (Input.equals(reversedInput)) {
            System.out.println(Input + " is a palindrome.");
        } else {
            System.out.println(Input + " is not a palindrome.");
        }
        
        sc.close();
    }

}