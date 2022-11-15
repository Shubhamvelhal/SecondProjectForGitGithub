package PageObjectModel_POM;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class RegistrationTest {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\Automation Files\\Browser path\\chromedriver.exe" );
	 driver = new ChromeDriver();	
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void Test()
	{
		RegistrationPage rgpage = new RegistrationPage(driver);
		
		rgpage.clickfacbooksignuplink();
		rgpage.verifyfacebooklogoinregistrationpage();
		rgpage.verifyfacebookregistrationpagealreadyhaveanaccount();
		rgpage.setfirstnameinregistrationpage();
		rgpage.setlastnameinregistrationpage();
		rgpage.setmobilenumberinregistrationpage();
		rgpage.setpasswordinregistrationpage();
		rgpage.setbirthdayinregistrationpage();
		rgpage.setbirthmonthinregistrationpage();
		rgpage.setbirthyearinregistrationpage();
		rgpage.setgenderinregistrationpage("GenderMale");
		rgpage.clickonsignupButton();
	}
	
	
	
	

}
