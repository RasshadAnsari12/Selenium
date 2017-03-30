package MyPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//program to find the default status of the radio button
public class RadioButton1 
{

	public static void main(String[] args) 
	{
		
				
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://echoecho.com/htmlforms10.htm");
		WebElement a=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]"));

	
List<WebElement> radio=driver.findElements(By.name("group1"));
System.out.println(radio.size());

	for(int i=0;i<radio.size();i++)
	{
		//System.out.println(radio.get(i).getAttribute("value")+"................"+radio.get(i).getAttribute("checked"));
		if(!radio.get(i).isSelected())
		{
			radio.get(i).click();
		}
		else
		{
			System.out.println(radio.get(i).getAttribute("value"));
			
		
		}
		
		
	}

	}
}