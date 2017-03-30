package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTesting_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://pvrcinemas.com");
driver.findElement(By.xpath("html/body/div[6]/div[1]"));
	
WebElement smallblock=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]"));
List<WebElement> elements=smallblock.findElements(By.tagName("a"));
System.out.println(elements.size());
for(int i=0;i<elements.size();i++)
{
	System.out.println(elements.get(i).getText());
}
}
}