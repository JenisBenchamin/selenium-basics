package day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass_Test {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement logInLink = driver.findElement(By.linkText("Log in"));
		action.contextClick(logInLink).perform();
		
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot .keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot .keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot .keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
