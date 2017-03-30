package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTesting_04 {

	public static void main(String[] args) {
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://www.google.co.in");
driver.findElement(By.partialLinkText("Gmai")).click();
	}

}
