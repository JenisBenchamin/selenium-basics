package day4;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AnnotationDrivenTestingInTestng {
	WebDriver driver;

	@Test
	public void testLogin() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manz@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}

	@Test
	public void testRegister() {

		driver.findElement(By.linkText("Register")).click();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("The test execution is successful");

	}

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
