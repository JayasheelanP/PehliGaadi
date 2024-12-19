package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditOwnershipPage;
import pageObjects.Admin.CarsManagement.OwnershipPage;
import testBase.BaseClass;

public class TC005_AddOwnership extends BaseClass {
	
	@Test
	public void verify_CarManagement_AddOwnership() throws InterruptedException
	{
		OwnershipPage op =new OwnershipPage(driver);
		
		op.ClickCarsManagement();
		op.SelectOwnership();
		op.AddOwnership();
		op.EnterOwnershipType();
		op.CreateOwnership();
		
		EditOwnershipPage ow = new EditOwnershipPage(driver);
		
		ow.ClickPageSize();
		ow.SetPageSize();
		ow.OwnershipEditButton();
		Thread.sleep(3000);
		ow.EnterOwnershipName();
		ow.SaveEditBodyType();
		Thread.sleep(3000);
		
		ow.DeleteOwnership();
		Thread.sleep(3000);
		ow.ConformDeleteOwnership();
		Thread.sleep(3000);
		
	}
}
