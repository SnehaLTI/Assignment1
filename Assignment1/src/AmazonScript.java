import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AmazonScript {

	public static void main(String[] args) throws InterruptedException {
		//Launching the Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\eclipse-workspace\\Assignment1\\Drivers\\chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 
		// Launching the Amazon web-site
		 driver.get("https://www.amazon.com/");  
		 
		 //Retrieving application title
		 System.out.println(driver.getTitle());
		 // Searching for Nikon Camera on search field
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nikon");
		 
		 //Click on search field
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 Select features = new Select(driver.findElement(By.id("s-result-sort-select")));
		 
		 //Sorting the product by Highest to lowest prize
		 features.selectByIndex(1);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 //Click on 3rd product after sorting
		 driver.findElement(By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS-1']//a[@class='a-link-normal s-no-outline']")).click();
		 SoftAssert softAssert = new SoftAssert();
		 String actualText = driver.findElement(By.id("productTitle")).getText();
		 String expectedText = "Nikon D3X";
		 
		 //Verify and assert the product description
		 softAssert.assertTrue(actualText.equalsIgnoreCase(expectedText), "Text is not matching");
		 
		 driver.findElement(By.cssSelector("div[data-asin='B0010HFL56']")).click();

	}
}
