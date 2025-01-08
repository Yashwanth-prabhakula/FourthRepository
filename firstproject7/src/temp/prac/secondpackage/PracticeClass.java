package temp.prac.secondpackage;

public class PracticeClass extends SingleDimArray
{
	
	public void temp()
	{
		method2();
	}
	
	public void method1()
	{
		temp();
		method2();
		System.out.println("Method Executed");
	}
	
	public static void method2()
	{
		System.out.println("Calling Static method");
	}

	public static void main(String[] args)
		{
			SingleDimArray object = new SingleDimArray();
			object.Arrays();
			//object.method1();
			PracticeClass object1 = new PracticeClass();
			object1.method1();
			object1.Arrays();
			
		}
}