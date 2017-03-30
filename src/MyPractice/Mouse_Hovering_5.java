package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hovering_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
        Actions act=new Actions(driver);

		driver.get("http://www.google.com/gmail/about/");
        driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("html/body/nav/div/a[2]"));
		//act.moveToElement(ele).build().perform();		
		act.contextClick(ele).perform();
		
	}
	

}
