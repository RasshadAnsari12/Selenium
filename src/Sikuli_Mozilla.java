import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_Mozilla {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//FirefoxDriver driver=new FirefoxDriver();
		
		Screen scr=new Screen();
		Pattern pt= new Pattern("C:\\Users\\sathya\\Desktop\\moz.jpg");
		scr.doubleClick(pt);
	}

}
