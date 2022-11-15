package VerificationInTestNg_Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisadvantagesOfAssert {
	
//1.If a test class containing multiple test methods and one of the test contains multiple verification point and while executing if one of the execution is failed then
   // rest of the verification will not be verified and testng will execute next method by failing verification  field method.

//	@Test
//	public void Test1()
//	{
//		Reporter.log("Test Case 1");   // Failed
//		Assert.fail();
//	}
//	
//    @Test
//	public void Test2()
//	{
//		Reporter.log("Test Case 2");  // Pass
//	}
	
//2. In a test class if one of the test method failed and test method required for other test methods then other test methods will be skipped.

//	 @Test
//	 public void Test1()
//	 {
//		 Reporter.log("Test Case 1");
//		 Assert.fail();
//	 }
//	 
//	 @Test(dependsOnMethods = "Test1")
//	 public void Test2()
//	 {
//		 Reporter.log("Test Case 2");
//	  }
	
//3.If a test class containing multiple test methods and one of the test contains multiple verification point and while executing if one of the execution is failed then
 // rest of the verification will not be verified and testng will execute next method by failing verification  field method.


	@Test  // hard assert.
	public void sample1() {
		
		String str1 = "Hello";
		Assert.assertEquals(str1, "Hi");      // fail
		System.out.println(str1);
		
		String str2 = "Hi";
		Assert.assertEquals(str2, "Hi");      // pass
		System.out.println(str2);
	}
	
	@Test
	public void sample2() {
		System.out.println("Automation");    // pass
	}
	  
	
	





}
