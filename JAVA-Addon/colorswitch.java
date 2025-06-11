import java.util.Scanner;

public class colorswitch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Color code character: ");
        char colour = scanner.next().charAt(0); // Read the first character

        String colorName;
        switch (colour) {
            case 'r':
            case 'R':
                colorName = "RED";
                break;
            case 'g':
            case 'G':
                colorName = "GREEN";
                break;
            case 'b':
            case 'B':
                colorName = "BLUE";
                break;
            default:
                colorName = "BLACK";
        }

        System.out.println("Color Code " + colour + " is " + colorName);
        scanner.close();
    }
}
