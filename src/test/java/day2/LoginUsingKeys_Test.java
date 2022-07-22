package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUsingKeys_Test {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		driver.findElement(By.linkText("Log in")).click();
		
		WebElement email = driver.findElement(By.id("Email"));
		action.moveToElement(email).sendKeys("manz@mass.com").perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys("mass123").perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.linkText("Log out")).click();
		
		driver.close();
		
		
		
		
	}

}
