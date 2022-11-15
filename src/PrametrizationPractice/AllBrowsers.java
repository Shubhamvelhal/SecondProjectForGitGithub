package PrametrizationPractice;

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

public class AllBrowsers {
	WebDriver driver;	
	
	@Parameters("browser")	
	@Test(priority = 1)
	public void crossbrowsertesting(String  browser)
	 {
	  if(browser.equalsIgnoreCase("chrome")) 
	 {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\Automation Files\\Browser path\\chromedriver.exe");
	  driver = new ChromeDriver();
	 }
	  else if (browser.equalsIgnoreCase("firefox"))
	 {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\shubham\\Downloads\\Automation Files\\Browser path\\geckodriver.exe" );
	  driver = new FirefoxDriver();
	 }
	  else
	 {
	  System.out.println("The Wrong Browser is Selected by the User");
	  }
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
      
	   @Test(priority = 2)
	   public void Verifycurrenturl()
      {
	   Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
	   System.out.println(driver.getCurrentUrl());
	   Reporter.log("***Getting Current Url***");
	  }
		
	   @Test(priority = 3)
	   public void getpageTitle()
	  {
	   Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	   System.out.println(driver.getTitle());
	   Reporter.log("***Getting Page Title***");
	  }
		
       @Test(priority = 4)
	   public void VerifyUsernamefield()
	  {
	   WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
       Assert.assertTrue(username.isDisplayed());
	   username.sendKeys("Automation");
	   Reporter.log("***UserName Field Displayed and Value is Entered Sucesfully***");
	   }
		
       @Test(priority = 5)
	   public void verifypasswordfield()
	  {
	   WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	   Assert.assertTrue(password.isDisplayed());
	   password.sendKeys("Enfineering@Test");
	   Reporter.log("***Passwod Field Displayed and Value is Entered Sucesfully***");
	  }
		
	    @Test(priority = 6)
		public void clickLoginbutton()
	   {
		WebElement Loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(Loginbtn.isDisplayed());
		Loginbtn.click();
		driver.close();
		Reporter.log("***Login is Succesfully***");
		}
	    
	   
	}



