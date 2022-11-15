package PageObjectModel_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class GoogleCreateAccountPage {
	
	// Declaration
	// Object Repository
	
	@FindBy(xpath = "//div[@title= 'Google']") private WebElement google_logo;
	@FindBy(xpath = "//span[text()='Create your Google Account']") private WebElement Tagcreategoogleaccount;
	@FindBy(xpath = "//img[@class='j9NuTc TrZEUc']") private WebElement logo_onceaccountallgoogle;
	@FindBy(xpath = "//figcaption[text()='One account. All of Google working for you.']") private WebElement FigureCaption;
	@FindBy(xpath = "//span[text()='Use my current email address instead']") private WebElement UsecurrentEmailaddress;
	@FindBy(xpath = "//span[text()='Sign in instead']") private WebElement signininstead;
	@FindBy(name = "firstName") private WebElement FirstName;
	@FindBy(name = "lastName") private WebElement LastName;
	@FindBy(name = "Username") private WebElement Username;
	@FindBy(name = "Passwd") private WebElement Password;
	@FindBy(name = "ConfirmPasswd") private WebElement ConfirmPassword;
    @FindBy(xpath = "//a[text()='Help']") private WebElement Help_Opt;
	@FindBy(xpath = "//a[text()='Privacy']") private WebElement Privacy_Option;
	@FindBy(xpath = "//a[text()='Terms']") private WebElement Terms_Opt;
	@FindBy(xpath = "//span[text()='Next']") private WebElement NextButton;
	
	// Initialisation
	
	
	public GoogleCreateAccountPage(WebDriver driver) 
	{
	 PageFactory.initElements(driver, this);
	
	}
	
	public void verifygooglelogoinGoogleCreateAccountPage()
	{
	 Assert.assertTrue(google_logo.isDisplayed(),"Google logo is not displayed on create new account page");
	 Reporter.log("VerifyGooglelogoinGoogleCreateAccountPage",true);
	}
	
	public void verifygoogleTaglineCreateYourGoogleAccount()
	{
	 Assert.assertTrue(Tagcreategoogleaccount.isDisplayed(), "Tagline is not diplayed on google create new account page");
	 Assert.assertEquals(Tagcreategoogleaccount.getText(),"Create your Google Account");
	 Reporter.log("verifygoogleTaglineCreateYourGoogleAccount",true);
	}
	
	public void verifytheLogoonceaccountallgoogle ()
	{
	 Assert.assertTrue(logo_onceaccountallgoogle.isDisplayed(), "Logo is Not Dispalyed");	
	 Reporter.log("verifytheLogoonceaccountallgoogle",true);
	}
	
	
	public void verifytheFigureCaption()
	{
	 Assert.assertTrue(FigureCaption.isDisplayed(), "Figure Caption is not displayed");
	 Assert.assertEquals(FigureCaption.getText(), "One account. All of Google working for you.");
	 Reporter.log("verifytheFigureCaption",true);
	 }
	
	public void verifyUsecurrentEmailaddress()
	{
	 Assert.assertTrue(UsecurrentEmailaddress.isDisplayed(), "Use current Email address is not displayed");
	 Reporter.log("verifyUsecurrentEmailaddress",true);
	}
	
	public void verifysignininsteadlink()
	{
	 Assert.assertTrue(signininstead.isDisplayed(), "sign in instead is not displayed") ;
	 Reporter.log("verifysignininsteadlink",true);
	}
	
	public void setFirstnameinGoogleCreateAccountPage()
	{
	 Assert.assertTrue(FirstName.isEnabled(), "First Name field is not Enabled");	
	 FirstName.sendKeys("Automation");	
	 Reporter.log("setFirstnameinGoogleCreateAccountPage",true);	
	}
	
	public void setLastnameinGoogleCreateAccountPage()
	{
     Assert.assertTrue(LastName.isEnabled(), "Last Namefield is not Enabled");	
     LastName.sendKeys("Manual");	
	 Reporter.log("setLastnameinGoogleCreateAccountPage",true);		
	}
	
	public void setPasswordinGoogleCreateAccountPage()
	{
     Assert.assertTrue(Password.isEnabled(), "Password Namefield is not Enabled");	
     Password.sendKeys("Automation@535353");	
	 Reporter.log("setPasswordinGoogleCreateAccountPage",true);		
	}
	
	public void setConfirmPasswordinGoogleCreateAccountPage()
	{
     Assert.assertTrue(ConfirmPassword.isEnabled(), "Confirm Password Namefield is not Enabled");	
     ConfirmPassword.sendKeys("Automation@535353");	
	 Reporter.log("setConfirmPasswordinGoogleCreateAccountPage",true);		
	}
	
	public void verifyHelpOptioninGoogleCreateAccountPage()
	{
	 Assert.assertTrue(Help_Opt.isDisplayed(), "Help Option in Google Create Account Page is not displayed");	
	 Reporter.log("verifyHelpOptioninGoogleCreateAccountPage",true);		
	}
	
	public void verifyPrivacyOptioninGoogleCreateAccountPage()
	{
	 Assert.assertTrue(Privacy_Option.isDisplayed(), "Privacy Option in Google Create Account Page is not displayed");	
	 Reporter.log("verifyPrivacyOptioninGoogleCreateAccountPage",true);		
	}
	
	public void verifyTermsOptioninGoogleCreateAccountPage()
	{
	 Assert.assertTrue(Terms_Opt.isDisplayed(), "Terms Option in Google Create Account Page is not displayed");	
	 Reporter.log("verifyTermsOptioninGoogleCreateAccountPage",true);		
	}
	
	public void clickonNextButtoninGoogleCreateAccountPage()
	{
	 Assert.assertTrue(NextButton.isDisplayed(), "Next Button is not diplayed");	
	 NextButton.click();
	 Reporter.log("clickonNextButtoninGoogleCreateAccountPage",true);	
	}
    
	

}
