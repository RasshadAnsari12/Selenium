package MyPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> ele=driver.findElements(By.tagName("option"));
		System.out.println(ele.size());
		
		for(int i=0; i<ele.size(); i++)
		{
			System.out.println(ele.get(i).getText());
			
		}
	}


}
