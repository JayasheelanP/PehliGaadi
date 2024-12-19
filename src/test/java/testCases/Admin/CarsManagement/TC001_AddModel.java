package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditModelPage;
import pageObjects.Admin.CarsManagement.ModelsPage;
import testBase.BaseClass;

public class TC001_AddModel extends BaseClass {
	
	@Test
	public void verify_CarManagement_AddModel() throws InterruptedException
	{
		ModelsPage mp =new ModelsPage(driver);
		
		mp.ClickCarsManageme();
		mp.SelectModels();
		Thread.sleep(3000);
		mp.AddModel();
		Thread.sleep(3000);
		mp.EnterModelName();
		mp.BrandNameDD();
		Thread.sleep(3000);
		mp.SelectBrandName();
		mp.CreateModel();
		Thread.sleep(3000);
		
		EditModelPage em =new EditModelPage(driver);
		
		em.ClickPageSize();
		em.SetPageSize();
		em.ClickEditButton();
		Thread.sleep(3000);
		em.EnterModelName();
		em.SaveEditModel();
		Thread.sleep(3000);

		em.DeleteModel();
		Thread.sleep(3000);
		em.ConformDeleteModel();
		Thread.sleep(3000);
	}
}
