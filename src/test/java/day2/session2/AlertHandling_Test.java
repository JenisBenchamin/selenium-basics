package day2.session2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling_Test {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(text(),'click the button to display an  alert box:')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//*[contains(text(),'click the button to display a confirm box ')]")).click();
	    alert = driver.switchTo().alert();
		alert.dismiss();
		
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//*[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		alert = driver.switchTo().alert();
		alert.sendKeys("Selenium Training");
		
		
		
		
	}

}
