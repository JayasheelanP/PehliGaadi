package testCases.Admin.CarsManagement;
import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.FuelPage;
import testBase.BaseClass;

public class TC017_EditFuel extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditTransmision() throws InterruptedException
	{
		FuelPage fp =new FuelPage(driver);
		
		fp.ClickCarsManagement();
		fp.SelectFuel();
		Thread.sleep(5000);
		fp.EditFuel();
		Thread.sleep(5000);
		fp.EditFuelName();
		Thread.sleep(5000);
		fp.EditFuelUrl();
		Thread.sleep(5000);
		fp.Click_on_EditSave();
		Thread.sleep(5000);
	}
}
