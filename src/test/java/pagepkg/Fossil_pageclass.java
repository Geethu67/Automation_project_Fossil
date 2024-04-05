package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.time.Duration;

public class Fossil_pageclass {
WebDriver driver;
	
    @FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/a/span") 
    WebElement fsign;
    
	@FindBy(xpath="//*[@id=\"login-form-email\"]")
	WebElement femail;
	
	@FindBy(xpath="//*[@id=\"login-form-password\"]")
	WebElement fpassword;
						
	@FindBy(xpath="/html/body/div[1]/div[2]/div[3]/div/div/div[1]/div/div[2]/form/button")
	WebElement flog;
	
	//@FindBy(xpath="/html/body/div[5]/div/div[2]/button")
	//WebElement fcookies;
	
		
	public 	Fossil_pageclass(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getsign() 
	{
		//Thread.sleep(4000);
		//fcookies.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/a/span")));
		//element.click();
		//fsign.click();
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/a/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

		
	}
	public void login()   
	{
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div[1]/div/div[2]/form/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

		//flog.click();
		driver.navigate().back();
	}
	public void setValues(String Username,String Pwd)  
	{
		
		femail.sendKeys(Username);
		fpassword.sendKeys(Pwd);
		
	}   
	
}
