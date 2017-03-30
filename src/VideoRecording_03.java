import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class VideoRecording_03 {

	public static void main(String[] args) throws ATUTestRecorderException {
		// TODO Auto-generated method stub
ATUTestRecorder rec=new ATUTestRecorder("C:\\Users\\sathya\\Desktop\\Recorders","Record",false);
rec.start();
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://www.ebay.com");
List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println("Total links "+links.size());
int count=0;
for(int i=0;i<links.size();i++)
{
	if(!links.get(i).getText().isEmpty())
		
	{ 

count++;
	}
	
}
System.out.println("visibile links ="+count);
System.out.println("Invisible links ="+(links.size()-count));
rec.stop();
	}

}
