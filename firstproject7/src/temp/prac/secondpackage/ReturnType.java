package temp.prac.secondpackage;

import java.util.Arrays;

public class ReturnType
{
	
	int[] a = {1,2};
	
	public void print()
	{
		System.out.println("Void doesn't return any value");
	}
	
	public int[] multiplesof2()
	{
		int[] multiples = {2,4,6,8,10};
		return multiples;
	}
	
	public int[] multiplesof3()
	{
		
		int a = 3;
		int b = 6;
		int c = 9;
		int d = 12;
		int e = 15;
		return new int[] {a, b, c, d, e}; //Looks like array definition.
		
	}	// int[] multiplesof3 = new int[] {...};

	public static void main(String[] args)
	{
		ReturnType obj = new ReturnType();
		
		obj.print();
		
		int[] var1 = obj.multiplesof2(); //Array from this method is assigned to var1.
		System.out.println(Arrays.toString(var1)); //Returns string representation of array elements.
		
		int[] var2 = obj.multiplesof3(); //Array from this method is assigned to var2.
		//System.out.println(Arrays.toString(var2));
		for(int i = 0; i < var2.length; i++)
		{
			System.out.print(var2[i] + "\t");
		}
	}

}
