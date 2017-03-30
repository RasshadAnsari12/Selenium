package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rightstart.com/");
		//maximizing the browser

		driver.manage().window().maximize();

		//creating Action class object
		Thread.sleep(3000);

		Actions action=new Actions(driver);

		WebElement element=driver.findElement(By.id("navigation-top-cat-label-731"));
		action.moveToElement(element).build().perform();
		WebElement element1=driver.findElement(By.id("navigation-top-cat-label-890"));
		action.moveToElement(element1).build().perform();
		WebElement element2=driver.findElement(By.id("navigation-top-cat-label-1358"));
		action.moveToElement(element2).click().build().perform();

		WebElement a=driver.findElement(By.xpath("html/body/div[6]/div/div[2]/div[1]/div[1]/h1"));
		System.out.println(a);
	}


}


