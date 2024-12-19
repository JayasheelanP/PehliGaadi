package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.FuelPage;
import testBase.BaseClass;

public class TC016_AddFuel extends BaseClass {
	
	@Test
	public void verify_CarManagement_AddTransmision() throws InterruptedException
	{
		FuelPage fp =new FuelPage(driver);
		
		fp.ClickCarsManagement();
		Thread.sleep(3000);
		fp.SelectFuel();
		Thread.sleep(3000);
		fp.AddFuel();
		Thread.sleep(3000);
		fp.EnterFuelName();
		Thread.sleep(3000);
		fp.FuelUrl();
		Thread.sleep(3000);
		fp.Click_on_Save();
		Thread.sleep(3000);
		
		fp.EditFuel();
		Thread.sleep(3000);
		fp.EditFuelName();
		Thread.sleep(3000);
		fp.EditFuelUrl();
		Thread.sleep(3000);
		fp.Click_on_EditSave();
		Thread.sleep(3000);
		
		fp.DeleteFuel();
		Thread.sleep(3000);
		fp.ConformDeleteFuel();
		Thread.sleep(3000);
	}
}