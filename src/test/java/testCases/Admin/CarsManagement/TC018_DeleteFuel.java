package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.FuelPage;
import testBase.BaseClass;

public class TC018_DeleteFuel extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditTransmision() throws InterruptedException
	{
		FuelPage fp =new FuelPage(driver);
		
		fp.ClickCarsManagement();
		Thread.sleep(3000);
		fp.SelectFuel();
		Thread.sleep(3000);
		fp.DeleteFuel();
		Thread.sleep(3000);
		fp.ConformDeleteFuel();
		Thread.sleep(3000);
	}

}
