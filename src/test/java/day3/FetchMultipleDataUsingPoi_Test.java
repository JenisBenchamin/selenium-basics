package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class FetchMultipleDataUsingPoi_Test {

	public static void main(String[] args) throws IOException {

		FileInputStream fs=new FileInputStream(new File("/home/j.benchamin/Downloads/Jenis/Testdata/sample.xls"));
		
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rc = sheet.getLastRowNum();
		System.out.println("Total number of rows = "+rc);
		
		for (int i = 0; i < rc; i++) {
			
			int cc = sheet.getRow(i).getLastCellNum();
			System.out.println("Total number of columns = "+cc);
			
			for (int j = 0; j < cc; j++) {
				
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("The value in "+i+ " row and "+j+" coloumn is "+ cellValue);
				
			}
			
		}
		
		
	}

}
