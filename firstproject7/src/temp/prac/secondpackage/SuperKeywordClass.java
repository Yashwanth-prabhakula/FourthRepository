package temp.prac.secondpackage;

public class SuperKeywordClass extends Constructors
{
	//'super' and 'this' keywords.
	
	int a = 100;
	int b = 900;
	int c = (int)super.b;
	
	public void add()
	{
		super.add();
		System.out.println("Adding child class and parent class variables.");
		System.out.println((a + super.a) + " and " + (b + super.b) + " and " + c + "\n");
	}
	
	public void subtract()
	{
		//this.b calls the global var b. Without 'this' b only refers to local var.
		int b = 50;
		int sub = b - this.b;
		System.out.println("Local variable - Global variable = " + sub);
	}
	
	public static void main(String[] args)
	{
		SuperKeywordClass o = new SuperKeywordClass();
		o.add();
		o.subtract();
	}

}
