import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class rec {

	public static void main(String[] args) throws ATUTestRecorderException {
		// TODO Auto-generated method stub
		ATUTestRecorder rec=new ATUTestRecorder("C:\\Users\\sathya\\Desktop\\Records","Record",false);
		rec.start();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		WebElement header=driver.findElement(By.id("sc_hdu"));
		List<WebElement> links=header.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		rec.stop();
		
	}

	}
}
