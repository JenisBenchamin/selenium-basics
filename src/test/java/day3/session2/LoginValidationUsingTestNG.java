package day3.session2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginValidationUsingTestNG {
	WebDriver driver;

	@Test(priority = 1,alwaysRun = true)
	public void testLogin() {
		driver.findElement(By.id("Email")).sendKeys("manz1@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String expected="manz@mass.com";
		String loginLink = driver.findElement(By.linkText("manz1@mass.com")).getText();
		Assert.assertEquals(loginLink, expected);
	}
	
	@Test(priority = 2,dependsOnMethods =  "testLogin",alwaysRun = true)
	public void testLogout() {
		
		driver.findElement(By.linkText("Log out")).click();
		
	}
	
	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
