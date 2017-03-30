package MyPractice;



import java.util.List;

import org.apache.bcel.verifier.VerifierFactoryListModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) {

WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in");
List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println("Total links="+ links.size());


/*for(int i=0;i<links.size();i++)
{
	String a=links.get(i).getText();
	System.out.println(a);
} //this method gets the text of all links

*/


for(int j=0;j<links.size();j++)
{
	WebElement ele=links.get(j);
	
	String url;
	System.out.println(url=ele.getAttribute("href"));
	VerifylinkActive(url);
	
}

	}

	private static void VerifylinkActive(String url) {
		// TODO Auto-generated method stub
		
	}

}
