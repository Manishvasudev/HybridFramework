package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
	
	// Constructor
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	
	@FindBy(id="input-firstname")
	WebElement txt_firstName;
	
	@FindBy(id="input-lastname")
	WebElement txt_lastName;
	
	@FindBy(id="input-email")
	WebElement txt_email;
	
	@FindBy(id="input-telephone")
	WebElement txt_telephone;
	
	@FindBy(id="input-password")
	WebElement txt_password;
	
	@FindBy(id="input-confirm")
	WebElement txt_confirmPassword;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement chk_checkbox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn_continue;
	
	@FindBy(xpath="//*[@id='content']//h1")
	WebElement succMsg;
	
	// Action Methods
	
	public void setFirstName(String firstName) {
		txt_firstName.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		txt_lastName.sendKeys(lastName);
	}
	public void setEmail(String email) {
		txt_email.sendKeys(email);
	}
	public void setTelephone(String telephone) {
		txt_telephone.sendKeys(telephone);
	}
	public void setPassword(String password) {
		txt_password.sendKeys(password);
	}
	public void setConfirmPassword(String confirmPassword) {
		txt_confirmPassword.sendKeys(confirmPassword);
	}
	public void clickCheckBox() {
		chk_checkbox.click();
	}
	public void clickButton() {
		btn_continue.click();
	}
	public String successMessage() {
		String msg=succMsg.getText();
		return msg;
	}
}
