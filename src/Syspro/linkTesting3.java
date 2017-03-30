package Syspro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkTesting3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://www.google.com");
Thread.sleep(1000);
List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println(links.size());

for(int i=0;i<links.size();i++)
{
	System.out.println(links.get(i));
}

	}
	}
	


