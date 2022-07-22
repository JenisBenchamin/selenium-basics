package Assingment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class AptechCareerGuidance_Test {
	WebDriver driver;

	@Test(dataProvider = "dp")
	public void testCareerGuidance(String name, String phNo, String email, String course, String state, String centre) {

		driver.findElement(By.id("txtFName")).sendKeys(name);
		driver.findElement(By.id("tb_phone")).sendKeys(phNo);
		driver.findElement(By.id("txtEmail")).sendKeys(email);

		WebElement ddlCourses = driver.findElement(By.id("ddl_courses"));
		Select select = new Select(ddlCourses);
		select.selectByVisibleText(course);

		WebElement ddlStates = driver.findElement(By.id("ddl_states"));
		select = new Select(ddlStates);
		select.selectByVisibleText(state);

		WebElement ddlCentres = driver.findElement(By.id("ddl_centres"));
		select = new Select(ddlCentres);
		select.selectByVisibleText(centre);

		driver.findElement(By.id("btn_submit")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement careerGuidanceFrame = driver
				.findElement(By.xpath("//div[@class='homepage_banner_right']//iframe[@frameborder='0']"));
		driver.switchTo().frame(careerGuidanceFrame);

	}

	@AfterMethod
	public void afterMethod() {

		driver.switchTo().defaultContent();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "Jenis", "9876543210", "manz123@gmail.com", "Data Science", "DELHI",
				"DELHI - JANAKPURI" } };
	}

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aptechlearning.com/it");

	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
