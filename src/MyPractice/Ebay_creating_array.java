package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ebay_creating_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://www.ebay.com");
driver.findElement(By.xpath(".//*[@id='footerFragment']/div"));

WebElement foot=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[4]/ul"));
List<WebElement> ele=foot.findElements(By.tagName("a"));
System.out.println(ele.size());
for(int i=0;i<ele.size();i++)
{
	ele.get(i).click();
	driver.navigate().back();
	
	driver.findElement(By.xpath(".//*[@id='footerFragment']/div"));
	foot=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[4]/ul"));
    ele=foot.findElements(By.tagName("a"));

}
	}

}
