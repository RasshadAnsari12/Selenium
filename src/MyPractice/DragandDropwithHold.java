package MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropwithHold {

	

	@Test
	public void DragandDrop2() throws Exception
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement from=driver.findElement(By.xpath(".//*[@id='box3']"));
		WebElement to=driver.findElement(By.xpath(".//*[@id='dropBox']"));
		Actions act=new Actions(driver);
		act.clickAndHold(from).moveToElement(to).build().perform();
		
}
}

