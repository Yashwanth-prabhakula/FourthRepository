package automate.prac;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignScreenshot
{
	public static WebDriver driver = new ChromeDriver();
		
	public static void main(String[] args) throws Exception
	{
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		File snap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(snap, new File("C:\\Users\\Yashwanth\\OneDrive\\Desktop\\Course Documents\\Screenshots\\amazon.png"));

	}

}
