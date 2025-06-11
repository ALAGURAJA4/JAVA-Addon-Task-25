import java.util.Scanner;

public class Simple_Interest {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Pricipal(p): ");
	double p=sc.nextDouble();
	System.out.println("Enter the Rate(r) :");
	double r=sc.nextDouble();

	System.out.println("Enter the years(n) :");
	double n=sc.nextDouble();

	double SI=(p*r*n)/100;
	
	System.out.printf("Simple Interest =%.2f",SI);
	sc.close();
	
}
}
