package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseTest;

public class TC002_LoginPage extends BaseTest{

  @Test
  public void loginTest() {
	  logger.info("***** Starting Login Test *****");
	  HomePage ha=new HomePage(driver);
	  ha.clickProfile();
	  ha.clickLogin();
	  
	  logger.info("***** Entering to Login Page *****");
	  LoginPage lp=new LoginPage(driver);
	  logger.info("***** Entering user details in Login Page *****");
	  lp.username("null");
	  lp.password("null");
	  lp.clickLogin();
	  logger.info("***** Entering to Account Page *****");
	  MyAccountPage mp=new MyAccountPage(driver);
	  if(mp.isMyAccountPageExists()) {
		  System.out.println("Account created");
		  Assert.assertTrue(true);
	  }
	  else {
		  System.out.println("Account not created");
		  Assert.assertTrue(false);
		  logger.debug("Debug Logs");
	  }
  }
}
