package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditColorPage;
import testBase.BaseClass;

public class TC011_EditColor extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditColor() throws InterruptedException
	{
		EditColorPage cp =new EditColorPage(driver);
		
		cp.ClickCarsManagemet();
		cp.SelectColorType();
		Thread.sleep(3000);
		cp.ClickPageSize();
		cp.SetPageSize();
		Thread.sleep(3000);
		cp.ColorEditButton();
		Thread.sleep(3000);
		cp.EnterColorName();
		cp.EnterColorCodeName();
		cp.SaveEditcolor();
		Thread.sleep(3000);
	}

}
