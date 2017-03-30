package Guru99Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Guru99_Day_03 {
	WebDriver driver;
	@BeforeMethod
	public void Profile() throws IOException
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");
		driver=new FirefoxDriver(fp);
        
	/*	
		File f=new File("C:\\New folder\\LoginData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int count=sheet1.getLastRowNum();
		System.out.println(count);
			*/	
	}

	@Test(priority=4,enabled=false)
	public void VerifyLogin() throws Exception
	{
		
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys("mngr35504");
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("ysYhAtA");
		driver.findElement(By.xpath("//input [@type='submit']")).click();
		
			Alert alt= driver.switchTo().alert();
			String	actualBoxtitle = alt.getText();
			alt.accept();
			if(actualBoxtitle.contains("User or Password is not valid"))
			{
				System.out.println("Test case passed"); 
			}	else
			{
				String url;
				System.out.println(url=driver.getCurrentUrl());
				if(url.contains("Managerhomepage.php"))
				{
					System.out.println("Login Sucessful");
				}
					else
					{
						System.out.println("Login Unsucessful");
					}
		}
	
		driver.close(); 
		}
		
	
	@Test(priority=1,dataProvider="LoginData")
	public void VerifyLogWithInvalidUser(String username,String password)

	{
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input [@type='submit']")).click();
		Alert alt= driver.switchTo().alert();
		String	actualBoxtitle = alt.getText();
		alt.accept();
		if(actualBoxtitle.contains("User or Password is not valid"))
		{
			System.out.println("Test case passed"); 
		}	else
		{
			System.out.println("Test case Failed");
		}
		driver.close();
	}
	@Test(priority=2,dataProvider="LoginData")
	public void VerifyLogWithInvalidPassword(String username,String password)

	{
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input [@type='submit']")).click();
		Alert alt= driver.switchTo().alert();
		String	actualBoxtitle = alt.getText();
		alt.accept();
		if(actualBoxtitle.contains("User or Password is not valid"))
		{
			System.out.println("Test case passed"); 
		}	else
		{
			System.out.println("Test case Failed");
		}
	}
	@Test(priority=3,dataProvider="LoginData")
	public void VerifyLogWithInvalidUserPwd(String username,String password)
	{
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input [@type='submit']")).click();
		Alert alt= driver.switchTo().alert();
		String	actualBoxtitle = alt.getText();
		alt.accept();
		if(actualBoxtitle.contains("User or Password is not valid"))
		{
			System.out.println("Test case passed"); 
		}	else
		{
			System.out.println("Test case Failed");
		}
	}

	@DataProvider(name="LoginData")
	public Object[][] passData()
	{

		Object[][] data=new Object[3][2];

		data[0][0]="mngr35504"; 
		data[0][1]="ysYhAtA";

		data[1][0]="mngr355056";
		data[1][1]="ysYhAtA";

		data[2][0]="mngr3550";
		data[2][1]="ysYhAtA";

		return data;

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	