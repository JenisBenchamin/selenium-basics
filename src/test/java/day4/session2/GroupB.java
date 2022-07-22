package day4.session2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;

public class GroupB {
  @Test(groups = "smoke")
  public void firstTest() {
	  System.out.println("This is first test method in group B");
  }
  
  @Test(groups = "smoke")
  public void secondTest() {
	  System.out.println("This is second test method in group B");
  }
  
  @Test(groups = "functional")
  public void thirdTest() {
	  System.out.println("This is third test method in group B");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class method in group B");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class method in group B");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test method in group B");
  }

  @AfterClass
  public void afterTest() {
	  System.out.println("This is after test method in group B");
  }
}

