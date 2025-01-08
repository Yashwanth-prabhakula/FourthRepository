package alerts.prac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTwo
{
	
	public static WebDriver driver = new ChromeDriver();
	
	public static void promptalert() throws Exception
	{
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
		
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		
		Alert promptalert = driver.switchTo().alert();
		
		promptalert.sendKeys("yash");
		Thread.sleep(2000);
		
		promptalert.accept();
		
	}
	
	public static void modaldialogs() throws Exception
	{
		driver.get("https://www.w3schools.com/howto/howto_css_modals.asp");
		
		//no need to switch to alerts. can interact with webelements.
	}
	
	public static void authpopup()
	{
		
	}

	public static void main(String[] args) throws Exception
	{

		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		
		promptalert();
	}

}
