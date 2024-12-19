package testCases.User;

import org.testng.annotations.Test;
import pageObjects.User.WishList;
import testBase.BaseClass;

public class TC005_WishList extends BaseClass {
	
	@Test
	public void verify_LoginUser() throws InterruptedException
	{
		WishList lp =new WishList(driver);
		
		// Perform login actions

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
		Thread.sleep(5000);
	    lp.clickBuyCar();
		Thread.sleep(3000);
		lp.clickBuyUsedCar();
		Thread.sleep(3000);
		lp.scrollToButtonsAndClick();
		Thread.sleep(3000);
		lp.clickChooseBrand();
		lp.selectBrandByIndex(3);
		Thread.sleep(3000);
		lp.NotifyButton();
		lp.clkSubmit();
		Thread.sleep(3000);
//		logger.info("Clicked on submit button");
		
		}
		
		
	}
