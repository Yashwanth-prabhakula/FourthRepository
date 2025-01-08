package secondsel.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass

{

	public static WebDriver driver = new ChromeDriver();
	
	//public static WebDriver driver = new EdgeDriver();
	
	public static Actions x = new Actions(driver);

	
	public static void hover() throws Exception
	{
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	
		WebElement locator = driver.findElement(By.xpath("//div[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div"));
		
		x.moveToElement(locator).perform();
		Thread.sleep(2000);
		
		WebElement locator1 = driver.findElement(By.xpath("//html/body/div[4]/div[1]/object/a[2]"));
		
		x.moveToElement(locator1).perform();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//html/body/div[4]/div[2]/object/a[2]"));
		
		JavascriptExecutor HLtool = (JavascriptExecutor)driver;
		HLtool.executeScript("arguments[0].style.border = '4px solid green'", target);
		Thread.sleep(3000); //px is pixel.
		
		target.click();
		
	}
	
	public static void draganddrop()
	{
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id=\"content\"]/iframe")));
		
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]/p"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		x.dragAndDrop(drag, drop).perform();
		
	}
	
	public static void scrollbar() throws Exception
	
	{
		driver.get("https://jqueryui.com/slider/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id=\"content\"]/iframe")));
		
		WebElement scrollbarelement = driver.findElement(By.xpath("//div[@id=\"slider\"]/span"));
		
		x.dragAndDropBy(scrollbarelement, 500, 0).perform();	
	}
	
	public static void rightclick() throws Exception
	{
		driver.get("https://jqueryui.com/button/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id=\"content\"]/iframe")));
		
		WebElement target = driver.findElement(By.xpath("/html/body/div/button"));
		
		x.contextClick(target).perform();
			
	}
	
	public static void enter() throws Exception
	{
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		
		searchfield.sendKeys("football");
		//Can't create a variable along with sendkeys method because it doesn't return a webelement. returns void. giving a value instead of taking.
		
		Thread.sleep(2000);
		
		//x.sendKeys(searchfield, Keys.ENTER).perform();
		x.sendKeys(Keys.ENTER).perform();		
	}
	
	public static void tabkey() throws Exception
	{
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		WebElement idfield = driver.findElement(By.xpath("//input[@name='username']"));
	
		idfield.sendKeys("yash");
		
		Thread.sleep(2000);
		
		x.sendKeys(Keys.TAB).perform();
		//x.sendKeys(idfield, Keys.TAB).perform();
		
	}
	
	public static void copypaste() throws Exception
	{
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		WebElement idfield = driver.findElement(By.xpath("//input[@name='username']"));
	
		WebElement pwfield = driver.findElement(By.xpath("//input[@name='password']"));
		
		idfield.sendKeys("yash");
		
		Thread.sleep(2000);
		
		idfield.sendKeys(Keys.CONTROL + "a");
		
		idfield.sendKeys(Keys.CONTROL + "c");
		
		pwfield.sendKeys(Keys.CONTROL + "v");
		
		//The operation did not work when used with sendkeys through the Actions class object.
		
	}

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		
		//hover();
		
		//draganddrop();
				
		//scrollbar();
		
		//rightclick();
		
		//enter();
		
		//tabkey();
		
		copypaste();
		
		//mouseOverElement("//span[text()='Sign In']");
		//dragAndDropElement("draggable", "droppable","demo-frame");
		//slideBarElement("slider", "demo-frame");
		//rightClick("Droppable");
		//keyEnter("twotabsearchtextbox");
		
		//keyTab("email");
		//selectAll("email", "pass");
		
		
	}

}
