import java.util.Scanner;

public class Flaging {
public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
      System.out.print("Enter Heat code (1-3): ");
      
      int flag = scanner.nextInt();

      String status;
      
      switch (flag) {
          case 1:
              status = "HOT";
              break;
          case 2:
              status = "LUKE WARM";
              break;
          case 3:
              status = "COLD";
              break;
          default:
              status = "OUT OF RANGE";
      }
      
      System.out.println("Flag " + flag + " is " + status);
      
      scanner.close();
  }
}


