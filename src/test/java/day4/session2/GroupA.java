package day4.session2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;

public class GroupA {
  @Test(groups = "smoke")
  public void firstTest() {
	  System.out.println("This is first test method in group A");
	  
  }
  
  @Test(groups = "functional")
  public void secondTest() {
	  System.out.println("This is second test method in group A");
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class method in group A");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class method in group A");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test method in group A");
  }

  @AfterClass
  public void afterTest() {
	  System.out.println("This is after test method in group A");
  }
}
