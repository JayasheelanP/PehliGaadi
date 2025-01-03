package testCases.User;

import org.testng.annotations.Test;
import pageObjects.User.SellCarWithQc;
import testBase.BaseClass;

public class TC001_SellCarWithQc extends BaseClass {
	
	@Test
	public void verify_SellCars_WithQc() throws InterruptedException
	{
		SellCarWithQc lp =new SellCarWithQc(driver);
		
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
			       //logger.info("Entered OTP: " +password);
					lp.clickVerify();
					Thread.sleep(5000);
					lp.clickSellCar();
					Thread.sleep(5000);
					lp.clickSellMyCar();
					Thread.sleep(5000);
					lp.EnterCarNumber();
					Thread.sleep(5000);
					lp.clickSellCarButton();
					Thread.sleep(5000);
					lp.clickWithQC();
					Thread.sleep(5000);
					lp.clickBrand();
					Thread.sleep(5000);
					lp.clickPeriod();
					Thread.sleep(5000);
					lp.clickModel();
					Thread.sleep(5000);
					lp.clickVariant();
					Thread.sleep(3000);
					lp.clickFuel();
					Thread.sleep(3000);
		        	lp.clickTransmission();
		        	Thread.sleep(3000);
					lp.clickOwnership();
					Thread.sleep(3000);
					lp.clickOdometer();
					Thread.sleep(5000);
					lp.clickLocation();
		     		Thread.sleep(5000);
		     		lp.ClkCheckBox();
		     		Thread.sleep(5000);
		     		lp.ClkContinueButton();
		     		Thread.sleep(5000);
		     		lp.ClkDate();
		     		Thread.sleep(5000);
		     		lp.ClkTime();
		     		Thread.sleep(5000);
		     		lp.ClkBook();
		     		Thread.sleep(5000);
		     		lp.ClkMapLocation();
		     		Thread.sleep(5000);
		     		lp.ClkBook();
		     		Thread.sleep(5000);	
		}
				
	}

