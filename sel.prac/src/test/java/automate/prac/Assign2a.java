package automate.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2a //redbus date selection
{
	
	public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='10']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Hyderabad']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("???");
		
	}

}
