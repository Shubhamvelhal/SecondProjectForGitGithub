package BasicsOfTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IntroductionToTestNg {
	
	@Test
	public void openurl() 
	{
	 System.out.println("open url then Login the page");
	 Reporter.log("Url is opened");
	}
	
	@Test 
	public void login()
	{
	 System.out.println("Login is Succesfully");
	 Reporter.log("Login is Suceesfull");
	}
	@Test 
	public void logout()
    {
	 System.out.println("Logout is succesfull");
	 Reporter.log("Logout is Succesfull");
	 Reporter.log("All events are Completed Sccesfully");
    }

}
