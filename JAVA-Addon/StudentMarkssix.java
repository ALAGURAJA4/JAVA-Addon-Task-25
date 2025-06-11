import java.util.Scanner;

public class StudentMarkssix {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
//	This program allows the user to enter 3 test marks of a student, 
//	 calculates the total and average, and displays the result.
//	 
//	Problem Flow:
//	Get 3 marks from user
//	Add marks → total
//	Divide total by 3.0 → average
//	Display total and average
//	
//	Input / Output Example:
//	Input:
//	Enter Mark 1: 80  
//	Enter Mark 2: 75  
//	Enter Mark 3: 85  
//	Output:
//	Total Marks   = 240  
//	Average Marks = 80.0
	
	System.out.println("Enter Mark 1:");
	double m1=sc.nextDouble();
	System.out.println("Enter Mark 2:");
	double m2=sc.nextDouble();
	System.out.println("Enter Mark 3:");
	double m3=sc.nextDouble();
	int total =(int) (m1+m2+m3);
	double Avg=(m1+m2+m3)/3.0;
	System.out.println("Total Marks = "+total);
	System.out.println("Average Marks = "+Avg);
	
}
}
