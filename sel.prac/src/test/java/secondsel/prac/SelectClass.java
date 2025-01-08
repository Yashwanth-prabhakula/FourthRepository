package secondsel.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass
{
	
	public static WebDriver driver = new ChromeDriver();
	
	public static Actions x = new Actions(driver);
	
	public static void hover()
	{
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		x.moveToElement(driver.findElement(By.xpath("//img[@alt='Amusement Parks']")));
	}
	
	

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		hover();
		
		//mouseOverElement("//span[text()='Sign In']");
		//dragAndDropElement("draggable", "droppable","demo-frame");
		//slideBarElement("slider", "demo-frame");
		//rightClick("Droppable");
		//keyEnter("twotabsearchtextbox");
		//keyTab("email");
		//selectAll("email", "pass");
		
		
	}

}
