package testNG.prac;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DependsOnMethods
{
  @Test(dependsOnMethods = {"ready"})
  public void set()
  {
	  //Assert.fail("Method failed.");
	  //new SkipException("Method skipped.");
	  System.out.println("SET");
  }
  
  @Test(dependsOnMethods = {"set"}, alwaysRun = true)
  public void go()
  {
	  System.out.println("GO");
  }
  
  @Test
  public void ready()
  {
	  System.out.println("READY");
  }
  
}
