package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.browserlaunchers.Sleeper;
import org.openqa.selenium.firefox.FirefoxDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Video {

	public static void main(String[] args) throws ATUTestRecorderException, Exception {
		// TODO Auto-generated method stub

		ATUTestRecorder recorder=new ATUTestRecorder("C:\\Users\\sathya\\Desktop\\SeleniumRecording", "recording5", false);
		recorder.start();
		FirefoxDriver driver=new FirefoxDriver();
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
	//	driver.switchTo().frame("hist_frame");
		recorder.stop();
		driver.close();
	}
	}

