package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Company2
{
	@Test(dataProvider="MicroExcel")
	public void MicroExcelProgram(String name,String lname,String Pno,String Email) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.microexcel.com");
		Actions act1=new Actions(driver);
		WebElement element2=driver.findElement(By.xpath(".//*[@id='nav-menu-item-18396']/a"));
		act1.moveToElement(element2).build().perform();	
		WebElement element3=driver.findElement(By.linkText("Contact Us"));
		act1.moveToElement(element3).click().build().perform();	
		driver.findElement(By.xpath(".//*[@id='ls-global']/body/div[2]/section[2]/section/div/div/div/div[1]/div[2]/div/section/div/div/div/div[3]/div/div/div/form/div[2]/div[1]/input")).sendKeys(name);
		driver.findElement(By.xpath(".//*[@id='ls-global']/body/div[2]/section[2]/section/div/div/div/div[1]/div[2]/div/section/div/div/div/div[3]/div/div/div/form/div[2]/div[1]/input")).sendKeys(lname);
		driver.findElement(By.xpath(".//*[@id='ls-global']/body/div[2]/section[2]/section/div/div/div/div[1]/div[2]/div/section/div/div/div/div[3]/div/div/div/form/div[2]/div[1]/input")).sendKeys(Pno);
		driver.findElement(By.xpath(".//*[@id='ls-global']/body/div[2]/section[2]/section/div/div/div/div[1]/div[2]/div/section/div/div/div/div[3]/div/div/div/form/div[2]/div[1]/input")).sendKeys(Email);


}
	
	@DataProvider(name="MicroExcel")
	public Object[][] passData()
	{
		Object[][] data=new Object[1][1];
		
		data[0][0]="Ramesh";
		data[0][1]="Peter";
		data[1][0]="888888";
		data[1][1]="xyz@gmail";
		return data;
		
	}
}