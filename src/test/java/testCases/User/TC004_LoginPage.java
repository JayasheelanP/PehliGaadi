package testCases.User;

import org.testng.annotations.Test;

import pageObjects.User.LoginPage;
import testBase.BaseClass;

public class TC004_LoginPage extends BaseClass {
	
	@Test
	public void verify_LoginUser() throws InterruptedException
	{
		LoginPage lp =new LoginPage(driver);
		
//      // Perform login actions

		Thread.sleep(3000);
		lp.clkLogin();
		Thread.sleep(3000);
		lp.setMobileNumber(username);
		logger.info("Entered Username: " + username);
		Thread.sleep(3000);

		lp.ClickLogin();
		
		Thread.sleep(5000);
      lp.setOTP(password);
      logger.info("Entered OTP: " +password);
		lp.clickVerify();
		Thread.sleep(10000);
      lp.clickBuyCar();
		Thread.sleep(3000);
		lp.clickBuyUsedCar();
		Thread.sleep(3000);
		
//		lp.clickSubmit();
//		logger.info("Clicked on submit button");
		
		Thread.sleep(5000);
		
	}
		
	}
