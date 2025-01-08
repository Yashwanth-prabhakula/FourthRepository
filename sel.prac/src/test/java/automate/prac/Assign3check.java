package automate.prac;
	import java.security.Key;
	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Assign3check 
	{

		public static void main(String[] args) throws Exception 
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("APjFqb")).sendKeys("Hadoop");
			//Thread.sleep(3000);
			
			//div[@jsname='erkvQe']//ul/li//descendant::div[@class='wM6W7d']/span
			//div[@id='Alh6id']//ul/li/div//descendant::div[@class='wM6W7d']/span
			
			List<WebElement> listElements = driver.findElements(By.xpath("//div[@jsname='erkvQe']//ul/li//descendant::div[@class='wM6W7d']/span"));
			
			System.out.println("Elements size : " + listElements.size());
		
			/*for(WebElement element:listElements)
			{
				System.out.println(element.getText());
				if(element.getText().contains("hadoop tutorial"))
					element.click();
					break;
			}*/
			
			for(int i = 0; i < listElements.size(); i++) 
			{
				System.out.println(listElements.get(i).getText());
				
				if(listElements.get(i).getText().contains("hadoop tutorial"))
						listElements.get(i).click();
					break;
			}
			
		}

	}