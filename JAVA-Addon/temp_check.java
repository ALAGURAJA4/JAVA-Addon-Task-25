import java.util.Scanner;

public class temp_check {
public static void main(String[] args) {
	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the water temperature: ");
	        double temp = scanner.nextDouble();

	        String state;
	        if (temp < 0) {
	            state = "ICE";
	        } else if (temp <= 100) {
	            state = "WATER";
	        } else {
	            state = "STEAM";
	        }
System.out.printf("	Water status is %s for the Temperature %.2f",state,temp);
	      
	    }
	}


