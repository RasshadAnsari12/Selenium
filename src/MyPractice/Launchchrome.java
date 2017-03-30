package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Launchchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		boolean fndele=driver.findElement(By.name("group1")).isDisplayed();
		System.out.println(fndele);
}
}
