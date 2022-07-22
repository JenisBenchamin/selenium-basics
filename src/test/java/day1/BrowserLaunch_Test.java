package day1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch_Test {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");

		driver.manage().window().maximize();
		
		Dimension size2 = driver.manage().window().getSize();
		size2.getHeight();
		size2.getWidth();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]"));

		int size = findElements.size();

		for (WebElement webElement : findElements) {

			String text = webElement.getText();
			System.out.println(text);

		}

		/*
		 * String text = findElements.getText(); System.out.println(text);
		 */
          
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		for(String x:windowHandles) {
			
			if(!parentWindow.equals(x)){
				
			   driver.switchTo().window(x);
			   driver.switchTo().defaultContent();
			}
		}
	}
}
