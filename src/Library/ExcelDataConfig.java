package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



class ExcelDataConfig
{
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	ExcelDataConfig(String ExcelPath)
	{

		try {
			File f=new File("ExcelPath1");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
		} 

		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}


public String getData(int Sheet,int row,int column)
{
	XSSFSheet sheet1=wb.getSheetAt(0);

	String data=sheet1.getRow(1).getCell(0).getStringCellValue();
		return data;
	
}
	
	
	
	 
	
	
	
	
	
	
	
	
}
