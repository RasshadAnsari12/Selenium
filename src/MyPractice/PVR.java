package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//Program to open PVR cinmena, capture all the links present in general section. click on those links and capture their urls
public class PVR {

	public static void main(String[] args) {

		   FirefoxDriver driver=new FirefoxDriver();
		   driver.get("http://www.pvrcinema.com");
		   driver.findElement(By.xpath("html/body/div[7]/div[1]/div[2]"));
		   List<WebElement> elements=driver.findElements(By.tagName("a"));
		   System.out.println(elements.size());
		   
		   
	}

}
