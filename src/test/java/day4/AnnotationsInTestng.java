package day4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsInTestng {
  @Test
  public void firstTest() {
	  System.out.println("this is first test");
  }
  
  @Test
  public void secondTest() {
	  System.out.println("this is second test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
  }

}
