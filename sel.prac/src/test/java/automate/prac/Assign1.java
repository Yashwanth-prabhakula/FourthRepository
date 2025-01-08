package automate.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1
{
	
	public static void main(String[] args)
	{
	
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> currentprice = driver.findElements(By.cssSelector("div#leftcontainer > table > tbody > tr > td:nth-child(4)"));
		
		ArrayList<Double> numcurrentprice = new ArrayList<>();
	
		for(WebElement strprice : currentprice)
		{
			String pricetextform = strprice.getText().replace(",", "");
			
			double pricedouble = Double.parseDouble(pricetextform);
			
			numcurrentprice.add(pricedouble);
		}
		
		Collections.sort(numcurrentprice, Collections.reverseOrder());
		
		double highestprice = numcurrentprice.get(0);
		System.out.println("Highest Price is " + highestprice);
		
		double lowestprice = numcurrentprice.get(numcurrentprice.size() - 1);
		System.out.println("Lowest Price is " + lowestprice);
		
		driver.quit();
		
	}
}