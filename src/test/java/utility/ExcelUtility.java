package utility;
import java.io.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtility {

	public static Object[][] excelRead()throws IOException {
		
		String filePath="C:\\Users\\Dell\\eclipse-workspace\\TestAutomation\\testautomation.xlsx";
		FileInputStream fis=new FileInputStream(new File(filePath));//file handling
		Workbook workbook=new XSSFWorkbook(fis);//excelworkbook syntax
		Sheet sheet = workbook.getSheetAt(0);//to get the sheetname in excel so we are using index
		int rowcount = sheet.getPhysicalNumberOfRows();
		int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rowcount-1][columncount];
		for(int i=1;i<rowcount;i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<columncount;j++) {
				
				data[i-1][j]=(row.getCell(j).toString());
			}
		}
		workbook.close();
		fis.close();
		return data;
		
		
	}
}
