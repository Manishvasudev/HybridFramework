package testCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseTest;

public class TC001_RegistrationPage extends BaseTest{
	
	@Test
	public void registrationPage() throws InterruptedException, FileNotFoundException {
		
		logger.info("****** Starting TC001_RegistrationPage ******");
		try {
			HomePage hp=new HomePage(driver);
			RegistrationPage rp=new RegistrationPage(driver);
			
			// Open Home Page and click on the Profile >> Register buttons
			logger.info("Clicking on Profile and Register links.. ");
			hp.clickProfile();
			hp.clickRegister();
			
			// Registration page enter the details
			logger.info("Providing customer details.. ");
			rp.setFirstName(randomString());
			rp.setLastName(randomString());
			rp.setEmail(randomString()+"@gmail.com");
			rp.setTelephone(randomNumber());
			String password=randomStringNumber();
			rp.setPassword(password);
			rp.setConfirmPassword(password);
			rp.clickCheckBox();
			rp.clickButton();
			String succMsg=rp.successMessage();
			
			if(succMsg.equals("Your Account Has Been Created!")) {
				logger.info("Validating Success Message.. ");
				Assert.assertTrue(true);
			}
			else {
				logger.error("Error logs..");
				logger.debug("Debug logs..");
				Assert.assertTrue(false);
			}
			logger.info("Validating Success Message.. ");
			String actualMessage="Your Account Has Been Created!";
			Assert.assertEquals(succMsg, actualMessage);
		}
		catch(Exception e) {
			logger.error("Error logs..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		logger.info("****** Finished TC001_RegistrationPage ******");
	}
}
