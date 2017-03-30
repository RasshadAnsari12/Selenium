package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {


	//launch the page 
	//switch to 3rd frame
	//click a link then after get text of all links
	//come back to top window
	//go to 2nd and 3rd frames and perform the same operations as above



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();

		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("classFrame");

		//driver.findElement(By.linkText("com.thoughtworks.selenium")).click();


		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		System.out.println("==================================================================");


		Thread.sleep(5000);

		//come back to top window

		driver.switchTo().defaultContent();

		driver.switchTo().frame("packageListFrame");

		List<WebElement> links1=driver.findElements(By.tagName("a"));


		System.out.println(links1.size());


		for(int i=0;i<links1.size();i++)
		{
			System.out.println(links1.get(i).getText());
		}

		System.out.println("==================================================================");

		Thread.sleep(5000);
		//driver.findElement(By.linkText("com.thoughtworks.selenium")).click();

		//come back to top window

		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		List<WebElement> links2=driver.findElements(By.tagName("a"));

		System.out.println(links2.size());
		for(int i=0;i<links2.size();i++)
		{
			System.out.println(links2.get(i).getText());
		}
		//driver.findElement(By.linkText("CommandProcessor")).click();


		driver.close();
	}

}
