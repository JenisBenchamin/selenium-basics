package day4;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DataDrivenUsingTestng_Test {
	WebDriver driver;

	@Test(dataProvider = "dp")
	public void testLogin(String email, String password) {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "manz@mass.com", "mass123" },
				new Object[] { "manz1@mass.com", "mass123" }, };
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
