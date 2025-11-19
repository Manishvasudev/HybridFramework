package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    // Constructor
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	//  Locators
	@FindBy(xpath="//h2[text()='MyAccount']")
	WebElement text_myAccount;
	
	//Action Methods
	
	public boolean isMyAccountPageExists() {
		try {
			return text_myAccount.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	
	
}
