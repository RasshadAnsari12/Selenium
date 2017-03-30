package MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getWindowHandle {

	public static void main(String[] args) {
	
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.onlinesbh.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='banner_j']/a")).click();
		
}
}
