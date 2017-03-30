package MyPractice;

import java.util.List;
//this is a program which has captured all the trending links from yahoo.com
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamixXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Syspro1");
		FirefoxDriver driver=new FirefoxDriver(fp);
		List<WebElement> links;

		driver.get("https://in.yahoo.com/?p=us");
		WebElement block=driver.findElement(By.xpath("//div[@id='applet_p_32209491']"));
		links=driver.findElements(By.cssSelector(".Fw-b.Ell.Va-m.Maw-90.D-ib"));

		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();

			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Thread.sleep(3000);
			block=driver.findElement(By.xpath("//div[@id='applet_p_32209491']"));
			links=block.findElements(By.cssSelector(".Fw-b.Ell.Va-m.Maw-90.D-ib"));

		}
	}
}

