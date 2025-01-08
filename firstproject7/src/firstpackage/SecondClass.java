package firstpackage;

public class SecondClass
{
	
	void main1()
	{
		System.out.println("temp");
	}
		
	public static void main(String[] args)
	{
		SecondClass object2 = new SecondClass();
		FirstClass childobj = new FirstClass();
		childobj.print();
		object2.main1();
		FirstClass.display();
	}

}
