package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditModelPage;
import testBase.BaseClass;

public class TC019_DeleteModel extends BaseClass {
	
	@Test
	public void verify_CarManagement_DeleteModel() throws InterruptedException
	{
		EditModelPage dm =new EditModelPage(driver);
		
		dm.ClickCarsManagemet();
		Thread.sleep(3000);
		dm.SelectModels();
		Thread.sleep(3000);
		dm.ClickPageSize();
		Thread.sleep(3000);
		dm.SetPageSize();
		Thread.sleep(3000);
		dm.DeleteModel();
		Thread.sleep(3000);
		dm.ConformDeleteModel();
		Thread.sleep(3000);
	}

}
