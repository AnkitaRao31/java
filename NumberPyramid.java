import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            for (int j = i; j < rows; j++) {

                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
           
            System.out.println();
        }

        sc.close();
    }
}

