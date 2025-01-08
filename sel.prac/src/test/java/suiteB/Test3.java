package suiteB;

import org.testng.annotations.Test;

public class Test3
{
  @Test
  public void method3()
  {
	  System.out.println("Method 3" + " --- " + Thread.currentThread().getId());
  }
}
