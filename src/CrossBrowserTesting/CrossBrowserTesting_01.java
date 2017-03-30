package CrossBrowserTesting;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//It is a cross browser testing program with testng.xml
public class CrossBrowserTesting_01 {
	WebDriver driver;


	@Test
	@Parameters("browser")
	public void verifyTitle(String a)
	{
		if(a.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}


		else if(a.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium softwares\\chromedriver.exe");
			driver=new ChromeDriver();

		}
		else if(a.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Selenium softwares\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();

		}
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println(title);
	}
}

