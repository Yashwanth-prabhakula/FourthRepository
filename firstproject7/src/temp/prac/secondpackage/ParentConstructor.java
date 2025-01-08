package temp.prac.secondpackage;

public class ParentConstructor
{

	//Initializing variables through child class constructor 
	
	int a;
	int b;
	String c;
	String d;
	
	public ParentConstructor()
	{
		System.out.println("This is a default constructor");
	}
		
	public ParentConstructor(int a, int b, String c)
	{
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public ParentConstructor(String d)
	{
		super();
		this.d = d;
		System.out.println(d);
	}
	
	public void add()
	{
		System.out.println("Parent class add method:" + (a + b));
	}
	
	public void print()
	{
		System.out.println(a + " and " + b + " and " + c);
	}

	public static void main(String[] args)
	{
		ParentConstructor obj = new ParentConstructor("xyz");
		ParentConstructor obj1 = new ParentConstructor();
	}

}
