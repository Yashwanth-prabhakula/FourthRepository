package temp.prac.secondpackage;

public class ModifiersClass
{
	//non access modifier
	static int a = 5;

	static void print()
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		a = 10;
		print();
	}

}
