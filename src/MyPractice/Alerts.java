package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://www.ksrtc.in");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
//driver.switchTo().alert().accept();
String alert=driver.switchTo().alert().getText();
System.out.println(alert);
	}

}
