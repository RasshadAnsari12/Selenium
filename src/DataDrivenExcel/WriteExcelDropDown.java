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

//Program to display all the elements from dropdown and store them in excel

public class WriteExcelDropDown {

	public static void main(String[] args) throws Exception {


		File f=new File("C:\\New folder\\DropDownExcelSheet.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);


		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("searchDropdownBox")).click();
		List<WebElement> dropdown=driver.findElements(By.tagName("option"));

		System.out.println(dropdown.size());
		Thread.sleep(3000);
		for(int i=0;i<dropdown.size();i++)
		{
			String text;
			System.out.println(text=dropdown.get(i).getText());     //printing elements on console
			sheet1.createRow(i).createCell(0).setCellValue(text);   //storing elements in excel
			FileOutputStream fout=new FileOutputStream(f);
			wb.write(fout);
			wb.close();
		}
		
		int rowcount;   
		
		System.out.println(rowcount=sheet1.getLastRowNum());  // here i am reading data from the same excel file (see above)
		for(int j=0;j<rowcount;j++)
		{
			System.out.println(sheet1.getRow(j).getCell(0).getStringCellValue());
		}
	

	}

}
