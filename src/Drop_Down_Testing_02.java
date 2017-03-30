import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drop_Down_Testing_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	}

}
