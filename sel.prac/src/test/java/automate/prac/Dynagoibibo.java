package automate.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynagoibibo
{
	
	public static WebDriver driver = new ChromeDriver();
	
	public static String monthyear1;
	
	public static String tempmonthyear;
	
	public static String targetmonthyear = "april 2025";
	
	public static void datelabel()
	{
		
		List<WebElement> defaultdate = driver.findElements(By.xpath("//div[@id=\"root\"]/div[4]/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]"));
		
		for(WebElement x : defaultdate)
		{
			String temptextdate = x.getText();
			tempmonthyear = temptextdate;
		}
		
		String[] parts = tempmonthyear.split("\\s+");
        
		monthyear1 = parts[0] + " " + parts[1];
        
        System.out.println("Current month and year are " + monthyear1);
	
	}

	
	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id=\"root\"]/div[2]/p[1]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//div[@id=\"webpush-prompt\"]/div[2]/div[2]/button[1]")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class = 'sc-1gt8xf5-3 helaNf']/div[1]/div[2]/div[3]")).click();
		Thread.sleep(2000);
		
		datelabel();
		
		while(!targetmonthyear.equalsIgnoreCase(monthyear1))
        {
        	driver.findElement(By.xpath("//div[@id=\"root\"]/div[4]/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        	datelabel();
        	Thread.sleep(1000);
		}
        
        driver.findElement(By.xpath("//div[@id=\"root\"]/div[4]/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/div[5]/p")).click();       
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[@id=\"root\"]/div[4]/div/div/div[2]/div[1]/div/div/p")).click();
        
        //use waituntillitisclickable to avoid abrupt error.
	
	}

}

