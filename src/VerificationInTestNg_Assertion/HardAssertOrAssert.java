package VerificationInTestNg_Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertOrAssert {
	
	// 1. assertEquals() :- Expected and Actual results are same then pass
	
//	String str1 = "Hello";
//	String str2 = "Hi";
//	
//	@Test 
//	public void sample()
//	{
//		Assert.assertEquals(str1, str2); 
//	}
	
	// 2. assertNotEquals() :- Expected and Actual results are not same then pass

//	String str1 = "items";
//	String str2 = "products";
//	@Test
//	public void sample()
//	{
//	 Assert.assertNotEquals(str1, str2);
//	 }
	
	// 3. assertTrue() :- Use to Verify Conditions if conditions are true then pass ,condition is false results is fail
	
//	@Test
//	public void sample()
//	{
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com/"); 
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement login = driver.findElement(By.xpath("//input[@name='email']"));
//	Assert.assertTrue(login.isEnabled());
//	Assert.assertTrue(login.isDisplayed());
//	login.click();
//	Assert.assertTrue(login.isSelected());
//	driver.close();
//   }

    // 4. assertFalse():- Condition is true thne result is false and Condition is false result is pass	
 
//	@Test
//    public void sample()
//    {
//    System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
//    driver.get("https://www.facebook.com/"); 
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    WebElement login = driver.findElement(By.xpath("//input[@name='email']"));
//    login.click();
//    Assert.assertFalse(login.isSelected());
//    driver.close();
//    }
	
	// 5.assertNull ():- 
	
//	String str1 = "Hello";
//	String str2 = "Hi";
//	@Test
//	public void sample()
//	{
//		Assert.assertNull(str1); // Output = Fail
//	}
	
	//6 assertNotNull():-
	
//	String str1 = "Hello";
//	String str2 = "Hi";
//	@Test
//	public void sample()
//	{
//		Assert.assertNotNull(str1);  // Output = pass
//	}
	
	// 7. Fail():- Intentionally doing fail the test method
	
//	String str1 = "Hello";
//	String str2 = "Hi";
//	@Test
//	public void sample()
//	{
//		System.out.println("str1");
//		Assert.fail();
//	}
 }
