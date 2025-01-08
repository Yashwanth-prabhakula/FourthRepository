package automate.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignHighlight
{
	
	public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args)
	{
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		WebElement targetfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
		JavascriptExecutor jstool = (JavascriptExecutor) driver;
		
		jstool.executeScript("arguments[0].style.border='4px solid red'", targetfield);

		//jstool.executeScript("arguments[0].style.background='orange'", targetfield);
		
	}

}
