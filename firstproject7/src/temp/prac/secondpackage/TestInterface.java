package temp.prac.secondpackage;

public interface TestInterface
{
	
	public void method1();
	
	public void method2();

	public static void method3()
	{
		System.out.println("Calling static method from interface");
	}
	
	public default void method4()
	{
		System.out.println("This is a default method.");
		method5();
	}
	
	private void method5()
	{
		System.out.println("This is a private method");
	}
	
}
