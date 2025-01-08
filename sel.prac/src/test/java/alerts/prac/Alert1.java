package alerts.prac;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1
{

	public static void main(String[] args) throws Exception
	{
		
		//Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]")));
		//driver.switchTo().frame(9); *failed*
		
		driver.findElement(By.xpath("//html/body/button")).click();
		Thread.sleep(2000);
		
		Alert accessalert = driver.switchTo().alert(); //this shifts the driver's attention to the alert
		
		System.out.println(accessalert.getText());
		
		accessalert.accept(); 

	}

}
