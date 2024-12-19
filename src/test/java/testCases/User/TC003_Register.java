package testCases.User;

import org.testng.annotations.Test;
import pageObjects.User.Register;
import testBase.BaseClass;

public class TC003_Register extends BaseClass {
	
	@Test
	public void verify_RegisterUser() throws InterruptedException
	{
		Register lp =new Register(driver);
		
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
     lp.EnterUsername("Sumitra");
     lp.Email("sumitra@gmail.com");
     lp.ClickRegister();
     Thread.sleep(3000);
		
//		lp.clickSubmit();
//		logger.info("Clicked on submit button");
		
		Thread.sleep(5000);
		
	}	
}
	
