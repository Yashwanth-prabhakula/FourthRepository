package temp.prac.secondpackage;

public class PracForLoop
{
	
	public void forlooprev()
	{
		int[] intarr = {0,1,2,3,4,5,6,7,8,9};
		for(int i = 9; i >= 0; i--)
		{
			System.out.print(intarr[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		PracForLoop obj = new PracForLoop();
		obj.forlooprev();
	}

}
