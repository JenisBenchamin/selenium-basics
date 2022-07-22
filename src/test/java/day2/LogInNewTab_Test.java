package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInNewTab_Test {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");

		driver.manage().window().maximize();

		WebElement logInLink = driver.findElement(By.linkText("Log in"));
		//logInLink.sendKeys(Keys.CONTROL,Keys.RETURN);
		
		logInLink.sendKeys(Keys.SHIFT,Keys.ENTER);
		
		driver.quit();
		
	}

}
