package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditOwnershipPage;
import testBase.BaseClass;

public class TC023_DeleteOwnership extends BaseClass {
	
	@Test
	public void verify_CarManagement_DeleteModel() throws InterruptedException
	{
		EditOwnershipPage od =new EditOwnershipPage(driver);
		
		od.ClickCarsManagemet();
		Thread.sleep(3000);
		od.SelectOwnership();
		Thread.sleep(3000);
		od.DeleteOwnership();
		Thread.sleep(3000);
		od.ConformDeleteOwnership();
		Thread.sleep(3000);
	}

}
