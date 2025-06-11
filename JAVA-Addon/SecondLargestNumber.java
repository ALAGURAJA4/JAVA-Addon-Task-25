import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        // Ensure the array has at least two elements
        if (n < 2) {
            System.out.println("At least two numbers are required.");
            return;
        }

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Read the numbers into the array
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize largest and second largest
        int largest = numbers[0]; //0
        int secondLargest = numbers[0]; //0

        // Find the largest and second largest
        for (int num : numbers) {
            if (num > largest) {//1>0,2>1
                secondLargest = largest; //0 ,1
                largest = num;	//1,2
            }
            else if (num > secondLargest && num != largest) { 
            	//
            	
            	
                secondLargest = num;//
            }
        }

        // Check if the second largest was updated
        if (largest == secondLargest) {
            System.out.println("No valid second largest number found (all numbers may be the same).");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }

        sc.close();
    }
}
