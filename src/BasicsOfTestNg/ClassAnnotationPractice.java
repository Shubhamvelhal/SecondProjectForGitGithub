package BasicsOfTestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotationPractice {
	
	@BeforeClass
	public void login()
	{
	 System.out.println("Logged into the Application");
	 Reporter.log("*** Login Succesfully***");
	}
	
	@AfterClass
	public void logout()
	{
	 System.out.println("Logged Out to the application");
	 Reporter.log("*** Logout Succesfully ***");
	}
	
	@Test(priority = 1)
	public void HomeElement()
	{
	 System.out.println("Checking the Home page URL");
	 Reporter.log("**Checking the homepage url**");
	}
	
	@Test(priority = 2)
	public void ProfileCheck()
	{
	 System.out.println("Checking the profile page url");
	 Reporter.log("**Checking the profile page url**");
	}
	
	@Test(priority = 3)
	public void Notificationpage()
	{
	 System.out.println("Checking the Notification page url");
	 Reporter.log("**Checking the Notification page url**");
	}
	
	

}
