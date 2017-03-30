package Gayatri_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Operation_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	FirefoxDriver Gayatri=new FirefoxDriver();
Gayatri.get("http://www.sysprotechnologies.co.in");
WebElement element=Gayatri.findElement(By.xpath(".//*[@id='main-menu']/ul/li[3]/a[1]"));
     Actions actfjfjfjfjfjjffj=new Actions(Gayatri);
     actfjfjfjfjfjjffj.moveToElement(element).build().perform();
     
     
     
	}

}
