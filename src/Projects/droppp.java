package Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 
 public class droppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		org.openqa.selenium.WebElement drop=driver.findElement(By.xpath(".//*[@id='gh-cat-box']"));
		java.util.List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			System.out.println(dropdown.get(i).getText());
		}
	
		}

	}


