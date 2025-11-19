package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	// Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	@FindBy(id="input-email")
	WebElement input_username;
	
	@FindBy(id="input-password")
	WebElement input_password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement btn_login;
	
	// Action Methods
	public void username(String username) {
		input_username.sendKeys(username);
	}
	
	public void password(String password) {
		input_password.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	public void demo() {
		
	}
}
