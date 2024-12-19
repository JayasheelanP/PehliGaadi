package testCases.Admin.CarsManagement;
import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditTransmissionPage;
import testBase.BaseClass;

public class TC014_EditTransmission extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditTransmision() throws InterruptedException
	{
		EditTransmissionPage et =new EditTransmissionPage(driver);
		
		et.ClickCarsManagement();
		et.SelectTransmission();
		Thread.sleep(5000);
		et.EditTransmission();
		Thread.sleep(5000);
		et.EnterTransmissionName();
		Thread.sleep(5000);
		et.EnterTransmissionUrl();
		Thread.sleep(5000);
		et.Click_on_Save();
		Thread.sleep(5000);
	}
}
