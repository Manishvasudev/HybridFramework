package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	// WebDriver driver; --> declared already in Parent Class
	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);  // Extends the PageFactory attributes declared in BasePage Class
	}
	
	// Locators
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement btn_profile;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li[1]") //li[@class='dropdown']//a[contains(text(),'Register')]
	WebElement btn_register;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement btn_login;
	
	// Action Methods
	public void clickProfile() {
		btn_profile.click();
	}
	public void clickRegister() {
		btn_register.click();
	}
	public void clickLogin() {
		btn_login.click();
	}
}
