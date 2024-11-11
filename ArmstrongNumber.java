import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int digit, result = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int originalNumber = number;
        int count = 0;

        while (originalNumber != 0){
            
            originalNumber /= 10;
            count++;
        } 
        
        originalNumber = number;
        
        while (originalNumber != 0) 
        {
            digit = originalNumber % 10;
            result += Math.pow(digit,count);
            originalNumber /= 10;
        }
        
  
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}
