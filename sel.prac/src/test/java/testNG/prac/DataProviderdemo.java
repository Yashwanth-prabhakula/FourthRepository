package testNG.prac;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderdemo
{

  @Test(dataProvider = "dp")
  public void f(Integer n, String s, int x)
  {
	  
  }

  @DataProvider
  public Object[][] dp()
  {
    return new Object[][] {new Object[] { 1, "a", 10}, new Object[] { 2, "b", 20}, new Object[] { 3, "c", 30}};
  
  }
}
