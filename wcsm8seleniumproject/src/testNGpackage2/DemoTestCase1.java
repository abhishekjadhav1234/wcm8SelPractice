package testNGpackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestCase1 {
  @Test
  public void TestCase1() {
	  
	  Reporter.log("TestCase1",true);
	  
  }
  
 public void TestCase2() {
	  
	  Reporter.log("TestCase2",true);
	  
  }
 
 public void TestCase3() {
	  
	  Reporter.log("TestCase3",true);
	  
 }
}
