import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for number of lines
        System.out.print("How many Lines? ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++) {
        	
        	for(int j=1;j<=n-i;j++) {
        		System.out.print(" ");
        		
        	}
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	   System.out.println();
        
        }
     
        }
        
        
        
        
        
}
//

