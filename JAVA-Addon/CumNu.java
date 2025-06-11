import java.util.Scanner;

public class CumNu {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("How many nu you want to multiply");
int no=sc.nextInt();
double cum = 1;
for(int i=1;i<=no;i++) {
	System.out.println("enter the numbers: ");
	double num=sc.nextDouble();
	cum=cum*num;
}
System.out.printf("cum outp %.2f",cum);

	
}
}
//6.2
//Enter number 2: 12.3
//Enter number 3: 5.0
//Enter number 4: 18.8
//Enter number 5: 7.1
//Enter number 6: 12.8