package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalExecution_Test {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("Email")).sendKeys("manz@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		if (driver.findElement(By.linkText("manz@mass.com")).isDisplayed()) {

			System.out.println("Login success");
		} else
			System.out.println("Login failed");

		driver.close();

	}

}
