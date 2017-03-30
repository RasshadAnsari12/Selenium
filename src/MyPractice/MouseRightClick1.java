package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//right click program

public class MouseRightClick1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();

		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='UHSearchBox']"));
		act.contextClick(element).perform();
	
		





	}
}