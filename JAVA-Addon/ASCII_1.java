import java.util.Scanner;

public class ASCII_1 {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter a Five letter word: ");
String str=sc.next();
if(str.length()!=5){
	System.out.println("enter only 5 letters");
	return;
	
	
}
StringBuilder sb=new StringBuilder();

for(int i=0;i<str.length();i++) {
	char c=str.charAt(i);
	char newchar=(char) (c-1);
	sb.append(newchar);
}
System.out.println("Encoded Word: "+ sb.toString());

sc.close();

//        
       
//* This program reads a five-letter word from the user and encodes 
//it by subtracting 1 from the ASCII value of each character. 
//It then prints the newly encoded word.
//
//Problem Flow:
//Get 5-letter word input
//Loop each character → subtract 1 from ASCII
//Build new string with changed characters
//Print encoded result
//
//Input / Output Example:
//Input:
//Enter a Five letter word: white
//Output:
//Encoded Word: vghsd

}
	
}
