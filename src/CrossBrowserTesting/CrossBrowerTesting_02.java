package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowerTesting_02 {
WebDriver driver;
@Test
@Parameters("browser")
public void verifyBroswer(String e)
{
if(e.equalsIgnoreCase("Firefox"))
{
	driver=new FirefoxDriver();
}

else if(e.equalsIgnoreCase("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium softwares\\chromedriver.exe");
	driver=new ChromeDriver();
}
else if(e.equalsIgnoreCase("explorer"))
	{
		System.setProperty("webdriver.IE.driver", "D:\\Selenium softwares\\chromedriver.exe");
		driver=new ChromeDriver();

	}
driver.get("http://www.google.com");
driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
String title=driver.getTitle();
System.out.println(title);
}
}

