package automate.prac;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest
{

	protected static WebDriver driver;
	private static FileInputStream file;
	private static Properties a;
	private static String path = "C:\\Users\\Yashwanth\\eclipse-workspace\\sel.prac\\src\\test\\resources\\";
	
	
	
	
	
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
		getlocator(locatorkey).sendKeys(keyword);
	}
	
	public static void submitsearch(String locatorkey)
	{
		getlocator(locatorkey).click();
	}
	
	public static WebElement getlocator(String locatorkey)
	{
		WebElement getlocator = null;
		
		if(!elementexists(locatorkey))
		{
			System.out.println("The entered locator is not a valid web element.");
		}
		else
		{
			getlocator = driver.findElement(elementtype(locatorkey));
		}
		
		return getlocator;
	
	}
	
	public static boolean elementexists(String locatorkey)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try
		{	
			wait.until(ExpectedConditions.presenceOfElementLocated(elementtype(locatorkey)));

			wait.until(ExpectedConditions.visibilityOf(driver.findElement(elementtype(locatorkey))));
			
			wait.until(ExpectedConditions.elementToBeClickable(elementtype(locatorkey)));
			
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	public static By elementtype(String locatorkey)
	{
		
		By x = null;
		
		if(locatorkey.endsWith("_id"))
		{
			x = By.id(a.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_name"))
		{
			x = By.name(a.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_classname"))
		{
			x = By.className(a.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_xpath"))
		{
			x = By.xpath(a.getProperty(locatorkey));
		}
		
		return x;
	}		
}
