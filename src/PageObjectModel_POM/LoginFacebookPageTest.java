package PageObjectModel_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginFacebookPageTest {
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
	public void LoginFacebookPageTest()
	{
		FacebookLoginPageVerify fblp = new FacebookLoginPageVerify(driver);
		
		fblp.VerifyTheFacebookLogoinLoginPage();
		fblp.VerifytheFacebookMessagefromLoginPage();
		fblp.VerifyFacebookCreateNewAccountButton();
		fblp.VerifyFacebookCreatePageforCelebrityButton();
		fblp.VerifyFacebookForgottenPasswordlink();
		fblp.verifyfooterlinks();
		fblp.setUsernameinUsernameField();
		fblp.setPasswordinPasswordField();
		fblp.ClickOnLoginButton();
	}
	

}
