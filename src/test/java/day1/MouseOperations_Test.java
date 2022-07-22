package day1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperations_Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
			
		driver.manage().window().maximize();
		
		WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu']//li[2]/a[contains(text(),'Computers')]"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(computer).build().perform();
		
		Thread.sleep(3000);
		
		WebElement noteBooks = driver.findElement(By.xpath("//ul[@class='top-menu']//li[2]/a[contains(text(),'Notebooks')]"));
		
		action.moveToElement(noteBooks).click().perform();
		
		driver.close();
		
		
	}
}
