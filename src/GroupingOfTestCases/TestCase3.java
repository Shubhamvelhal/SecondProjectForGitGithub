package GroupingOfTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {
	
	
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
	public void Test7()
	{
	 System.out.println("Running the Method Test7");
	}
	
	@Test(groups = "Functional")
	public void Test8()
	{
	 System.out.println("Running the Method Test8");
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test9()
	{
	 System.out.println("Running the Method Test9");
	
	}


}
