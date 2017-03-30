package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://www.echoecho.com/htmlforms10.htm");
WebElement box=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
List<WebElement> ele=box.findElements(By.name("group1"));
System.out.println(ele.size());
for(int i=0;i<ele.size();i++)
{
	System.out.println(ele.get(i).getText());
}
	}

}
