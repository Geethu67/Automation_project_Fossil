package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Fossil_search {
WebDriver driver;
	
   
	
	@FindBy(xpath="/html/body/div[1]/div[1]/header/div/div/div[2]/div/div/div/form/div[1]/input")
	WebElement fsearchitem;
						
	
	public 	Fossil_search(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getsearchitem() throws InterruptedException
	{
		//searchicon
		WebElement element7 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div[2]/div/button/img"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element7);

		//searchiteam
		Thread.sleep(4000);
		fsearchitem.sendKeys("earrings");

		//searchbutton
		WebElement element8 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div[2]/div/div/div/form/div[1]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element8);

	}
	public void addwishlist()
	{
		//firstsearchitem
		WebElement ele10 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[1]/div[3]/div[2]/div/article[1]/div/div/div[1]/a[2]/img"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele10);
		//addbag
		WebElement ele11 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[3]/div/div/div/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele11);
		
		//viewcart
		WebElement ele12 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div[3]/div[2]/div[2]/span[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele12);
		
	}
}
