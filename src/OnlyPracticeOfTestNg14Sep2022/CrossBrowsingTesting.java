package OnlyPracticeOfTestNg14Sep2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingTesting {
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void Twobrowsertesting (String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Downloads\\Automation Files\\New Browser Path\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Downloads\\Automation Files\\Browser path\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Wrong Browser is Selected By User");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	   }
	
	@Test
	public void verifycurrenturl ()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		Reporter.log("Verify The Current Url");
	}
	
	public void getpagetitle ()
	{
		Assert.assertEquals(driver.getTitle(), "Facebook");
	}
	
	public void setusernamefield ()
	{
		WebElement username = driver.findElement(By.xpath("//input[@name = 'email']"));
		Assert.assertNull(null);
		Assert.assertTrue(username.isEnabled(), "User Name field is not Enabled");
		username.sendKeys("Automation");
	}
	
	public void setpasswordfield ()
	{
		WebElement password = driver.findElement(By.xpath("//input[@name = '//input[@name = 'pass']']"));
		Assert.assertNull(null);
		Assert.assertTrue(password.isEnabled(), "Password field is not Enabled");
		password.sendKeys("Manual@Tester");
	}
	
	public void Clickonloginbtn ()
	{
		WebElement loginbtn = driver.findElement(By.xpath("//input[@name = '//input[@name = '//button[@name = 'login']']']"));
		Assert.assertTrue(loginbtn.isEnabled(), "Login button field is not Enabled");
		loginbtn.click();
	}
	
	
	
	
	
	
	
	
	

}
