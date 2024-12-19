package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditLocationPage;
import testBase.BaseClass;

public class TC024_DeleteLocation extends BaseClass {
	
	@Test
	public void verify_CarManagement_DeleteLocation() throws InterruptedException
	{
		EditLocationPage dl =new EditLocationPage(driver);
		
		dl.ClickCarsManagemet();
		Thread.sleep(3000);
		dl.SelectLocation();
		Thread.sleep(3000);
		dl.ClickPageSize();
		Thread.sleep(3000);
		dl.SetPageSize();
		Thread.sleep(3000);
		dl.DeleteLocation();
		Thread.sleep(3000);
		dl.ConformDeleteLocation();
		Thread.sleep(3000);
	}

}
