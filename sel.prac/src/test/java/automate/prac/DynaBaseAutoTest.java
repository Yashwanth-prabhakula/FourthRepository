package automate.prac;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynaBaseAutoTest
{

	public static WebDriver driver;
	public static FileInputStream file;
	public static Properties a;
	public static String path = "C:\\Users\\Yashwanth\\eclipse-workspace\\sel.prac\\src\\test\\resources\\";
	
	public static void fileload() throws Exception
	{
		file = new FileInputStream(path + "info.properties");
		a = new Properties();
		a.load(file);
	}
	
	public static void openbrowser(String browser) 
	{
		if(a.getProperty(browser).equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(a.getProperty(browser).equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(a.getProperty(browser).equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
	}
	
	public static void openurl(String url)
	{
		driver.navigate().to(a.getProperty(url));
	}
	
	public static void entersearchkeyword(String locatorkey, String keyword)
	{
		getelement(locatorkey).sendKeys(keyword);
		//driver.findElement(By.id(a.getProperty(locatorkey))).sendKeys(keyword);
	}
	
	public static void submitsearch(String locatorkey)
	{
		getelement(locatorkey).click();
		//driver.findElement(By.id(a.getProperty(locatorkey))).click();
	}
	
	public static void selectDDoption(String locatorkey)
	{
		getelement(locatorkey).click();
	}
	
	public static void selectDDoptionselect(String locatorkey)
	{
		getelement(locatorkey).click();
	}
	
	
	public static WebElement getelement(String locatorkey)
	{
		WebElement getelement = null;
		
		if(locatorkey.endsWith("_id"))
		{
			getelement = driver.findElement(By.id(a.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_name"))
		{
			getelement = driver.findElement(By.name(a.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_classname"))
		{
			getelement = driver.findElement(By.className(a.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_xpath"))
		{
			getelement = driver.findElement(By.xpath(a.getProperty(locatorkey)));
		}
		return getelement;
	}
	
}

