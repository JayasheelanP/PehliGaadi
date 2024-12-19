package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditLocationPage;
import testBase.BaseClass;

public class TC012_EditLocation extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditLocation() throws InterruptedException
	{
		EditLocationPage loc =new EditLocationPage(driver);
		
		loc.ClickCarsManagemet();
		loc.SelectLocation();
		Thread.sleep(5000);
		loc.ClickPageSize();
		loc.SetPageSize();
		Thread.sleep(5000);
		loc.LocationEditButton();
		Thread.sleep(5000);
		loc.EnterCityName();
		Thread.sleep(5000);
		loc.EnterCityCatName();
		Thread.sleep(5000);
		loc.EnterPincode();
		Thread.sleep(5000);
		loc.EnterLogoURL();
		Thread.sleep(5000);
		loc.SaveEditLocation();
		Thread.sleep(5000);
	}

}
