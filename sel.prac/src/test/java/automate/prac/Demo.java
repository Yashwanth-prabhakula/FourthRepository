package automate.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        // Set the path to your WebDriver (ChromeDriver in this case)
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

    	WebDriverManager.chromedriver().setup();
        // Initialize the WebDriver (Chrome browser in this case)
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the RedBus website
            driver.get("https://www.redbus.in/");

            // Wait until the date picker is visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dateField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[@class='dateText']")));

            // Click on the date picker input field to show the calendar
            dateField.click();

            // Wait for the calendar to load
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("rb-calendar")));

            // Navigate to the month of April 2025
            navigateToMonth(driver, "April", 2025);

            // Find all available dates in the calendar for April 2025
            List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td[@class='available']"));

            // Set the desired date (for example, April 10th)
            String desiredDate = "10"; // Change this to any date you want to select

            boolean dateFound = false;  // Flag to track if the desired date is found

            // Iterate through all available dates and check if the desired date exists
            for (WebElement date : allDates) {
                if (date.getText().equals(desiredDate)) {
                    // If the date is found, click it
                    date.click();
                    System.out.println("Selected date: " + desiredDate);
                    dateFound = true;
                    break;
                }
            }

            // If the desired date was not found, select the first available date
            if (!dateFound) {
                WebElement firstAvailableDate = allDates.get(0);
                firstAvailableDate.click();
                System.out.println("Desired date not found. Selected the first available date: " + firstAvailableDate.getText());
            }

            // Wait for a few seconds before closing
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    // Method to navigate to the specified month and year
    public static void navigateToMonth(WebDriver driver, String month, int year) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement monthYearLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("rb-monthTitle")));

        // Loop to navigate to the correct month and year
        while (true) {
            // Get the current month and year displayed
            String currentMonthYear = monthYearLabel.getText();
            String[] parts = currentMonthYear.split(" ");
            String currentMonth = parts[0];
            int currentYear = Integer.parseInt(parts[1]);

            // If we are already on the correct month and year, break
            if (currentMonth.equals(month) && currentYear == year) {
                break;
            } else if (currentYear < year || (currentYear == year && getMonthNumber(currentMonth) < getMonthNumber(month))) {
                // Click the "next" button to go forward in months
                WebElement nextButton = driver.findElement(By.xpath("//button[@class='next']"));
                nextButton.click();
            } else {
                // Click the "previous" button to go back in months
                WebElement prevButton = driver.findElement(By.xpath("//button[@class='prev']"));
                prevButton.click();
            }

            // Wait for the calendar to update
            wait.until(ExpectedConditions.textToBePresentInElement(monthYearLabel, month + " " + year));
        }
    }

    // Helper method to convert month name to its numeric value (1 = January, 12 = December)
    public static int getMonthNumber(String monthName) {
        switch (monthName) {
            case "January": return 1;
            case "February": return 2;
            case "March": return 3;
            case "April": return 4;
            case "May": return 5;
            case "June": return 6;
            case "July": return 7;
            case "August": return 8;
            case "September": return 9;
            case "October": return 10;
            case "November": return 11;
            case "December": return 12;
            default: return -1;
        }
    }
}
