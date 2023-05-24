package testNGpackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestCase3 {
  @Test
 public void TestCase1() {
	  
	  Reporter.log("TestCase1-3",true);
	  
  }
  
 public void TestCase2() {
	  
	 int i = 23;
	 int j= 0;
	 int res= i/j;
	  Reporter.log("res",true);
	  
  }
 
 public void TestCase3() {
	  
	  Reporter.log("TestCase3-3",true);
	  
 }
}
