package firstpackage;

public class FirstClass
{

int x = 10;
int y = 100;
static int z = 200;

int p,q,r;

int a,b,c;

static void display()
	{
		System.out.println("Calling static method directly");
	}

public void print()
	{
		System.out.println(z);
	}

	public static void main(String[] args)
	{
		FirstClass object1 = new FirstClass();
		object1.print();
		System.out.println(object1.x);
		display();
		System.out.println("Calling static variable directly. It's value is " + FirstClass.z + ".");
	}
}
