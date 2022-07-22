package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchValues_Test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: \n"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is: \n"+currentUrl);
		
		WebElement logIn = driver.findElement(By.linkText("Log in"));
		boolean status = logIn.isDisplayed();
		System.out.println("Log in displayed: \n"+status);
		
		String text = logIn.getText();
		System.out.println("Text in link is: \n"+text);
		logIn.click();
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("manz@mass.com");
		String emailValue = email.getAttribute("value");
		System.out.println("Text entered in Email is: \n"+emailValue);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
