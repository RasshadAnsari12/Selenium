package MyPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FacebookScreenShotUtility {

	
	public static void ScreenShot(WebDriver driver, String screenshot) throws IOException
	{
TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\sathya\\Desktop\\New folder (3)\\"+screenshot+".png"));
		
		System.out.println("Screenshots taken");
	}
}
