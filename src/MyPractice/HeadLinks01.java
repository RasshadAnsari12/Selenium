package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//program to capture all the headlinks from google news 
public class HeadLinks01 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=new FirefoxProfile();
		fp=pr.getProfile("PROFILE0");
FirefoxDriver driver=new FirefoxDriver(fp);
driver.get("https://news.google.co.in/");

//driver.findElement(By.cssSelector(".titletext")).click();
List<WebElement> links=driver.findElements(By.xpath("//span [@class='titletext']"));
for(int i=0;i<links.size();i++)
{
	
	System.out.println(links.get(i).getText());
	
}


//driver.quit();

	}

}
