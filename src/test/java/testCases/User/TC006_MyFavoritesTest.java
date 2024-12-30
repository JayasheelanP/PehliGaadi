package testCases.User;

import org.testng.annotations.Test;

import pageObjects.User.MyFavoritesPage;
import testBase.BaseClass;

public class TC006_MyFavoritesTest extends BaseClass {
	
	@Test
	public void verify_MyFavorites() throws InterruptedException
	{
		MyFavoritesPage fp = new MyFavoritesPage(driver);
		
		
		Thread.sleep(3000);
		fp.clkLogin();
		Thread.sleep(3000);
		fp.setMobileNumber(username);
		logger.info("Entered Username: " + username);
		Thread.sleep(3000);

		fp.ClickLogin();
		
		Thread.sleep(5000);
		fp.setOTP(password);
	    logger.info("Entered OTP: " +password);
	    fp.clickVerify();
		Thread.sleep(5000);
		fp.clickBuyCar();
		Thread.sleep(3000);
		fp.clickBuyUsedCar();
		Thread.sleep(3000);
		fp.ClickonFav();
		Thread.sleep(3000);
		fp.ClickonHome();
		Thread.sleep(3000);
		fp.ClickonHomeFavbtn();
		Thread.sleep(3000);
		fp.verfiyCarInFavorites();
		Thread.sleep(3000);
	}

}
