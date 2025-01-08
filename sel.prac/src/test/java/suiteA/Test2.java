package suiteA;

import org.testng.annotations.Test;

public class Test2
{
  @Test
  public void method2()
  {
	  System.out.println("Method 2" + " --- " + Thread.currentThread().getId());
  }
}
