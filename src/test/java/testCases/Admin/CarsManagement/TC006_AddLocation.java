package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditLocationPage;
import pageObjects.Admin.CarsManagement.LocationsPage;
import testBase.BaseClass;

public class TC006_AddLocation extends BaseClass {
	
	@Test
	public void verify_CarManagement_AddLocation() throws InterruptedException
	{
		LocationsPage loc =new LocationsPage(driver);
		
		loc.ClickCarsManagement();
		loc.SelectLocation();
		Thread.sleep(5000);
		loc.AddLocation();
		Thread.sleep(5000);
		loc.EnterCityName();
		Thread.sleep(5000);
		loc.CatrgoryName();
		Thread.sleep(5000);
		loc.EnterPincode();
		loc.SaveLocation();
		
		EditLocationPage Eloc =new EditLocationPage(driver);
		
		Eloc.ClickPageSize();
		Eloc.SetPageSize();
		Thread.sleep(5000);
		Eloc.LocationEditButton();
		Thread.sleep(5000);
		Eloc.EnterCityName();
		Thread.sleep(5000);
		Eloc.EnterCityCatName();
		Thread.sleep(5000);
		Eloc.EnterPincode();
		Thread.sleep(5000);
		Eloc.EnterLogoURL();
		Thread.sleep(5000);
		Eloc.SaveEditLocation();
		Thread.sleep(5000);
		
		Eloc.DeleteLocation();
		Thread.sleep(3000);
		Eloc.ConformDeleteLocation();
		Thread.sleep(3000);
		
	}
}
