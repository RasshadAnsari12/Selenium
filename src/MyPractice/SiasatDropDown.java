package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SiasatDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.siasat.com");
		
	//	driver.findElement(By.cssSelector("#menu-item-796787>a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/header/nav/div/div/ul/li[6]/a")).sendKeys("Automobile");

	//	<a href="http://www.siasat.com/category/business/">Business</a>
	}

}
