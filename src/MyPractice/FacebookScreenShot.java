package MyPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class FacebookScreenShot {
	
	@Test
	public void captureScreenShot() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		FacebookScreenShotUtility.ScreenShot(driver,"brosermaximize");
		driver.get("https://www.facebook.com/");
		FacebookScreenShotUtility.ScreenShot(driver, "fbopened");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("morning_star910@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("kunnrvbe");
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\sathya\\Desktop\\New folder (3)\\facebook.png"));
		
		System.out.println("Screenshots taken");
	}

	
}

