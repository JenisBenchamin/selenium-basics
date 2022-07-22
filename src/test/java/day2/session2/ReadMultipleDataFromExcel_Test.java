package day2.session2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadMultipleDataFromExcel_Test {

	public static void main(String[] args) throws BiffException, IOException {

		File file = new File("/home/j.benchamin/Downloads/Jenis/Testdata/sample.xls");

		FileInputStream fs = new FileInputStream(file);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sheet = wb.getSheet("Sheet1");
		int rc = sheet.getRows();
		int cc = sheet.getColumns();
	

		for (int i = 0; i < rc; i++) {

			for (int j = 0; j < cc; j++) {

				String cellData = sheet.getCell(j, i).getContents();
				System.out.println("value stored at" + " " + i + "row and" + " " + "value stored at" + " " + j + " "
						+ "coloumn:" + " " + cellData);

			}

		}

	}

}
