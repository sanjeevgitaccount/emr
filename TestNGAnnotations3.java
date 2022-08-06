package testng.config2.dependsOn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations3 {
  @Test
  public void test1() {
	  System.out.println("@Test - test1 method inside TestNGAnnotations3");
  }
  @Test (groups = {"Regression"})
  public void test2() {
	  System.out.println("@Test - test2 method inside TestNGAnnotations3");
  }
  @BeforeMethod (groups = "Regression" )
  public void beforeMethod() {
	  System.out.println("@BeforeMethod method inside TestNGAnnotations3");
  }

  @AfterMethod (groups = "Regression" )
  public void afterMethod() {
	  System.out.println("@AfterMethod method inside TestNGAnnotations3");
  }

  @BeforeClass (groups = "Regression" )
  public void beforeClass() {
	  System.out.println("@BeforeClass method inside TestNGAnnotations3");
  }

  @AfterClass (groups = "Regression" )
  public void afterClass() {
	  System.out.println("@AfterClass method inside TestNGAnnotations3");
  }

  @BeforeTest (groups = "Regression" )
  public void beforeTest() {
	  System.out.println("@BeforeTest method inside TestNGAnnotations3");
  }

  @AfterTest (groups = "Regression" )
  public void afterTest() {
	  System.out.println("@AfterTest method inside TestNGAnnotations3");
  }

  @BeforeSuite (groups = "Regression" )
  public void beforeSuite() {
	  System.out.println("@BeforeSuite method inside TestNGAnnotations3");
  }

  @AfterSuite (groups = "Regression" )
  public void afterSuite() {
	  System.out.println("@AfterSuite method inside TestNGAnnotations3");
  }

}
