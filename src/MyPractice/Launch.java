package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.FirefoxLauncher;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=new FirefoxProfile();
		fp=pr.getProfile("PROFILE0");
		*/
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=00a239f680c8d4247280dcd209394884");
		
	for(int i=0;i<20;i++)
	{
	driver.findElement(By.name("firstName")).sendKeys("khan");
	driver.findElement(By.name("lastName")).sendKeys("ahmed");
	driver.findElement(By.name("phone")).sendKeys("955555555");
	driver.findElement(By.id("userName")).sendKeys("pathangmail.com");
	driver.findElement(By.name("address1")).sendKeys("Hyderabad-Secundrabad");
	driver.findElement(By.name("city")).sendKeys("Hyderabad");
	driver.findElement(By.name("state")).sendKeys("Telangana");
	driver.findElement(By.name("postalCode")).sendKeys("5000098");
	driver.findElement(By.name("country")).sendKeys("india");
	driver.findElement(By.id("email")).sendKeys("rash");
    driver.findElement(By.name("password")).sendKeys("123455");
    driver.findElement(By.name("confirmPassword")).sendKeys("123455");
    driver.findElement(By.name("register")).click();
driver.navigate().back();
}
   //driver.close();		
	}

}
