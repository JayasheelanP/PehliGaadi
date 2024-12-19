package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditBodyTypes;
import testBase.BaseClass;

public class TC021_DeleteBodyType extends BaseClass {
	
	@Test
	public void verify_CarManagement_DeleteModel() throws InterruptedException
	{
		EditBodyTypes db =new EditBodyTypes(driver);
		
		db.ClickCarsManagemet();
		Thread.sleep(3000);
		db.SelectBodyType();
		Thread.sleep(3000);
		db.ClickPageSize();
		Thread.sleep(3000);
		db.SetPageSize();
		Thread.sleep(3000);
		db.DeleteBody();
		Thread.sleep(3000);
		db.ConformDeleteBody();
		Thread.sleep(3000);
	}

}
