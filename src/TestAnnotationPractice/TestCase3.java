package TestAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {
	@BeforeTest 
	public void OpenDatabase()
	{
	 System.out.println("Data Base is Open");
	}
	
	@AfterTest
	public void CloseDatabase()
	{
	 System.out.println("Data Base is Close");
	}
	
	@BeforeClass
	public void OpenBrowser()
	{
	 System.out.println("Browser is open");
	}
	
	@AfterClass
	public void CloseBrowser()
	{
	 System.out.println("Browser is Close");
	}
	
	@Test
	public void m1()
	{
	 System.out.println("This is method m1");
	}
	
	@Test
	public void m2()
	{
	 System.out.println("This is method m2");
	}
	
	@Test
	public void m3()
	{
	 System.out.println("This is method m3 ");
	}


}
