import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Counts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://www.bing.com");
List<WebElement> ele=driver.findElements(By.tagName("a"));
System.out.println(ele);
for(int i=0;i<ele.size();i++)
{
	if(!ele.get(i).getText().isEmpty())
	{
		
	}
	
}


	}

}
