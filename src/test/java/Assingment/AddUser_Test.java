package Assingment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AddUser_Test {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		File file = new File("/home/j.benchamin/Downloads/Jenis/Testdata/Login_Testdata.xls");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook wb = Workbook.getWorkbook(fileInputStream);
		Sheet sheet = wb.getSheet("Sheet1");

		String txtuserName = sheet.getCell(0, 1).getContents();
		String txtpassWord = sheet.getCell(1, 1).getContents();

		driver.findElement(By.id("txtUsername")).sendKeys(txtuserName);
		driver.findElement(By.id("txtPassword")).sendKeys(txtpassWord);
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("Admin")).click();

		Actions action = new Actions(driver);
		WebElement lnkUserManagement = driver.findElement(By.linkText("User Management"));
		action.moveToElement(lnkUserManagement).build().perform();
		WebElement lnkUsers = driver.findElement(By.linkText("Users"));
		action.moveToElement(lnkUsers).click().perform();

		driver.findElement(By.id("btnAdd")).click();

		String userRole = sheet.getCell(2, 1).getContents();
		WebElement ddnUserRole = driver.findElement(By.id("systemUser_userType"));
		Select select = new Select(ddnUserRole);
		select.selectByVisibleText(userRole);

		String employeeName = sheet.getCell(3, 1).getContents();
		WebElement ddnEmployeeName = driver.findElement(By.id("systemUser_employeeName_empName"));
        ddnEmployeeName.sendKeys(employeeName);
		
		String userName = sheet.getCell(4, 1).getContents();
		WebElement txtUserName = driver.findElement(By.id("systemUser_userName"));
		txtUserName.sendKeys(userName);
		
		String status = sheet.getCell(5, 1).getContents();
		WebElement ddnStatus= driver.findElement(By.id("systemUser_status"));
		Select select2 = new Select(ddnStatus);
		select2.selectByVisibleText(status);
		
		String passWord = sheet.getCell(6, 1).getContents();
		WebElement txtPassWord = driver.findElement(By.id("systemUser_password"));
		txtPassWord.sendKeys(passWord);

		String confirmPassword = sheet.getCell(7, 1).getContents();
		WebElement txtConfirmPassWord = driver.findElement(By.id("systemUser_confirmPassword"));
		txtConfirmPassWord.sendKeys(confirmPassword);
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		

	}

}
