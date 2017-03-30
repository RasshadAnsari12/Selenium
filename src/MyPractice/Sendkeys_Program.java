package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sendkeys_Program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
Thread.sleep(5000);
driver.get("http://newtours.demoaut.com");
driver.findElement(By.linkText("REGISTER")).click();
Thread.sleep(5000);
for(int i=0;i<20;i++)
{
	

driver.findElement(By.name("firstName")).sendKeys("JOhn");

driver.findElement(By.name("phone")).sendKeys("1234");
driver.findElement(By.name("userName")).sendKeys("abc@gmail.com");
driver.findElement(By.name("address1")).sendKeys("abc");
driver.findElement(By.name("address2")).sendKeys("123");
driver.findElement(By.name("city")).sendKeys("hyd");
driver.findElement(By.name("state")).sendKeys("tel");
driver.findElement(By.name("postalCode")).sendKeys("500089");
driver.findElement(By.name("country")).sendKeys("INDIA");
driver.findElement(By.name("email")).sendKeys("xyz");
driver.findElement(By.name("password")).sendKeys("nb78");
driver.findElement(By.name("confirmPassword")).sendKeys("nb78");
Thread.sleep(5000);
driver.findElement(By.name("register")).click();
Thread.sleep(5000);
driver.navigate().back();
	}
	}
}
