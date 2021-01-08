package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyClass {

	public static void main(String[] args) 
	{
	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\eclipse-workspace\\Assignment1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("ap_email")).sendKeys("sneha.hadkar.28@gmail.com");
		driver.findElement(By.name("Continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Sneha@2810");
		driver.findElement(By.name("Sign-In")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nikon");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.id("a-autoid-0-announce")).click();
			
		Select s = new Select (driver.findElement(By.name("s")));
		s.selectByValue("price-desc-rank");
		
		
	}

}
