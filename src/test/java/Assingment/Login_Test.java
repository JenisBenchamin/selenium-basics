package Assingment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_Test {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		File file = new File("/home/j.benchamin/Downloads/Jenis/Testdata/Login_Testdata.xls");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook wb = Workbook.getWorkbook(fileInputStream);
		Sheet sheet = wb.getSheet("Sheet1");
		
		String userName = sheet.getCell(0, 1).getContents();
		String passWord = sheet.getCell(1, 1).getContents();
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		
		
		
		
		
		
	}

}
