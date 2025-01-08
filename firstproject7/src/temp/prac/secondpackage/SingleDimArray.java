package temp.prac.secondpackage;

import java.util.Scanner;

public class SingleDimArray
{
	public void Arrays()
	{	
		
		String[] brands = new String[] {"adidas","nike","puma"};
		
		System.out.print(brands[1] + " ");
		System.out.print("is most successful amongst ");
		
		for(int i=0; i < brands.length; i++)
			{
				System.out.print(brands[i] + " ");
			}
		
		System.out.print("\n" + "\n" + "\n");
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Five Favourite footballers ?");
	
		String[] Football = new String[5];
	
		for(int i=0; i < Football.length; i++)
			{
				Football[i] = scan.nextLine();
			}
	
		scan.close();
		
		//Used Scanner class to input array elements at runtime.
		
		System.out.print("\n");
		System.out.println("Top 5:");
	
		//Below is the for-each loop. 'For each' array element, print the value of x(index).
		
		for(String x : Football)
			{
				System.out.print(x + "\t");
			}
	
		}
	
		public static void main(String[] args)
		{
			String[] FavMusic = {"Rock","Hard Rock","Heavy Metal","Hip Hop"};
			
			System.out.println("Favourite Music Genres:");
			
			for(String L : FavMusic)
				{
					System.out.print(L + "\t");
				}
			
			System.out.print("\n" + "\n" + "\n");
			
			SingleDimArray object = new SingleDimArray();
		
			object.Arrays();
		}
}
