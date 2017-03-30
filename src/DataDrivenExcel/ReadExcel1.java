package DataDrivenExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {


		File f=new File("C:\\New folder\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);

		XSSFSheet sheet1=wb.getSheetAt(0);

	int rowcount=sheet1.getLastRowNum();

		System.out.println("Total no of rows =" +rowcount);

		for(int i=0;i<rowcount;i++)

		{
			String data=sheet1.getRow(i).getCell(4).getStringCellValue();

			//System.out.println(data);
			System.out.println("Test data from sheet 1 row is  "+data); 

		}

	//	for(int j=0;j<rowcount;j++)
	//	{
	//		XSSFRichTextString data1=sheet1.getRow(j).getCell(1).getRichStringCellValue();
			//System.out.println(data1);
		//	System.out.println("Test data from sheet 1 column is  "+data1); 
	//	}

	//	System.out.println();



		//	String data=sheet1.getRow(0).getCell(0).getStringCellValue();
		//	String data1=sheet1.getRow(0).getCell(1).getStringCellValue();

		//System.out.println("The data received from Sheet1 is "   +data);
		//System.out.println("The data received from Sheet1 is "   +data1);

		wb.close();
	}

}
