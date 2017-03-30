package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.safari.SafariDriver;

public class LinkTestingHrefProp
{

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");
		FirefoxDriver driver=new FirefoxDriver(fp);
		//FirefoxDriver driver=new FirefoxDriver();
	
	 driver.get("https://www.google.co.in");
      String a = driver.findElement(By.linkText("Gmail")).getAttribute("href");
      		System.out.println(a);
	}
}
      			
      		
      	
      		
      		
      		
      		
      		
	