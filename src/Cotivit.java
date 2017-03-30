import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Cotivit {

	
		

		
		
		

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ProfilesIni pr=new ProfilesIni();
			FirefoxProfile fp=new FirefoxProfile();
			fp=pr.getProfile("PROFILE0");
			FirefoxDriver driver=new FirefoxDriver(fp);
			driver.get("http://www.cotiviti.com/contact-us");
			
			for(int i=0;i<5;i++)
	     driver.findElement(By.xpath(".//*[@id='Field1']")).sendKeys("oops");
			 driver.findElement(By.xpath(".//*[@id='Field2']")).sendKeys("oops");	
			 driver.findElement(By.xpath(".//*[@id='Field3']")).sendKeys("xyz@gmail.com");	
			 driver.findElement(By.xpath(".//*[@id='Field4']")).sendKeys("888888888");	
			// driver.findElement(By.xpath(".//*[@id='saveForm']")).click();
				
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.get("http://www.cotiviti.com/contact-us");
	

	}

}
