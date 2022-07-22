package day3.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandling_Test {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("manz1@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		try {
			driver.findElement(By.linkText("manz@mass.com"));
			System.out.println("Login Success");
		}catch(NoSuchElementException e) 
		{
			System.out.println("Login failed");
			
		}finally {
			driver.close();
		}
		
	
	}

}
