package temp.prac.secondpackage;

public class ChildConstructor extends ParentConstructor
{

	public ChildConstructor(int a, int b, String c)
	{
		super(a, b, c);
	}


	int a = 100;
	int b = 200;
	
	public void addi()
	{
		super.add();
		System.out.println(super.a + super.b);
	}
	
	
	public static void main(String[] args)
	{
		ChildConstructor object1 = new ChildConstructor(1,2,"abc");
		object1.add();
		object1.print();
	}

}
