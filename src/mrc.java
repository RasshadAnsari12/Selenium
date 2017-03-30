import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class mrc {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/?p=us");
		WebElement ele=driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/table/tbody/tr/td[2]/form/table/tbody/tr/td[1]/input"));
Actions act=new Actions(driver);
act.contextClick(ele).build().perform();
	}

}
