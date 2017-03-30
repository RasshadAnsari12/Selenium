package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FooterLinksCount {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com");

		//count the total no of links in ebay.com
		List<WebElement> TotalLinks=driver.findElements(By.tagName("a"));
		System.out.println(TotalLinks.size());


		Thread.sleep(7000);


		//count the no.of links only in footer section
		WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		List<WebElement> links=footer.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//count the no.of links present in one of the blocks in footer section
		
		WebElement footerBlock=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		
		List<WebElement> linksBlock=footerBlock.findElements(By.tagName("a"));
		System.out.println(linksBlock.size());

		for(int i=0;i<linksBlock.size();i++)
		{
			System.out.println(linksBlock.get(i).getText());
		
		footerBlock.findElement(By.className("thrd")).click();
		
		String a=driver.getTitle();
	System.out.println(a);
		System.out.println("----------------------------------");
		
		if(((List<WebElement>) linksBlock.get(i)).contains("Site map"))
		
		{
			linksBlock.get(i).click();
			Thread.sleep(5000);		
			}
		
		
		
		}
		
		
	}
}