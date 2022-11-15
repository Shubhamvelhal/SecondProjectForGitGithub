package GroupingOfTestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeSuite(alwaysRun = true)
	public void ConfigureServer()
	{
	 System.out.println("Configure the Server");
	}
	
	@AfterSuite(alwaysRun = true)
	public void CloseServer()
	{
	 System.out.println("Close the Server");
	}
	
	@BeforeTest(alwaysRun = true)
	public void OpenDataBase()
	{
	 System.out.println("Data base is Open");
	}
	
	@AfterTest(alwaysRun = true)
	public void CloseDataBase()
	{
	 System.out.println("Data base is Close");
	}
	
	@BeforeClass(alwaysRun = true)
	public void OpenBrowser()
	{
	 System.out.println("Browser is Opened");
	}
	
	
	
	@AfterClass(alwaysRun = true)
	public void CloseBrowser()
	{
	 System.out.println("Browser is Closed");
	}
	
	@Test(groups = "Smoke")
	public void Test1()
	{
	 System.out.println("Running the Method Test1");
	}
	
	@Test(groups = "Functional")
	public void Test2()
	{
	 System.out.println("Running the Method Test2");
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test3()
	{
	 System.out.println("Running the Method Test3");
	}

}
