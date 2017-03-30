package DataDrivenExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
     File f=new File("C:\\New folder\\TestData.xlsx");
     FileInputStream fis=new FileInputStream(f);
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     
     XSSFSheet sheet1=wb.getSheetAt(0);
     
     sheet1.getRow(0).createCell(2).setCellValue("444");
     sheet1.getRow(1).createCell(2).setCellValue("f555");
     FileOutputStream fout=new FileOutputStream(f);
     
     //recall the difference between getRow and createRow   .............> very imp
     wb.write(fout);
     

	}

}
