package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		WebElement source= driver.findElement(By.xpath(".//*[@id='box2']"));
		WebElement target= driver.findElement(By.xpath(".//*[@id='dropBox']"));
		Actions act= new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
	}

}
