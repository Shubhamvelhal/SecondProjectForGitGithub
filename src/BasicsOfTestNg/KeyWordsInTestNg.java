package BasicsOfTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeyWordsInTestNg {

	@Test(priority = 1)
	public void openurl()
	{
	 System.out.println("Url is opened");
//	 Assert.fail();
	}
	
	@Test(priority = 2,dependsOnMethods = "openurl")
	public void login()
	{
	 System.out.println("Logged into the Application");
	 Reporter.log("*** Login Succesfully***");
	}
	
	@Test(priority = 6,dependsOnMethods = "openurl")
	public void logout()
	{
	 System.out.println("Logged Out to the application");
	 Reporter.log("*** Logout Succesfully ***");
	}
	
	@Test(priority = 3, invocationCount = 1,timeOut  = 5000)
	public void HomeElement() throws InterruptedException
	{
	 Thread.sleep(4000);
	 System.out.println("Checking the Home page URL");
	 Reporter.log("**Checking the homepage url**");
	}
	
	@Test(priority = 4,invocationCount= 1, enabled = false)
	public void ProfileCheck()
	{
	 System.out.println("Checking the profile page url");
	 Reporter.log("**Checking the profile page url**");
	}
	
	@Test(priority = 5,invocationCount  = 2)
	public void Notificationpage()
	{
	 System.out.println("Checking the Notification page url");
	 Reporter.log("**Checking the Notification page url**");
	}
	
	
}
