package day5.session2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportGenerationUsingExtendsReport {

	public static void main(String[] args) {

		ExtentReports extent;
		ExtentTest extentTest;

		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/report.html");
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
		extentTest = extent.startTest("launch browser");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		extentTest.log(LogStatus.PASS, title);
        extent.endTest(extentTest);
        
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manz@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String loginText = driver.findElement(By.linkText("manz@mass.com")).getText();
		extentTest.log(LogStatus.PASS, loginText);
		extent.endTest(extentTest);
		driver.close();
		extent.flush();
		extent.close();
	}

}
