import java.util.Scanner;

public class Detailed_view {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text below");
		String str=sc.nextLine();
		
		int letters=0;
		int Digits=0;
		int spaces=0;
		int others=0;
		System.out.println(str.toCharArray());
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				Digits++;
				
			}
			else if (Character.isLetter(ch)) {
				letters++;
				
			}
			else if (Character.isWhitespace(ch)) {
				spaces++;
				
				
			}
			else {
				others++;
				
			}
			
			
		}
		System.out.println("Letters: " +letters);
		System.out.println("Digit: " +Digits);
		System.out.println("Space WHite: "+ spaces);
		System.out.println("others: " + others);
		sc.close();
	}

}

//

/**
 *  This program will read a line of text from the user, analyze 
 each character, and count how many are letters, digits, whitespace, 
 or other types of characters (like punctuation).
 
 Problem Flow:
Prompt the user to input a line of text.
Initialize counters for letters, digits, spaces, and other characters.
Loop through each character and classify it into one of the categories.
Display the count for each category: letters, digits, spaces, and others.

Sample Input / Output:
Input:
Enter the text below:
Hello World! 123

Output:
Letters : 10
Digits : 3
Space Chars : 2
Others : 2**/