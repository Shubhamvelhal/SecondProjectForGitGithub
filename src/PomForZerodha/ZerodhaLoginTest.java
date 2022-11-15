package PomForZerodha;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZerodhaLoginTest {
	WebDriver driver;

  @BeforeClass
  public void Setup() 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Downloads\\Automation Files\\Browser path\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @AfterClass
  public void teardown()
  {
	  driver.quit();
  }
 
  @Test
  public void Logintest()
  {
	  ZerodhaLoginpage zlp = new ZerodhaLoginpage(driver);
	  
	  zlp.VerifyzerodhaLogoinLoginpage();
	  zlp.VerifyLogintoKitemeassageinloginpage();
	  zlp.verifyForgotuserIDorpasswordlinkinloginpage();
	  zlp.verifyDonthaveanaccountlinkinloginpage();
	  zlp.verifylogoofplaystoreforkitemobileapp();
	  zlp.verifylogoofapplestoreforkitemobileapp();
	  zlp.Setuseridfield();
	  zlp.SetPasswordfield();
	  zlp.Clickonloginbuttoninzerodhaloginpage();
	  zlp.setpin();
	  zlp.clickoncontinuebutton();
	  
	  
	  
  }

}
