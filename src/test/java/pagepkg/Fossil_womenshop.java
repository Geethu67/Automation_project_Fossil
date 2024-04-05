package pagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fossil_womenshop {

WebDriver driver;
	
    @FindBy(xpath="/html/body/div[1]/div[1]/header/div/div/div[2]/nav/div[2]/ul/li[1]/a") 
    WebElement fwomen;
    
	@FindBy(xpath="//*[@id=\"cat-banner\"]/div/div/div[1]/div/div[4]/a/p/u/strong\r\n")
	WebElement fjew;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[3]/div[4]/div/div[1]/div[3]/div[2]/div/article[1]/div/div/div[1]/a[2]/img")
	WebElement fitem;
		
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[3]/div/div/div/button")
	WebElement faddbag;
	
	@FindBy(xpath="//*[@id=\"email-guest\"]")
	WebElement fitememail;
	
	@FindBy(xpath=" //*[@id=\"fix-wrapper\"]/header/div/div/div[3]/div[2]/div[3]/div[2]/div[4]/div[2]/div[2]/div/div/a\r\n")
	WebElement fcheckout;
	
	public 	Fossil_womenshop(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getwomencatog()
	{
		WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div[2]/nav/div[2]/ul/li[1]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);

		//fwomen.click();
		
		fjew.click();
	}
	
	public void addbag() 
	{
		WebElement element3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[1]/div[3]/div[2]/div/article[1]/div/div/div[1]/a[2]/img"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element3);
		//faddbag.click();
		
		//add
		WebElement element4 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[3]/div/div/div/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element4);
		//cart
		WebElement element5 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div[3]/div[2]/div[1]/a/span[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element5);
		//checkout
		WebElement element6 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div[4]/div/div/div/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element6);
		
		 
	}
	public void checkoutscreenshot() throws IOException, InterruptedException
	{
		Thread.sleep(4000);
		fitememail.sendKeys("abcd551@gmail.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		File srcp1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcp1, new File("E:\\\\luminar_11/fbscreenshot.png"));
	}
}
