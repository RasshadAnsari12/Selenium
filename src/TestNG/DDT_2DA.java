package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_2DA {
	WebDriver driver;

	@Test(dataProvider="WordPressData")
	public void DDT(String username, String password) throws InterruptedException


	{
		driver=new FirefoxDriver();
		driver.get("https://wordpress.com/wp-admin");

		driver.manage().window().maximize();

		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		Thread.sleep(6000);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "user is able to login sucessfully");
		driver.close();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}


	@DataProvider(name="WordPressData")
	public Object[][] passData()
	{

		Object[][] data=new Object[3][2];

		data[0][0]="admin"; 
		data[0][1]="demo";

		data[1][0]="admin";
		data[1][1]="demo123";

		data[2][0]="admin2";
		data[2][1]="demo2";

		return data;


	}
}
