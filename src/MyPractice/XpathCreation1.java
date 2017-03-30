package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//program to open Gmail.com and capture the text "one google account for everything Google" by creating out own xpath
public class XpathCreation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.gmail.com");
	
	driver.findElement(By.linkText("Sign in")).click();
	
//String a=driver.findElementByXPath("html/body/div[1]/div[2]/div[2]/div[2]/div/div/p[2]").getText();<-----this is called as absolute xpath
	
	String a=driver.findElementByXPath("//p [@class='tagline']").getText();   // <----- dynamic xpath 
	                                                                          // <====== syntax ://html tag [@attribute='value']
System.out.println(a);														  // this is called as relative xpath	
	

	}

}
