package Library;

public class ExcelSheetData {

	public static void main(String[] args) {
		ExcelDataConfig excel=new ExcelDataConfig("C:\\New folder\\New Microsoft Office Excel Worksheet.xlsx");

		System.out.println(excel.getData(0, 0, 0));
	}

}
