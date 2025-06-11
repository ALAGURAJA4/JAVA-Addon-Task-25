import java.util.Scanner;

public class FindTheSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

      

        System.out.print("Enter number 1: ");
        int smallest = sc.nextInt(); 
     
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

         
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("\nThe smallest number is: " + smallest);

        sc.close();
    }
}
