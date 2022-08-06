package testng.config2.dependsOn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;

public class BeforeGroupAfterGroupExample {
  @Test(groups = "g1")
  public void f1() {
	  System.out.println("f1");
  }
  @Test (groups = {"g1","g2"})
  public void f2() {
	  System.out.println("f2");
  }
  @Test (groups = "g2")
  public void f3() {
	  System.out.println("f3");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  
  @BeforeGroups
  public void beforeGroup() {
	  System.out.println("beforeGroups");
  }

  @AfterGroups
  public void afterGroup() {
	  System.out.println("afterGroups");
  }

}
