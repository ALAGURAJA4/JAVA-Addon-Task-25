import java.util.Scanner;

public interface Primeprint {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("How many Prime numbers? ");
	        int n = sc.nextInt();

	        int count = 0;  // To count the number of primes found
	        int num = 2;    // Starting from the first prime number

	        while (count < n) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	                count++;
	            }
	            num++;
	        }

	        sc.close();
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
