package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditModelPage;
import testBase.BaseClass;

public class TC007_EditModel extends BaseClass {
	
	@Test
	public void verify_CarManagement_EditModel() throws InterruptedException
	{
		EditModelPage em =new EditModelPage(driver);
		
		em.ClickCarsManagemet();
		em.SelectModels();
		Thread.sleep(3000);
		em.ClickPageSize();
		em.SetPageSize();
		em.ClickEditButton();
		Thread.sleep(3000);
		em.EnterModelName();
		em.SaveEditModel();
		Thread.sleep(3000);
	}
}
