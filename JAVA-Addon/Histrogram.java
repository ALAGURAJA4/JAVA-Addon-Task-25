import java.util.Scanner;

public class Histrogram {
public static void main(String[] args) {
	Scanner sc =new  Scanner(System.in);
	System.out.println("enter the num  of 5 :");
	int[] arr=new int[5];
	for(int i=0;i<5;i++) {
		arr[i]=sc.nextInt();		
		
	}
	for(int num:arr) {
		System.out.print(num+" ");
		for(int i=0;i<num;i++) {
			System.out.print("*");
		}
//		System.out.println();
	}
	sc.close();
}
}

