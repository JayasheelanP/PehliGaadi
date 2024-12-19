package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.EditVariantsPage;
import pageObjects.Admin.CarsManagement.VariantsPage;
import testBase.BaseClass;

public class TC002_AddVarient extends BaseClass {
	
	@Test
	public void verify_CarManagement_AddVarient() throws InterruptedException
	{
		VariantsPage vp =new VariantsPage(driver);
		
		vp.ClickCarsManagement();
		vp.SelectVariants();
		Thread.sleep(3000);
		vp.AddVarient();
		Thread.sleep(3000);
		vp.EnterVarientName();
		vp.ModelNameVarDD();
		vp.SelecModelVarName();
		vp.CreateVarient();
		
		EditVariantsPage ev =new EditVariantsPage(driver);
		
		ev.ClickPageSize();
		ev.SetPageSize();
		ev.VarientEditButton();
		Thread.sleep(3000);
		ev.EnterVarientName();
		ev.SaveEditVarient();
		Thread.sleep(3000);
		
		ev.DeleteVarient();
		Thread.sleep(3000);
		ev.ConformDeleteVarient();
		Thread.sleep(3000);
		
	}
}
