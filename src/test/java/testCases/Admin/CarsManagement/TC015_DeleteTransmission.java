package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.DeleteTransmission;
import testBase.BaseClass;

public class TC015_DeleteTransmission extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditTransmision() throws InterruptedException
	{
		DeleteTransmission dt =new DeleteTransmission(driver);
		
		dt.ClickCarsManagement();
		Thread.sleep(3000);
		dt.SelectTransmission();
		Thread.sleep(3000);
		dt.DeleteTransmissions();
		Thread.sleep(3000);
		dt.ConformDeleteTransmission();
		Thread.sleep(3000);
	}

}
