package GroupingOfTestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	
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
	public void Test4()
	{
	 System.out.println("Running the Method Test4");
	}
	
	@Test(groups = "Functional")
	public void Test5()
	{
	 System.out.println("Running the Method Test5");
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test6()
	{
	 System.out.println("Running the Method Test6");
	}


}
