package MyPractice;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ScreenShots2 {

	//program to click all the links and take screen shot 
	@Test
	public void captureAllScrnShots() throws IOException, Exception
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.siasat.com");
	List<WebElement> elements=driver.findElements(By.tagName("a"));
	System.out.println(elements.size());
	
	for(int i=0;i<elements.size();i++)
	{
		if(!elements.get(i).getText().isEmpty())
		{
			String linkname=elements.get(i).getText();
			elements.get(i).click();
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\Users\\sathya\\Desktop\\New folder (3)\\New folder\\"+linkname+".png"));
			driver.navigate().back();
			Thread.sleep(3000);
			elements=driver.findElements(By.tagName("a"));
		}
	}
	
	
	}
	
}
