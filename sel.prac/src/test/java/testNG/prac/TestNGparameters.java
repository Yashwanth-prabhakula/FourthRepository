package testNG.prac;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automate.prac.BaseTest;

public class TestNGparameters extends BaseTest
{
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(@Optional("") String bname) throws Exception
  {
	  System.out.println("Execution has started.");
	  fileload();
	  openbrowser(bname);
	  openurl("imdb");
	  
  }
  
  
  @Test(invocationCount = 2)
  @Parameters("input")
  public void operation(Method mname, String searchword)
  {
	  System.out.println(mname.getName() + " is executing.");
	  entersearchkeyword("imdbsearch_id", searchword);
	  submitsearch("imdbsearchbutton_id");
  }
  
  
  /*@Test
  public void inherit(ITestContext con)
  {
	  String targetval = (String) con.getAttribute("element");//.toString();
	  System.out.println(targetval);
  }*/
  
  
  @AfterMethod
  public void afterMethod() throws Exception
  {
	  System.out.println("Execution has terminated.");
	  Thread.sleep(5000);
	  driver.close();
  }
  
}
