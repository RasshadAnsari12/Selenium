package CrossBrowserTestingFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting_00 {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void VerfiyingTitle(String d) throws InterruptedException
	{
	if(d.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	
	else if(d.equals("chrome"))
	{
		System.setProperty("Webdriver.chrome.driver", "D:\\Selenium softwares\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(d.equals("explorer"))
	{
		System.setProperty("Webdriver.IE.driver", "D:\\Selenium softwares\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	driver.get("http://amazon.in");
	Thread.sleep(4000);
	String a= driver.getTitle();
	System.out.println(a);
	
	}
	
	
	
	
	

}
