package testng.config2.dependsOn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations1 {
	@Test (groups = "Regression", dependsOnMethods = "test2")
	public void test1() {
		System.out.println("@Test - test1 method inside TestNGAnnotations1");
	}

	@Test (groups = "Regression")
	public void test2() {
		System.out.println("@Test - test2 method inside TestNGAnnotations1");
		//Assert.fail();
	}

	@BeforeMethod 
	public void beforeMethod() {
		System.out.println("@BeforeMethod method inside TestNGAnnotations1");
	}

	@AfterMethod 
	public void afterMethod() {
		System.out.println("@AfterMethod method inside TestNGAnnotations1");
	}

	@BeforeClass 
	public void beforeClass() {
		System.out.println("@BeforeClass method inside TestNGAnnotations1");
	}

	@AfterClass 
	public void afterClass() {
		System.out.println("@AfterClass method inside TestNGAnnotations1");
	}

	@BeforeTest 
	public void beforeTest() {
		System.out.println("@BeforeTest method inside TestNGAnnotations1");
	}

	@AfterTest 
	public void afterTest() {
		System.out.println("@AfterTest method inside TestNGAnnotations1");
	}

	@BeforeSuite 
	public void beforeSuite() {
		System.out.println("@BeforeSuite method inside TestNGAnnotations1");
	}

	@AfterSuite 
	public void afterSuite() {
		System.out.println("@AfterSuite method inside TestNGAnnotations1");
	}

}
