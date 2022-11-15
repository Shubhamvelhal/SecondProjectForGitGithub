package BasicsOfTestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UseofAnnotations {
	
	@BeforeMethod
	public void login() 
	{
	    System.out.println("Login to the Page");
	    Reporter.log("*******Login*******");
	}
	
	@AfterMethod
	public void logout()
	{
	     System.out.println("Logout to the page");
	     Reporter.log("********Logout********");
	}
	
	@Test (priority = 1)
	public void homepagecheck()
	{
		System.out.println("Checking the home Page");
		Reporter.log("*******Home Page*******");
	}
	
	@Test (priority = 3)
	public void Profilepagecheck()
	{
		System.out.println("Checking the Profile page");
		Reporter.log("******Profile Page*******");
	}
	
	@Test (priority = 2)
	public void notificationpage()
	{
		System.out.println("Checkinh the Notification page");
		Reporter.log("******** Notification page*******");
	}

}
