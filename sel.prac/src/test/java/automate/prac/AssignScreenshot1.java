package automate.prac;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignScreenshot1
{

	public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Date timecode = new Date();
		String x = timecode.toString().replace(" ", "_").replace(":", "_");
		
		List<WebElement> langlist = driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
		
		for(int i = 0; i < langlist.size(); i++)
		{
			//System.out.println(langlist.get(i).getText());
			
			String lang = langlist.get(i).getText();
	
			langlist.get(i).click();
			
			File langsnap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(langsnap, new File("C:\\Users\\Yashwanth\\OneDrive\\Desktop\\Course Documents\\Screenshots\\" + lang + "_" + x + ".png"));
			
			langlist = driver.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
			
			//After clicking a link and taking the screenshot, the links are re-fetched 
			//(links = driver.findElements(...)) to account for any potential changes in the DOM, 
			//as clicking a link could potentially reload or modify the page.
			
		}
		
	}

}
