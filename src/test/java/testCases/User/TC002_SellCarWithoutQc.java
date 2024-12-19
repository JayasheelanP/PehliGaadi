package testCases.User;

import org.testng.annotations.Test;
import pageObjects.User.SellCarWithoutQc;
import testBase.BaseClass;

public class TC002_SellCarWithoutQc extends BaseClass {
	
	@Test
	public void verify_SellCars_WithoutQc() throws InterruptedException
	{
		SellCarWithoutQc lp =new SellCarWithoutQc(driver);
		
//      // Perform login actions

//		Thread.sleep(3000);
		lp.clkLogin();
		Thread.sleep(3000);
		lp.setMobileNumber(username);
		logger.info("Entered Username: " + username);
//		Thread.sleep(3000);
      lp.ClickLogin();
		
//		Thread.sleep(5000);
      lp.setOTP(password);
      logger.info("Entered OTP: " +password);
		lp.clickVerify();
		Thread.sleep(5000);
		lp.clickSellCar();
		lp.clickSellMyCar();
		lp.EnterCarNumber("KA23ER4540");
	    lp.clickSellCarButton();
		lp.clickWithQC();
//		lp.clickBrand();
//		lp.clickPeriod();
//		lp.clickModel();
//		lp.clickVariant();
//		lp.clickFuel();
//		lp.clickTransmission();
		lp.clickOwnership();
		lp.clickOwnership();
		lp.clickLocation();
		lp.ClkCheckBox();
		lp.ClkContinueButton();
		lp.clickUpload();
		
	}

}
