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
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\eclipse-workspace\\Assignment1\\Drivers\\chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.com/");
		 
		 System.out.println(driver.getTitle());
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nikon");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 Select features = new Select(driver.findElement(By.id("s-result-sort-select")));
		 features.selectByIndex(1);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS-1']//a[@class='a-link-normal s-no-outline']")).click();
		 SoftAssert softAssert = new SoftAssert();
		 String actualText = driver.findElement(By.id("productTitle")).getText();
		 String expectedText = "Nikon D3X";
		 softAssert.assertTrue(actualText.equalsIgnoreCase(expectedText), "Text is not matching");
		 
		 driver.findElement(By.cssSelector("div[data-asin='B0010HFL56']")).click();

	}
}
