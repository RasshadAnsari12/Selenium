package DataDrivenExcel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WriteExcel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://www.amazon.in");
driver.findElement(By.xpath(".//*[@id='navFooter']/div[1]"));
 WebElement block=driver.findElement(By.xpath(".//*[@id='navFooter']/table/tbody/tr/td[1]"));
List<WebElement> ele=block.findElements(By.tagName("a"));
for(int i=0;i<ele.size();i++)
{
	System.out.println(ele.get(i).getText());
}
	} 

}
