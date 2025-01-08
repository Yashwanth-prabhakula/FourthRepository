package prac.string.manipulation;

import java.util.Scanner;

public class StringCountWords
{

	public void count()
	{
		String text = "The number of words in this sentence is ";
		
		String[] textcount = text.trim().split("\s+");
		
		System.out.println(text + textcount.length);
	}
	
	public static void main(String[] args)
	{
		StringCountWords obj = new StringCountWords();
		obj.count();
		System.out.println("enter the line:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] WordsInS = s.trim().split("\s+");
		
		//"\s" is a regular expression for whitespace character. It acts as
		//- a delimiter. '\s+' finds more than one space. 
		//- This will split the string by one or more spaces, so 
		//- it will handle cases where there are extra spaces between words.
		
		//The split function turns a string into an array of elements, which
		//- allows us to convert a string into an string array.
		
		for(String x : WordsInS)
		{
			System.out.println(x);
		}
		System.out.println("The number of words in the string is " + WordsInS.length);
		scan.close();
		
	}

}
