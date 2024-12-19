package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.DeleteTransmission;
import pageObjects.Admin.CarsManagement.EditTransmissionPage;
import pageObjects.Admin.CarsManagement.TransmissionsPage;
import testBase.BaseClass;

public class TC013_AddTransmission extends BaseClass {
	
	@Test
	public void verify_CarManagement_AddTransmision() throws InterruptedException
	{
		TransmissionsPage tp =new TransmissionsPage(driver);
		
		tp.ClickCarsManagement();
		tp.SelectTransmission();
		Thread.sleep(3000);
		tp.AddTransmission();
		Thread.sleep(3000);
		tp.EnterTransmissionName();
		Thread.sleep(3000);
		tp.EnterTransmissionUrl();
		Thread.sleep(3000);
		tp.Click_on_Create();
		Thread.sleep(5000);
		
		EditTransmissionPage et =new EditTransmissionPage(driver);
		
		et.EditTransmission();
		Thread.sleep(3000);
		et.EnterTransmissionName();
		Thread.sleep(3000);
		et.EnterTransmissionUrl();
		Thread.sleep(3000);
		et.Click_on_Save();
		Thread.sleep(3000);
		
		DeleteTransmission dt =new DeleteTransmission(driver);
		
		dt.DeleteTransmissions();
		Thread.sleep(3000);
		dt.ConformDeleteTransmission();
		Thread.sleep(3000);
	}
}
