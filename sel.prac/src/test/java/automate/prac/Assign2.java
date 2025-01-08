package automate.prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2 //goibibo date selection
{
	
	

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriverWait pause = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("body > div.sc-Nxspf.fmtHXf.modal-wrapper > div.sc-cfxfcM.hARVek > div > div > div.sc-dAlyuH.kYRMML > span > span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class = 'sc-1gt8xf5-3 helaNf']/div[1]/div[2]/div[3]")).click();
		//driver.findElement(By.xpath("//div[@id='root']/div[5]/div/div/div[2]/div[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#root > div.sc-1gt8xf5-0.bPZJjI > div > div > div.sc-12foipm-0.iiZOql > div:nth-child(3) > div.sc-12foipm-39.dkOpZJ > div.sc-12foipm-41.cILJHS > div > div > div.DayPicker-NavBar > span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#root > div.sc-1gt8xf5-0.bPZJjI > div > div > div.sc-12foipm-0.iiZOql > div:nth-child(3) > div.sc-12foipm-39.dkOpZJ > div.sc-12foipm-41.cILJHS > div > div > div.DayPicker-NavBar > span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#root > div.sc-1gt8xf5-0.bPZJjI > div > div > div.sc-12foipm-0.iiZOql > div:nth-child(3) > div.sc-12foipm-39.dkOpZJ > div.sc-12foipm-41.cILJHS > div > div > div.DayPicker-NavBar > span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#root > div.sc-1gt8xf5-0.bPZJjI > div > div > div.sc-12foipm-0.iiZOql > div:nth-child(3) > div.sc-12foipm-39.dkOpZJ > div.sc-12foipm-41.cILJHS > div > div > div.DayPicker-Months > div:nth-child(2) > div.DayPicker-Body > div:nth-child(2) > div:nth-child(5)")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#root > div.sc-1gt8xf5-0.bPZJjI > div > div > div.sc-12foipm-0.iiZOql > div:nth-child(1) > div > div")).click();
		Thread.sleep(2000);
		
		//driver.close();
		//driver.quit();
		
	}

}
