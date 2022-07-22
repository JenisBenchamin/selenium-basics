package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectValues_Test {
	
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
		
		WebElement sortBy= driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select select = new Select(sortBy);
		
		select.selectByVisibleText("Price: Low to High");
		
		WebElement display = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		
		Select select1 = new Select(display);
		
		select1.selectByValue("http://demowebshop.tricentis.com/notebooks?orderby=10&pagesize=12");
		
	    Thread.sleep(3000);
	    
	    driver.close();
		
		
		
		
		
		
	}

}
