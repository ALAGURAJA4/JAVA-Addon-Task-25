import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the N value:");
	int n=sc.nextInt();
	long j=1;
	System.out.println("\nN  |  Factorial ");
	System.out.println("---------------------");
	
	for(int i=1;i<=n;i++) {
		j*=i;
		System.out.printf("%-3d| %12d%n",i,j);
		
	}
	
}
}




//
//This program reads a number n from the user and prints the 
//factorial of numbers from 1 to n in a table format.
//
//Problem Flow:
//Read n from user
//Start fact = 1
//Loop from 1 to n
//Multiply fact *= i
//Print each number with its factorial
//
//Sample Output:
//Input:
//Enter the N value: 5
//
//Output:
//N   |   Factorial
//--------------------
//	1  |            1
//	2  |            2
//	3  |            6
//	4  |           24
//	5  |          120