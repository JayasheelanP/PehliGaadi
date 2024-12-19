package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditOwnershipPage;
import testBase.BaseClass;

public class TC010_EditOwnership extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditModel() throws InterruptedException
	{
		EditOwnershipPage ow = new EditOwnershipPage(driver);
		
		ow.ClickCarsManagemet();
		ow.SelectOwnership();
		Thread.sleep(3000);
		ow.ClickPageSize();
		ow.SetPageSize();
		ow.OwnershipEditButton();
		Thread.sleep(3000);
		ow.EnterOwnershipName();
		ow.SaveEditBodyType();
		Thread.sleep(3000);
	}
}
