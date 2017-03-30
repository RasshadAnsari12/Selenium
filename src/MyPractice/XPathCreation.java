

package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver  	driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		
		driver.findElement(By.id("email")).sendKeys("morning_star910@yahoo.com");
			
		driver.findElement(By.id("pass")).sendKeys("kunnrvbeln");
		
		
	//	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		
	//	driver.findElement(By.xpath("//input[@id='u_0_w']")).click();    //  <--------customized xpath
		
	//	driver.findElement(By.cssSelector("input[id='u_0_w']")).click();   //<--------- customized css selector
		
		//we can remove 'input from css selector to identify elements
		
		//driver.findElement(By.cssSelector("[id='u_0_w']")).click();
		
		
		//also
		driver.findElement(By.cssSelector("#u_0_w")).click();
		
		
		
		
		
	}
		
		
		
			

	

}
