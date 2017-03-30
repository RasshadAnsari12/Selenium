package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Project_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("myprofile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys("John");
		driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]")).sendKeys("harry");
		driver.findElement(By.id("sex-0")).click();
	}

}
