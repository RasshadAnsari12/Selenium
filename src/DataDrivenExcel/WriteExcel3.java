package DataDrivenExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;                                              



import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class WriteExcel3 {
//program to open yahoo.com, click all the linktext from a block, write text, and currenturl in excel sheet +
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("PROFILE0");          /*Methods : createCell()    setCellValue()   FileOutPutStream */
		FirefoxDriver driver=new FirefoxDriver(fp);
		List<WebElement> links;
		 
		
		
		File f=new File("C:\\New folder\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total no of rows =" +rowcount);

		
		driver.get("https://in.yahoo.com/?p=us");
		WebElement block=driver.findElement(By.xpath("//div[@id='applet_p_32209491']"));
		links=driver.findElements(By.cssSelector(".Fw-b.Ell.Va-m.Maw-90.D-ib"));

		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			String text;
			System.out.println(text=links.get(i).getText());
			 sheet1.getRow(i).createCell(4).setCellValue(text);
			links.get(i).click();

		    	String url=driver.getCurrentUrl();
			 sheet1.getRow(i).createCell(3).setCellValue(url);
			   FileOutputStream fout=new FileOutputStream(f);
			     wb.write(fout);
			driver.navigate().back();
			Thread.sleep(3000);
			block=driver.findElement(By.xpath("//div[@id='applet_p_32209491']"));
			links=block.findElements(By.cssSelector(".Fw-b.Ell.Va-m.Maw-90.D-ib"));
	}
	}
}
