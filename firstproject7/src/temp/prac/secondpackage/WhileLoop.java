package temp.prac.secondpackage;

public class WhileLoop implements TestInterface
{
	
	public void method1()
	{
		System.out.println("Implement method1");
	}
	
	public void method2()
	{
		System.out.println("Implement method2");
	}
	
public static void main(String[] args)
	{
	
	WhileLoop object = new WhileLoop();
	
	object.method1();
	
	object.method2();
		
	TestInterface.method3();
	
	}
}
