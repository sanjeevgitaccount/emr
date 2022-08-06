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

public class TestNGAnnotations2 {
  @Test (groups = "Regression" )
  public void test1() {
	  System.out.println("@Test - test1 method inside TestNGAnnotations2");
  }
  @Test (groups = {"Smoke", "Regression"} )
  public void test2() {
	  System.out.println("@Test - test2 method inside TestNGAnnotations2");
  }
  @Test (groups = {"Smoke", "Regression"} )
  public void test4() {
	  System.out.println("@Test - test2 method inside TestNGAnnotations2");
  }
  
  @Test (groups = "Smoke" )
  public void test3() {
	  System.out.println("@Test - test2 method inside TestNGAnnotations2");
  }
  @BeforeMethod (groups = {"Smoke", "Regression"} )
  public void beforeMethod() {
	  System.out.println("@BeforeMethod method inside TestNGAnnotations2");
  }

  @AfterMethod (groups = {"Smoke", "Regression"} )
  public void afterMethod() {
	  System.out.println("@AfterMethod method inside TestNGAnnotations2");
  }

  @BeforeClass (groups = {"Smoke", "Regression"} )
  public void beforeClass() {
	  System.out.println("@BeforeClass method inside TestNGAnnotations2");
  }

  @AfterClass (groups = {"Smoke", "Regression"} )
  public void afterClass() {
	  System.out.println("@AfterClass method inside TestNGAnnotations2");
  }

  @BeforeTest (groups = {"Smoke", "Regression"} )
  public void beforeTest() {
	  System.out.println("@BeforeTest method inside TestNGAnnotations2");
  }

  @AfterTest (groups = {"Smoke", "Regression"} )
  public void afterTest() {
	  System.out.println("@AfterTest method inside TestNGAnnotations2");
  }

  @BeforeSuite (groups = {"Smoke", "Regression"} )
  public void beforeSuite() {
	  System.out.println("@BeforeSuite method inside TestNGAnnotations2");
  }

  @AfterSuite (groups = {"Smoke", "Regression"} )
  public void afterSuite() {
	  System.out.println("@AfterSuite method inside TestNGAnnotations2");
  }

}
