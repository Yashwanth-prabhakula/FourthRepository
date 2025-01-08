package testNG.prac;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest
{  
	
	String cname = this.getClass().getSimpleName();
	
  @Test (priority = 4, enabled = false) //By default enabled is true on tests. Implicitly.
  public void dummyMethod()
  {
	  System.out.println("This is a dummy method.");
  }
	
  @Test(priority = 3)
  public void operation3(Method mname)
  {
	  System.out.println(cname + " - " + mname.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 1)
  public void operation1(Method mname)
  {
	  System.out.println(cname + " - " + mname.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2)
  public void operation2(Method mname)
  {
	  System.out.println(cname + " - " + mname.getName() + " - " + Thread.currentThread().getId());
  }
  
  /*@BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }*/

  
}
