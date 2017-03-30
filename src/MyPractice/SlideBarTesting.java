package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SlideBarTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://jqueryui.com/slider/#slider-vertical");
	driver.switchTo().frame(0);
	Actions action=new Actions(driver);
	WebElement slider=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
   int y=slider.getLocation().y;
   action.dragAndDropBy(slider, 40,y).build().perform();
   
 
}
}
