package suiteA;

import org.testng.annotations.Test;

public class Test1
{
  @Test
  public void method1()
  {
	  System.out.println("method 1" + " --- " + Thread.currentThread().getId());
  }
  
  @Test
  public void method10()
  {
	  System.out.println("method 10" + " --- " + Thread.currentThread().getId());
  }

  
}
