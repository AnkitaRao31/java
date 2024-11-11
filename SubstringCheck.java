import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        
        System.out.print("Enter the substring to check: ");
        String substring = sc.nextLine();

       
        if (mainString.contains(substring)) {

            System.out.println(substring + " is a substring of " + mainString);

        } 
        else {

            System.out.println(substring + " is not a substring of " + mainString);

        }

        sc.close();
    }
}
