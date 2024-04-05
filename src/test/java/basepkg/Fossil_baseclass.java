package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Fossil_baseclass {
	protected WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		driver.get("https://www.fossil.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
	}
}
