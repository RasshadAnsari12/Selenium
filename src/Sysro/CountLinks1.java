package Sysro;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLinks1 {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("Rasshadansari@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("13677823");
	
		

		
		
		
		

	}

}
