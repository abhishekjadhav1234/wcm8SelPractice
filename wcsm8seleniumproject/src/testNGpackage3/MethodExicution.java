package testNGpackage3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExicution {
  @Test
  public void method1() {
	  
	  long threadid= Thread.currentThread().getId();
	  Reporter.log(threadid + "is hte threadid of the method" , true);
	  Reporter.log("method1", true);
  }
  
 public void method2() {
	  
	  long threadid1= Thread.currentThread().getId();
	  Reporter.log(threadid1 + "is hte threadid of the method" , true);
	  Reporter.log("method2", true);
  }
}
