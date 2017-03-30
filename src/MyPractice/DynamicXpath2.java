package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//creation of dynamic xpath using startwith and contains methods

public class DynamicXpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://yahoo.com");
		
		driver.findElement(By.cssSelector("#UHSearchBox")).sendKeys("selenium");
		
	List<WebElement> list=driver.findElements(By.xpath("//*[contains(@id,'tn-trending')]"));
		//("//*[starts-with(@id,'yui_3_12_0_1_1460')]"));
	
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++)
	{
	//String a=list.get(i).getText();
		System.out.println(list.get(i).getText());
	}
	
	}
}
