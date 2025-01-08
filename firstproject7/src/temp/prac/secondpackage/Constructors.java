package temp.prac.secondpackage;

public class Constructors
{
	
	//default or normal constructor
	
	int a;
	
	float b = 10.0f;
	
	public Constructors()
	{
		a = 10;
	}
	
	public void add()
	{
		int c = a + (int)b;
		System.out.println("Value of c is " + (double)c);
	}

	public static void main(String[] args)
	{
		Constructors object = new Constructors();
		
		object.add();	
	}

}
