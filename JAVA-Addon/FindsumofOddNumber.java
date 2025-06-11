import java.util.Scanner;

public class FindsumofOddNumber {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter how many odd numbers to sum: ");
	int no=sc.nextInt();
	int sum=0;
	for(int i=1;i<=(2*no-1);i=i+2) {
		sum+=i;
		
	}
	System.out.println("Sum of first "+no+" odd numbers is "+sum);
	
//	 * This program *ncalculates the sum of the first n odd integers 
//	 (Example: 1 + 3 + 5 + ... + (2n - 1)).
//	 
//	 Problem Flow:
//	Input n from user
//	Loop from 1 to (2n−1) in steps of 2
//	Accumulate the sum
//	Print the result
//	
//	Input / Output Example:
//	Input:
//	Enter how many odd numbers to sum: 5
//	Output:
//	Sum of first 5 odd numbers is 25
//	(1 + 3 + 5 + 7 + 9 = 25)
	
	
}}
