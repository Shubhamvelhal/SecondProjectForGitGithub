package VerificationInTestNg_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class practice {
	
	@Test
	public void sample3() {
		SoftAssert soft = new SoftAssert();
		
		String str1 = "Hello";
		soft.assertEquals( str1,"Hi");       // fail
		System.out.println(str1);
		
		String str2 = "Hi";
		soft.assertEquals(str2, "Hi");       // pass
		System.out.println(str2);
		soft.assertAll();
	}
	
	

		
	



}

	


