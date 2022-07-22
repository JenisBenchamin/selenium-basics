package day5.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_Test {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.findElement(By.id("email")).sendKeys("manz1@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		
		WebDriverWait delay= new WebDriverWait(driver, 10);
		delay.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@ng-model='FirstName']")));
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Jenis");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Benchamin");
		driver.findElement(By.id("imagesrc")).sendKeys("/home/j.benchamin/Pictures/Screenshot37png");
		driver.findElement(By.xpath("//*[@ng-model='Adress' and @rows='3']")).sendKeys("Chennai");
        driver.close();
		
	}

}
