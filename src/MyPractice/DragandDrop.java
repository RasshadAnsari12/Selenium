package MyPractice;


public class DragandDrop {
//program to drag and drop from source to distination
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		WebElement source=driver.findElement(By.xpath(".//*[@id='box3']"));
		WebElement destination=driver.findElement(By.xpath(".//*[@id='dropBox']"));
		Actions act=new Actions(driver);
	    act.dragAndDrop(source, destination).build().perform();
		
		
	}
	
	
		
	}


