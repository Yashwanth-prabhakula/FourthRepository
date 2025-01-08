package prac.string.manipulation;

import java.util.Scanner;

public class StringCharOccur
{

	public void occurrence()
	{
	
		String text = "The number of times the letter 'e' occurs in this line is ";
		
		//char x = 'e';
		
		int count = text.toLowerCase().length() - text.replace("e", "").length();
		
		
		System.out.println(text + count);
		
	}
	
	public static void main(String[] args)
	{
		StringCharOccur obj = new StringCharOccur();
		obj.occurrence();
		System.out.println("Enter the next string:");
		Scanner scan = new Scanner(System.in);
		String text1 = scan.nextLine();
		char charinque = scan.next().charAt(0);//next() finds and returns next token. charAt(i) returns value at index i.
		scan.close();
		char lowcharinque = Character.toLowerCase(charinque);//converting char to lowercase is slightly different to string.
		
		//String x = Character.toString(lowcharinque); In count1 use x in old char. Also works.

		//String.valueOf(lowcharinque) OR Character.toString(lowcharinque). BOTH WORK.
		
		//String.valueOf gives/returns the string representation of the specified value.
		
		int count1 = text1.toLowerCase().length() - 
				text1.replace(String.valueOf(lowcharinque), "").length();

		System.out.println("The number of occurrences of the character " + charinque + 
				" in the above string is " + count1);
	}

}
