package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditBodyTypes;
import testBase.BaseClass;

public class TC009_EditBodyType extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditModel() throws InterruptedException
	{
		EditBodyTypes bt =new EditBodyTypes(driver);
		
		bt.ClickCarsManagemet();
		bt.SelectBodyType();
		Thread.sleep(5000);
		bt.ClickPageSize();
		bt.SetPageSize();
		bt.BodyTypeEditButton();
		Thread.sleep(5000);
		bt.EnterBodyTypeName();
		bt.SaveEditBodyType();
		Thread.sleep(5000);
	}
}
