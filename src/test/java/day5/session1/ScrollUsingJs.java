package day5.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUsingJs {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='jenis@gmail.com'");
		js.executeScript("document.getElementById('enterimg').click()");
		/*
		 * js.executeScript("window.scrollBy(0,50)"); Thread.sleep(3000);
		 * js.executeScript("window.scrollBy(0,50)"); Thread.sleep(3000);
		 * js.executeScript("window.scrollBy(0,-50)");
		 */
		/*
		 * WebElement pageLast = driver.findElement(By.id("submitbtn"));
		 * js.executeScript("arguments[0].scrollIntoView(true)",pageLast);
		 * Thread.sleep(3000); WebElement pageUp =
		 * driver.findElement(By.xpath("//div[@class='col-sm-8 col-xs-8 col-md-8']"));
		 * js.executeScript("arguments[0].scrollIntoView(false)",pageUp);
		 */
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollWidth)");
		
	}

}
