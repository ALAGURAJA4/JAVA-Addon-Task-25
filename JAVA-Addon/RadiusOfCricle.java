import java.util.Scanner;

public class RadiusOfCricle {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Radius of the Circle: ");
	double radius=sc.nextDouble();
	double pi=(22.0/7.0)*radius*radius;
	System.out.printf("The area of the Circle %.4f is %.4f ",radius,pi);

}
}
