package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditVariantsPage;
import testBase.BaseClass;

public class TC008_EditVarient extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditModel() throws InterruptedException
	{
		EditVariantsPage ev =new EditVariantsPage(driver);
		
		ev.ClickCarsManagemet();
		ev.SelectVarients();
		Thread.sleep(3000);
		ev.ClickPageSize();
		ev.SetPageSize();
		ev.VarientEditButton();
		Thread.sleep(3000);
		ev.EnterVarientName();
		ev.SaveEditVarient();
		Thread.sleep(3000);
	}
}
