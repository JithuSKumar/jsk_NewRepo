package excelRead;

import java.awt.image.ImagingOpException;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NameAndSalaryRead {

	static FileInputStream fileInputStream;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static String getStringData( int a, int b) throws IOException
	{
		fileInputStream = new FileInputStream("C:\\Users\\USER\\Desktop\\Obsqura\\ExcelFiles\\ExcelRead.xlsx");
		workbook = new XSSFWorkbook(fileInputStream);
		sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(a);
		XSSFCell cell = row.getCell(b);
		return cell.getStringCellValue();
		
	}
	
	public static String getIntegerData(int a, int b) throws IOException
	{
		fileInputStream = new FileInputStream("C:\\Users\\USER\\Desktop\\Obsqura\\ExcelFiles\\ExcelRead.xlsx");
		workbook = new XSSFWorkbook(fileInputStream);
		sheet= workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(a);
		XSSFCell cell = row.getCell(b);
		int x = (int)cell.getNumericCellValue();
		return String.valueOf(x);
		
	}
}
