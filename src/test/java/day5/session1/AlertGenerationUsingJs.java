package day5.session1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertGenerationUsingJs {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='jenis@gmail.com'");
		js.executeScript("document.getElementById('enterimg').click()");
		
		js.executeScript("alert('Welcome to Selenium training')");
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		js.executeScript("confirm('Welcome to Selenium training')");
		Thread.sleep(3000);
		alert.accept();
		
		js.executeScript("prompt('Welcome to Selenium training','Agree/DisAgree')");
     	Thread.sleep(3000);
		alert.sendKeys("Agree");
		Thread.sleep(3000);
		alert.accept();
		

		
	}
	

}
