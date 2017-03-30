package Sikuli;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class SeleniumHq_Sikuli
{

	public static void main(String[] args) throws SikuliException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/download/");
		driver.findElementByXPath(".//*[@id='mainContent']/p[3]/a").click();
		Screen scr=new Screen();
		Pattern ptr=new Pattern("C:\\Users\\sathya\\Desktop\\Capture3.png");
		scr.click(ptr);
	}

}
