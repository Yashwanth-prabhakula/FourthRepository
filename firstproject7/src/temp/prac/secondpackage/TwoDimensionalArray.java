package temp.prac.secondpackage;

import java.util.Scanner;

public class TwoDimensionalArray
{
	public void twodimarray()
	{
		Scanner scan = new Scanner(System.in);
		
		int[][] twodime = new int[3][3];
		
		System.out.println("Enter array elements:");
		
		for(int i=0; i < twodime.length; i++)
		{
			for(int j = 0; j < twodime.length; j++)
			{
				twodime[i][j] = scan.nextInt();
			}
		}
		
		scan.close();
		
		for(int[] x : twodime)
		{
			for(int y : x)
			{
				System.out.print(y + "\t");
			}
		
			System.out.print("\n");
		
		}
	}
	public static void main(String[] args)
	{
		int[][] twodime1 = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(twodime1.length);
		
		for(int i=0; i < twodime1.length; i++)
		{
			for(int j=0; j < twodime1.length; j++)
			{
				System.out.print(twodime1[i][j] + "\t");
			}
			
			System.out.print("\n");
			
		}
		
		TwoDimensionalArray obj = new TwoDimensionalArray();
		
		obj.twodimarray();
	}

}
