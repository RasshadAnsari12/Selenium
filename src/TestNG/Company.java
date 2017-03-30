package TestNG;


import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Company {
	WebDriver driver;
	@Test()
	public void Methodd1()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.microexcel.com");
	}

	@Test
	public void Methodd2() throws InterruptedException
	{
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-menu-item-18393']/a"));
		act.moveToElement(element).build().perform();
		WebElement element1=driver.findElement(By.xpath(".//*[@id='nav-menu-item-17742']/a"));
		act.moveToElement(element1).click().build().perform();	
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	@Test
	public void Methodd3()
	{
		Actions act1=new Actions(driver);
		WebElement element2=driver.findElement(By.xpath(".//*[@id='nav-menu-item-18396']/a"));
		act1.moveToElement(element2).build().perform();	
		WebElement element3=driver.findElement(By.linkText("Contact Us"));
		act1.moveToElement(element3).click().build().perform();	

	}
	@Test(priority=1)
	public void DataDriven() throws Exception
	{
		File f=new File("D:\\TestData\\TestDataDoc.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Sheet1=wb.getSheetAt(0);
		int rowcount=Sheet1.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i=0;i<=5;i++)
		{
			XSSFRichTextString data=Sheet1.getRow(0).getCell(i).getRichStringCellValue();
			System.out.println(data);
			
		}
		
	
	}
	
	@Test(dataProvider="MicroExcel")
		public void MicroExcelProgram(String name,String lname, String Pno, String Email)
		{
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://www.microexcel.com");
			Actions act1=new Actions(driver);
			WebElement element2=driver.findElement(By.xpath(".//*[@id='nav-menu-item-18396']/a"));
			act1.moveToElement(element2).build().perform();	
			WebElement element3=driver.findElement(By.linkText("Contact Us"));
			act1.moveToElement(element3).click().build().perform();	
			
			
			
					
		}
	}
