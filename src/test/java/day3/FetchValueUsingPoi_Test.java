package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchValueUsingPoi_Test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs=new FileInputStream(new File("/home/j.benchamin/Downloads/Jenis/Testdata/TestData.xlsx"));
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String cellValue = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellValue);
		
		cellValue = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(cellValue);
		
	}

}
