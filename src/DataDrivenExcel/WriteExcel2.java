
package DataDrivenExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel2 {

	
		public static void main(String[] args) throws Exception {
		     File f=new File("C:\\New folder\\TestData.xlsx");
		     FileInputStream fis=new FileInputStream(f);
		     XSSFWorkbook wb=new XSSFWorkbook(fis);
		     XSSFSheet sheet1=wb.getSheetAt(0);
		     
		     int count=sheet1.getLastRowNum();
		     for(int i=0;i<count;i++)
		     {   	 
		     sheet1.getRow(i).createCell(2).setCellValue("pass");
		  
		     FileOutputStream fout=new FileOutputStream(f);
		     wb.write(fout);
		     
		     
	}
		}
}
