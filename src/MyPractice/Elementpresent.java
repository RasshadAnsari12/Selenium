package MyPractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Elementpresent {

	public static void main(String[] args) {

		 FirefoxDriver driver=new FirefoxDriver();
		 driver.get("http://en.wikipedia.org/wiki/Rajinikanth");
		 String str=driver.getPageSource();
		 if(str.contains("Rajnikanth"))
			 
			 
		 {
			 System.out.println("Element present");
			 
		 }
		 else
			 System.out.println("Element not present");
		 
	}

		
	}


