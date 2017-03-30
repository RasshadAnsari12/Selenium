package MyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Chrome_Launch {
	

	public static void main(String[] args) throws Exception{
		WebDriver driver;
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

driver=new ChromeDriver();
driver.get("http://www.google.com");
Thread.sleep(5000);
	
	
	
System.setProperty("webdriver.opera.driver", "D:\\Selenium softwares\\operadriver.exe");
driver=new OperaDriver();
driver.get("http://amazon.in");

	
driver=new FirefoxDriver();
driver.get("https:www.flipkart");
	}
}
