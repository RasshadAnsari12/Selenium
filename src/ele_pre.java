import org.openqa.selenium.firefox.FirefoxDriver;

public class ele_pre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	FirefoxDriver driver= new FirefoxDriver();
	driver.get("https://en.wikipedia.org/wiki/Salman_Khan");
	String str=driver.getPageSource();
	if(str.contains("SalmanKhan"))	
			{
				System.out.println("Element present");
		 
			}
			 else
			 {
				 System.out.println("Element not present");
			 }
			}
	}


