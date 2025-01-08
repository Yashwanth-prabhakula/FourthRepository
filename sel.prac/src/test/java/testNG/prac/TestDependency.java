package testNG.prac;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestDependency //ITestContext
{
	
  @Test
  public void func1(ITestContext con)
  {
	  String info = "xyz123456";
	  con.setAttribute("element", info);
  }
  
  @Test
  public void func2(ITestContext con)
  {
	  String targetval = (String) con.getAttribute("element");//.toString();
	  System.out.println(targetval);
  }
  
}
