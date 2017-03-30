package TestNGG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



@BeforeMethod
   public class TestNG_01 
   {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("PROFILE0");         
	FirefoxDriver driver=new FirefoxDriver(fp);
   

@Test
public void Url()	
{
	driver.get("https:www.amazon.in");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
}

@AfterTest
public void message()
{
	System.out.println("Thank you");
	
}

@Test
public void quit()
{
	driver.quit();
}

@BeforeTest
public void msg()
{
	System.out.println("Good Morning");
	
}

}






