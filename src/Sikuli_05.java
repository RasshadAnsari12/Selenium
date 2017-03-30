import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://www.seleniumhq.org/download/");
driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
Screen scr=new Screen();
Pattern pt= new Pattern("C:\\Users\\sathya\\Desktop\\Capture.jpg");
scr.click(pt);


	}

}
