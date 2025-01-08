package suiteB;

import org.testng.annotations.Test;

public class Test4
{
  @Test
  public void method4()
  {
	  System.out.println("Method 4" + " --- " + Thread.currentThread().getId());
  }
}
