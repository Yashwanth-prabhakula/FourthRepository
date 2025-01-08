package automate.prac;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseAutoTest //NAME SHOULD HAVE BEEN STATIC BASEAUTOTEST
{
	
	public static WebDriver driver;
	public static Properties a;
	public static FileInputStream fpath;
	//public static String path = System.getProperty("user.dir")+"\\src\\test\\resources\\info.properties";
	
	
	/*public static void loadfiles() throws Exception
		{
		
			fpath = new FileInputStream(path);
	
			a = new Properties();
			
			a.load(fpath);
		
		}*/
	
	public static void browserlaunch(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
	}

	public static void openwebsite(String url)
	{
		driver.get(url);
		driver.navigate().to(url);
	}
		
	public static void clickelement(String locator)
	{
		driver.findElement(By.id(locator)).click();
	}
	
	public static void selectDDoption(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public static void selectDDoptionselect(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public static void search(String locator, String keyword)
	{
		driver.findElement(By.id(locator)).sendKeys(keyword);
	}
	
}
