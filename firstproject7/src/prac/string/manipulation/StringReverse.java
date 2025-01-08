package prac.string.manipulation;

public class StringReverse
{
	public void revstr()
	{
		String x = "0-malayalam-1";
		char[] arr_x = x.toCharArray();
		for(int i = arr_x.length - 1; i >= 0; i--)
		{
			System.out.print(arr_x[i]);
		}
	}
	
	public static void main(String[] args)
	{
		StringReverse obj = new StringReverse();
		StringBuffer buff = new StringBuffer("0-tenet-1");
		System.out.println(buff.reverse());
		obj.revstr();
	}

}
