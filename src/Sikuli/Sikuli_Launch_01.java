package Sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.browserlaunchers.Sleeper;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class Sikuli_Launch_01 {




	@Test(enabled=false)
	public void launch() throws SikuliException
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");

		WebDriver driver=new FirefoxDriver(fp);
		driver.get("http://seleniumhq.org");
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
		driver.findElement(By.linkText("2.53.1")).click();
		Screen screen=new Screen();
		Pattern pattern=new Pattern("C:\\Users\\sathya\\Desktop\\savefile.png");
		screen.click(pattern);



	}


	@Test(enabled=false)
	public void Launch_upload() throws Exception
	{
		WebDriver driver=new FirefoxDriver();

		driver.get("http://imgur.com");
		driver.findElement(By.linkText("upload images")).click();
		driver.findElement(By.xpath(".//*[@id='upload-global-file']")).click();
		Screen screen=new Screen();
		Pattern pattern1=new Pattern("C:\\Users\\sathya\\Desktop\\sikuli_captures\\filefield.png");
		Pattern pattern2=new Pattern("C:\\Users\\sathya\\Desktop\\sikuli_captures\\openbutton.png");
		screen.type(pattern1,"d:\\img.png");
		screen.click(pattern2);
		driver.findElement(By.xpath(".//*[@id='upload-global-start-button']")).click();



	}

	@Test(enabled=false)
	public void Gmail_Emails() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();

		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("RasshadAnsari@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("13677823");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(3000);
		Sleeper.sleepTight(1000);
		driver.findElement(By.xpath(".//*[@id=':hw']/div/div")).click();
		driver.switchTo().frame("hist_frame");
		//	WebElement element=driver.findElement(By.("html/body/div[11]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div"));

		driver.findElement(By.xpath(".//*[@id=':o6']")).sendKeys("Rasshad.ste@gmail.com");

		//this test is incomplete
	}



            @Test() 
              public void VLC_Click() throws FindFailed
             {
          	Screen scrn=new Screen();
	         Pattern pattern=new Pattern("C:\\Users\\sathya\\Desktop\\Sikuli_captures\\Capure.png");
	         Pattern pattern1=new Pattern("C:\\Users\\sathya\\Desktop\\Sikuli_captures\\Capure1.png");
	         Pattern pattern2=new Pattern("C:\\Users\\sathya\\Desktop\\Sikuli_captures\\Capure2.png");
	         Pattern pattern3=new Pattern("C:\\Users\\sathya\\Desktop\\Sikuli_captures\\Capure3.png");
	         Pattern pattern4=new Pattern("C:\\Users\\sathya\\Desktop\\Sikuli_captures\\Capure4.png");
	         scrn.doubleClick(pattern);
	         scrn.wait(pattern1,5);
	         scrn.type(pattern1,"http://www.seleniumhq.com");
	         scrn.type(Key.ENTER);
	         scrn.wait(pattern2,5);
	         scrn.click(pattern2);
	         scrn.click(pattern3);
	         scrn.click(pattern4);
             	         
	        
	         
}
            
            
            
            
            
}
            
            
            
            
            
            
            
            
            
            
            
            