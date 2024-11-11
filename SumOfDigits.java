import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0;

        number = Math.abs(number);
        
        
        while (number != 0) {
            sum += number % 10; 
            number /= 10;       
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}