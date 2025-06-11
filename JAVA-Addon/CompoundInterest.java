import java.util.Scanner;

public class CompoundInterest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Pricipal(p): ");
	double p=sc.nextDouble();
	System.out.println("Enter the Rate(r) :");
	double r=sc.nextDouble();

	System.out.println("Enter the years(n) :");
	int n=sc.nextInt();

	double i=r/100;
	//Use formula F = P × (1 + i)^N
	double CI=p *Math.pow((i+1), n);
	
	System.out.printf("Compound Interest %.2f",CI);
	
	
}
}
