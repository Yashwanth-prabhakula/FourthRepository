package automate.prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynaRedbus
{

	public static WebDriver driver = new ChromeDriver();
	
	public static String monthyear;
	
	public static String currentmonthyear;
	
	public static String desiredmonthyear = "apr 2025";
	
	public static void datelabel()
	{
		
		List<WebElement> defaultdate = driver.findElements(By.cssSelector("div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(2)"));
		
		for(WebElement x : defaultdate)
		{
			String temptextdate = x.getText();
			monthyear = temptextdate;
		}
		
		String[] parts = monthyear.split("\\s+");
        
		currentmonthyear = parts[0] + " " + parts[1];
        
        System.out.println("Current month and year are " + currentmonthyear);
	}

	
	
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		
		datelabel();
		
        while(!desiredmonthyear.equalsIgnoreCase(currentmonthyear))
        {
        	driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]")).click();
        	datelabel();
		}
        
        driver.findElement(By.xpath("//div[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[3]/span/div[4]/span")).click();       
        
        driver.findElement(By.xpath("//input[@id='src']")).click();
        
        
        
        /*driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
        
        WebElement date = driver.findElement(By.xpath("//div[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[4]/span/div[2]/span"));
        
        String datevalue = date.getText();
        
        System.out.println("date value is " + datevalue);*/
        
	}
}
