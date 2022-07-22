package day3.session2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginValidationUsingJunit_Test {
    
	WebDriver driver;
	
	@Before
	public void launch() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
	}

	@Test
	public void test() {
		driver.findElement(By.id("Email")).sendKeys("manz1@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		boolean loginLink = driver.findElement(By.linkText("manz1@mass.com")).isDisplayed();
		Assert.assertEquals(true, loginLink);
		
	}

	@After
	public void closeApp() throws Exception {
		driver.close();
	}

	
}
