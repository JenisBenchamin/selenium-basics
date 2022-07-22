package day5.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementHandlingUsingJs {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='jenis@gmail.com'");
		js.executeScript("document.getElementById('enterimg').click()");
		WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		js.executeScript("arguments[0].value='Jenis'", firstName);
	}

}
