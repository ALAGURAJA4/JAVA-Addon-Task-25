
import java.util.Scanner;

public class Arrayavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] arry=new int[n];
        int sum=0;
        for(int i=0;i<n;i++) {
        	arry[i]=sc.nextInt();
        	
        }
        for(int su:arry) {
        	sum+=su;
        }
        int avg =sum/n;
        System.out.println("average no is :"+avg);
        
    }
}
