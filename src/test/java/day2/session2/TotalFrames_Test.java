package day2.session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalFrames_Test {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames in the page:"+" "+frames.size());
		
		for(int i=0;i<frames.size();i++) {
			
			String frameName = frames.get(i).getText();
			System.out.println("The frame name is:"+" "+frameName);
		}
		
		driver.close();
		
	}

}
