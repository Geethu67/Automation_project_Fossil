package testpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basepkg.Fossil_baseclass;
import pagepkg.Fossil_pageclass;
import pagepkg.Fossil_search;
import utilities.Fossil_utilities;
import pagepkg.Fossil_womenshop;
public class Fossil_testclass extends Fossil_baseclass {
	@Test(priority=1)
	public void verifyLoginWithValidCred () throws Exception
	{
			Fossil_pageclass p1 = new Fossil_pageclass(driver);
		String x1 ="C:\\Users\\SUGATHAN\\Documents\\Fossil_Mavenproject_excelbook.xlsx";
		String Sheet = "Sheet1";
		int rowCount = Fossil_utilities.getRowCount(x1, Sheet);
		for(int i=1;i<=rowCount;i++)
	{
			String Username =Fossil_utilities.getStringCellValue(x1, Sheet, i, 0);
			System.out.println("username------"+Username);
			
			String Pwd =Fossil_utilities.getStringCellValue(x1, Sheet, i, 1);
			System.out.println("password------"+Pwd);
			p1.getsign();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div[1]/div/div[2]/form/div[1]/input")).clear();		p1.setValues(Username,Pwd);
			p1.login();
			driver.navigate().refresh();
			
			String expectedurl = "https://www.fossil.com/en-in/";
			String actualurl = driver.getCurrentUrl();
			if(actualurl.equals(expectedurl))
			{
				System.out.println("pass");
			}
	else
		{
				System.out.println("fail");
			}
			
		}
	}
	@Test(priority=2)
	public void verifyItemToBag() throws InterruptedException ,IOException
	{
		Fossil_womenshop p2 = new Fossil_womenshop(driver);
		p2.getwomencatog();
		p2.addbag();
		p2.checkoutscreenshot();
	}
	@Test(priority=3)
	public void verifySearchItem() throws InterruptedException 
	{
		Fossil_search p3 = new Fossil_search(driver);
		p3.getsearchitem();
		p3.addwishlist();
	}

}
