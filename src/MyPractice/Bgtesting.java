package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Bgtesting {

	public static void main(String[] args) {
	HtmlUnitDriver driver=new HtmlUnitDriver();
	driver.get("https://accounts.google.com");
driver.findElement(By.id("Email")).sendKeys("swethasatishlenka@gmail.com");
driver.findElement(By.id("next")).click();
driver.findElement(By.id("Passwd")).sendKeys("bavabujji");
driver.findElement(By.id("signIn")).click();
String a=driver.getCurrentUrl();
System.out.println(a);



	


	}

}
