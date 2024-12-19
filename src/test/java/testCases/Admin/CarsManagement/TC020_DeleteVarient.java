package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditVariantsPage;
import testBase.BaseClass;

public class TC020_DeleteVarient extends BaseClass {
	
	@Test
	public void verify_CarManagement_DeleteModel() throws InterruptedException
	{
		EditVariantsPage dv =new EditVariantsPage(driver);
		
		dv.ClickCarsManagemet();
		Thread.sleep(3000);
		dv.SelectVarients();
		Thread.sleep(3000);
		dv.ClickPageSize();
		Thread.sleep(3000);
		dv.SetPageSize();
		Thread.sleep(3000);
		dv.DeleteVarient();
		Thread.sleep(3000);
		dv.ConformDeleteVarient();
		Thread.sleep(3000);
	}

}
