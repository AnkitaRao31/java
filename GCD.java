import java.util.Scanner;

public class GCD {

    public static int findGCD(int a, int b) {
        // Ensure a is the larger number
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        //Euclidean Algo
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User input
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        // Finding GCD
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        sc.close();
    }
}
