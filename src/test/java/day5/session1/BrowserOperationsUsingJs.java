package day5.session1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOperationsUsingJs {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		/*
		 * String title = js.executeScript("return document.title").toString();
		 * System.out.println(title); String domain =
		 * js.executeScript("return document.domain").toString();
		 * System.out.println(domain); String url =
		 * js.executeScript("return document.URL").toString(); System.out.println(url);
		 */
		
		//js.executeScript("window.location='https://google.com'");
		js.executeScript("document.getElementById('email').value='jenis'");
		js.executeScript("document.getElementById('enterimg').click()");
		
	}

}
