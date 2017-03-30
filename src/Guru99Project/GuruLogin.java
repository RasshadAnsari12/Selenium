package Guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GuruLogin {
	@Test 
	public void Login() throws Exception
	{
		System.out.println("enter the valid Login Details");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		Thread.sleep(3000);
		//	System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys("mngr35504");
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("ysYhAtA");
		driver.findElement(By.xpath("//input [@type='submit']")).click();
		String url;
		System.out.println(url=driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		if(url.contains("guru99.com"))	
		{
			System.out.println("Login Sucessful");
		}
		else
		{
			System.out.println("Login Unsucessful");
		}
		
	}
}