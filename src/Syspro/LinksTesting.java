package Syspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	WebElement a=driver.findElement(By.linkText("Google"));
	System.out.println(a);
	
		

	}
	
	

}
