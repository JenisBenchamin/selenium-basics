package day2.session2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadSingleDataFromExcel_Test {

	public static void main(String[] args) throws BiffException, IOException {

		File file = new File("/home/j.benchamin/Downloads/Jenis/Testdata/sample.xls");
		
		FileInputStream fs =new FileInputStream(file);
		Workbook wb=Workbook.getWorkbook(fs);
		Sheet sheet=wb.getSheet("Sheet1");
		
		String cellData = sheet.getCell(0, 0).getContents();
		System.out.println(cellData);
		
	    cellData = sheet.getCell(0, 1).getContents();
	    System.out.println(cellData);
		
		
		
		
		
		
		
	}

}
