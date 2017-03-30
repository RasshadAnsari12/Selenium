package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinkTesting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("myprofile");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://bing.com");
	
	driver.findElement(By.linkText("VIDEOS")).click();
	
	
	
	

	}

}
