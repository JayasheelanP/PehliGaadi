package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditColorPage;
import testBase.BaseClass;

public class TC022_DeleteColor extends BaseClass {
	
	@Test
	public void verify_CarManagement_DeleteModel() throws InterruptedException
	{
		EditColorPage dc =new EditColorPage(driver);
		
		dc.ClickCarsManagemet();
		Thread.sleep(3000);
		dc.SelectColorType();
		Thread.sleep(3000);
		dc.ClickPageSize();
		Thread.sleep(3000);
		dc.SetPageSize();
		Thread.sleep(3000);
		dc.DeleteColor();
		Thread.sleep(3000);
		dc.ConformDeleteColor();
		Thread.sleep(3000);
	}

}
