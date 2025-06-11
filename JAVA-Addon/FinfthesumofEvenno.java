import java.util.Scanner;

public class FinfthesumofEvenno {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper limit for even sum: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        
        System.out.println("Sum of even numbers from 2 to " + n + " = " + sum);

        sc.close();
    }
}
