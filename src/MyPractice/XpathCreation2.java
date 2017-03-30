package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

import com.thoughtworks.selenium.Wait;

//program to capture healine links from google news
public class XpathCreation2 {

	private static final char[] GetCurrentURl = null;

	public static void main(String[] args) throws InterruptedException {
	
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://news.google.co.in/");
	//	String a=driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div[3]/div/div[1]/table/tbody/tr/td[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr/td[2]/div[1]/h2/a/span")).getText(); 
		driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div[3]/div/div[1]/table/tbody/tr/td[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr/td[2]/div[1]/h2/a/span")).click();
         
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
	  
		   
		  

	}

}
