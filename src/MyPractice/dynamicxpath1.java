package MyPractice;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class dynamicxpath1 {

	public static void main(String[] args) throws Exception
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://amazon.in");
		Thread.sleep(4000);
		driver.findElementByXPath("//[@id='nav-your-amazon']").click();
				

	}

}
