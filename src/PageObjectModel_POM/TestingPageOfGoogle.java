package PageObjectModel_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestingPageOfGoogle {
	WebDriver driver; 	
	
	@BeforeClass
	public void setup() 
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\Automation Files\\Browser path\\chromedriver.exe" );
	 driver = new ChromeDriver();	
     driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     }
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void TestingPageOfGoogleAcc()
	{
		GoogleCreateAccountPage gcap = new GoogleCreateAccountPage(driver);
		
		gcap.verifygooglelogoinGoogleCreateAccountPage();
		gcap.verifygoogleTaglineCreateYourGoogleAccount();
		gcap.verifyHelpOptioninGoogleCreateAccountPage();
		gcap.verifyPrivacyOptioninGoogleCreateAccountPage();
		gcap.verifysignininsteadlink();
		gcap.verifytheFigureCaption();
		gcap.verifytheLogoonceaccountallgoogle();
		gcap.verifyTermsOptioninGoogleCreateAccountPage();
		gcap.verifyUsecurrentEmailaddress();
		gcap.setFirstnameinGoogleCreateAccountPage();
		gcap.setLastnameinGoogleCreateAccountPage();
		gcap.setPasswordinGoogleCreateAccountPage();
		gcap.setConfirmPasswordinGoogleCreateAccountPage();
		gcap.clickonNextButtoninGoogleCreateAccountPage();
	}
	
	
	
	
}
