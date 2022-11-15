package PomForZerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ZerodhaLoginpage {
	
	
	// Declaration 
	
	@FindBy(xpath = "//img[@alt = 'Kite']") private WebElement Zerodha_logo_loginpage;
	@FindBy(xpath = "//h2[text()= 'Login to Kite']") private WebElement Zerodha_Login_message;
    @FindBy(id = "userid") private WebElement UserId_Field;
    @FindBy(id = "password") private WebElement Password_Field;
    @FindBy(xpath = "//button[@type= 'submit']") private WebElement login_button;
    @FindBy(xpath = "//a[text()= 'Forgot user ID or password?']") private WebElement forgot_useridandpasswordlink;
    @FindBy(xpath = "//a[@class = 'text-light'] ") private WebElement Zerodha_Dont_have_accountlink;
    @FindBy(xpath = "//img[@alt= 'Kite Android'] ") private WebElement logo_for_playstore;
    @FindBy(xpath = "//img[@alt= 'Kite iOS'] ") private WebElement logo_for_applestore;
	@FindBy (xpath = "//input[@type= 'password']") private WebElement Zerodha_pin_field;
	@FindBy (xpath = "//button[@type= 'submit']") private WebElement Zerodha_continue_button;
//=================================================================================================
    
     // Initialisation
    
    public ZerodhaLoginpage (WebDriver driver) 
    {
    PageFactory.initElements(driver, this);	
    }
//==============================================================================================================    
   
    // Usage 
    
    public void VerifyzerodhaLogoinLoginpage()
    {
    	Assert.assertTrue(Zerodha_logo_loginpage.isDisplayed(), "Zerodha Logo in Login page is not Displayed");
    	Reporter.log("Verify the zerodha Logo in Login page");
    }
    
    public void VerifyLogintoKitemeassageinloginpage()
    {
    	Assert.assertTrue(Zerodha_Login_message.isDisplayed(), "Zerodha Login to kite message in Login page is not Displayed ");
    	Assert.assertEquals(Zerodha_Login_message.getText(), "Login to Kite");
    	Reporter.log("Verify the Login to kite message in Login page");
    	System.out.println(Zerodha_Login_message.getText());
    }
    
    public void verifyForgotuserIDorpasswordlinkinloginpage() 
    {
    	Assert.assertTrue(forgot_useridandpasswordlink.isDisplayed(), "Forgot Userid and password link is not Displayed");
    	Assert.assertEquals(forgot_useridandpasswordlink.getText(), "Forgot user ID or password?");
    	Reporter.log("verify Forgot userID or password link in login page");
    	System.out.println(forgot_useridandpasswordlink.getText());
    }
    
    public void verifyDonthaveanaccountlinkinloginpage() 
    {
    	Assert.assertTrue(Zerodha_Dont_have_accountlink.isDisplayed(), "Zerodha Dont have accountlink is not displayed");
    	Assert.assertEquals(Zerodha_Dont_have_accountlink.getText(),"Don't have an account? Signup now!");
    	Reporter.log("verify Dont have an account link in login page");
    }
    
    public void verifylogoofplaystoreforkitemobileapp()
    {
    	Assert.assertTrue(logo_for_applestore.isDisplayed(),"Logo of apple store for download kite mobile app is not displayed");
    	Reporter.log("verify Logo of apple store for download kite mobile app");
    }
    

    public void verifylogoofapplestoreforkitemobileapp()
    {
    	Assert.assertTrue(logo_for_playstore.isDisplayed(),"Logo of play store for download kite mobile app is not displayed");
    	Reporter.log("verify Logo of play store for download kite mobile app");
    }
    
    public void Setuseridfield() //(String Userid )
    {
    	Assert.assertTrue(UserId_Field.isEnabled(), "The userid field is not Enabled");
    	UserId_Field.sendKeys("DV1510");
    	Reporter.log("Succesfully send userid in userid field in zerodha Login page");
    }
    
    public void SetPasswordfield()//(String Password)
    {
    	Assert.assertTrue(Password_Field.isEnabled(), "The password field is not Enabled");
    	Password_Field.sendKeys("Goal@123");
    	Reporter.log("Succesfully send password in password field in zerodha Login page");
    }
    
    public void Clickonloginbuttoninzerodhaloginpage()
    {
    	Assert.assertTrue(login_button.isDisplayed(),  "Zerodha Login button in Login page is not Displayed ");
    	login_button.click();
    	Reporter.log("Click on login button in zerodha login page Succesfully");
    } 
    
    public void setpin ()//(String pin)
    {
		 Assert.assertTrue(Zerodha_pin_field.isEnabled(), "The Pin field is not Enabled");
		 Zerodha_pin_field.sendKeys("959594");
		 Reporter.log("Enter the pin Succesfully");
	 }
	 
    public void clickoncontinuebutton()
    {
	 Assert.assertTrue(Zerodha_continue_button.isDisplayed(), "Continue Button is not Displayed");
	 Zerodha_continue_button.click();
	 Reporter.log("User is Succesfully entered pin");
    }
    
 
    
    

    

}
