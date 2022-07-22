package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart_Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
			
		driver.manage().window().maximize();
		
		Actions action= new Actions(driver);
		
		WebElement logIn = driver.findElement(By.partialLinkText("Log in"));
		action.moveToElement(logIn).click().perform();
		
		driver.findElement(By.id("Email")).sendKeys("manz@mass.com");
		
	    driver.findElement(By.id("Password")).sendKeys("mass123");
		
		WebElement btnLogIn = driver.findElement(By.xpath("//input[@value='Log in']"));
		action.moveToElement(btnLogIn).click().perform();
		
		WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu']//li[2]/a[contains(text(),'Computers')]"));
		action.moveToElement(computer).build().perform();
		
		Thread.sleep(3000);
		
		WebElement noteBooks = driver.findElement(By.xpath("//ul[@class='top-menu']//li[2]/a[contains(text(),'Notebooks')]"));
		action.moveToElement(noteBooks).click().perform();
		
		WebElement addToCart = driver.findElement(By.xpath("//input[@value='Add to cart']"));
	    action.moveToElement(addToCart).click().perform();
	    Thread.sleep(2000);
	    WebElement shoppingCart = driver.findElement(By.partialLinkText("cart"));
	    action.moveToElement(shoppingCart).click().perform();
	    
	    WebElement checkBox = driver.findElement(By.xpath("//input[@name='removefromcart']"));
	    action.moveToElement(checkBox).click().perform();
	    
	    WebElement updateCart = driver.findElement(By.xpath("//input[@name='updatecart']"));
	    action.moveToElement(updateCart).click().perform();
	    
	    WebElement logOut = driver.findElement(By.partialLinkText("Log out"));
	    action.moveToElement(logOut).click().perform();
	    
	    driver.close();
	   
		
		
		
		
		
		
		
		
		
	}
}
