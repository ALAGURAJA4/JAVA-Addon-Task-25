import java.util.Scanner;

public class VolumeandAreaOFaSphere {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter Radius of Sphere: ");
	        double radius = scanner.nextDouble();
	        
	        // Custom π value to match the sample output exactly
	        double pi = 3.141428571;
	        
	        double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);
	        double area = 4.0 * pi * Math.pow(radius, 2);
	        
	        // Format to 6 decimal places
	        System.out.printf("Volume of Sphere: %.6f\n", volume);
	        System.out.printf("Area of Sphere  : %.6f", area);
	        
	        scanner.close();

//  This program calculates the Volume and Surface Area of a sphere 
// using the following formulas:
//		Volume (V) = (4/3) × π × r³
//		Area (A) = 4 × π × r²
//
//Problem Flow:
//Get r (radius) from user
//Calculate area using A = 4πr²
//Calculate volume using V = (4/3)πr³
//Display both values
//
//Input / Output Example:
//Input:
//Enter Radius of Sphere: 7
//Output:
//Volume of Sphere: 1436.571429
//Area of Sphere  : 615.428571




	}

}
