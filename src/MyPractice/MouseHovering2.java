package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rightstart.com/");

		driver.manage().window().maximize();


		//creating action class object with driver

		Actions ac=new Actions(driver);
		org.openqa.selenium.WebElement element=driver.findElement(By.id("navigation-top-cat-label-328"));
		ac.moveToElement(element).build().perform();
		Thread.sleep(3000);
		List<org.openqa.selenium.WebElement> element4=driver.findElements(By.xpath(".//*[@id='nav']/li[5]/ul"));
		for(int i=0;i<element4.size();i++)
		{
			System.out.println(element4.get(i).getText());
		}
        
		Thread.sleep(3000);
		org.openqa.selenium.WebElement element1=driver.findElement(By.id("navigation-top-cat-label-330"));

		ac.moveToElement(element1).build().perform();

		org.openqa.selenium.WebElement element2=driver.findElement(By.id("navigation-top-cat-label-619"));

		ac.moveToElement(element2).click().build().perform();
	}



}
