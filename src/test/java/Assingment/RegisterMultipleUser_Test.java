package Assingment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.read.biff.BiffException;

public class RegisterMultipleUser_Test {

	public static void main(String[] args) throws BiffException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@value='M']")).click();
		
		File file = new File("/home/j.benchamin/Downloads/Jenis/Testdata/Demo_Login_TestData.xls");
		FileInputStream fileInputStream = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(fileInputStream);
        HSSFSheet sheet = wb.getSheet("Sheet1");
        int rc = sheet.getLastRowNum();
		for (int i = 1; i< rc; i++) {
			
			String firstName = sheet.getRow(i).getCell(1).getStringCellValue();
			String lastName = sheet.getRow(i).getCell(2).getStringCellValue();
			String email = sheet.getRow(i).getCell(3).getStringCellValue();
			String passWord = sheet.getRow(i).getCell(4).getStringCellValue();
			String comfirmPassword = sheet.getRow(i).getCell(5).getStringCellValue();
			
			driver.findElement(By.id("FirstName")).sendKeys(firstName);
			driver.findElement(By.id("LastName")).sendKeys(lastName);
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(passWord);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(comfirmPassword);
			driver.findElement(By.id("register-button")).click();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
