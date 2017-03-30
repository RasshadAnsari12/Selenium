package Syspro;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTesting {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.findElement(By.xpath(".//*[@id='searchDropdownBox']")).sendKeys("Books");
		

	}

}
