package MyPractice;

import java.util.List;
//program to check only the unchecked check boxes and if it is checked then uncheck it

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CheckBox3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");
		FirefoxDriver driver=new FirefoxDriver(fp);
		
		driver.get("http://echoecho.com/htmlforms09.htm");
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
			
			
			List<WebElement> a=block.findElements(By.tagName("input"));
			for(int i=0;i<a.size();i++)
			if(a.get(i).isSelected())
			{
				a.get(i).click();
			}
			else
				a.get(i).click();
			
			
	}

}
