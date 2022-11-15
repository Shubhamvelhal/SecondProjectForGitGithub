package PomForZerodha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ZerodhaHomePage {
	
	// Declaration
	
	@FindBy(xpath = "//img[@alt= 'Kite logo']") private WebElement Logo_homePage;
	@FindBy(xpath = "//a[@aria-current= 'page']") private WebElement Dashboard;
	@FindBy(xpath = "//a[@class= 'orders-nav-item']") private WebElement Orders;
	@FindBy(xpath = "//a[@href = '/holdings']") private WebElement Holdings;
	@FindBy(xpath = "//a[@href = '/positions']") private WebElement Positions;
	@FindBy(xpath = "//a[@href = '/funds']") private WebElement Funds;
	@FindBy(xpath = "//a[@href = '/apps']") private WebElement Apps;
	@FindBy(xpath = "//span[@class= 'user-id']") private WebElement UserIdfor_Profile;
	@FindBy(xpath = "//span[@class= 'nickname']") private WebElement Nickname;
	@FindBy(xpath = "//span[@class= 'last-price down'][1]") private WebElement Spot1_price;
	@FindBy(xpath = "value") private WebElement Spot2_price;
	@FindBy(xpath = "//input[@icon= 'search']") private WebElement Share_search_tab;
	@FindBy(xpath = "//a[@class= 'button button-blue']") private WebElement Comodity_Activatebtn;
	@FindBy(xpath = "//div[@class= 'block'][1]") private WebElement Margin_Used;
	@FindBy(xpath = "//div[@class= 'block'][2]") private WebElement Opening_balance;
	@FindBy(xpath = "//div[@class= 'label'][1]") private WebElement Margin_Available;
	@FindBy(xpath = "//span[@class= 'settings-button icon icon-settings']") private WebElement Marcketwatch_setting;
	@FindBy(xpath = "//button[@class= 'button-blue'][1]") private WebElement StartInvesting_btn;
	
	// 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
