package testCases.Admin.ContentManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.ContentManagement.ServicesPage;
import testBase.BaseClass;

public class TC005_Services extends BaseClass {
	
	@Test
	public void verify_ContentManagement_Services() throws InterruptedException
	{
		ServicesPage sp = new ServicesPage(driver);
		
		//Add Services
		sp.ClickContentManagement();
		Thread.sleep(3000);
		sp.SelectServices();
		Thread.sleep(3000);
		sp.AddServices();
		Thread.sleep(3000);
		sp.ClickCategory();
		Thread.sleep(3000);
		sp.SelectCategory();
		Thread.sleep(3000);
		sp.ClickInActive();
		Thread.sleep(3000);
		sp.EnterName();
		Thread.sleep(3000);
		sp.EnterDescription();
		Thread.sleep(3000);
		sp.EnterServivePrice();
		Thread.sleep(3000);
		sp.EnterServiveOfferPrice();
		Thread.sleep(3000);
		sp.ClickonServiceSavebtn();
		Thread.sleep(3000);
		
		//Update
		sp.ClickPageSize();
		Thread.sleep(3000);
		sp.SetPageSize();
		Thread.sleep(3000);
		sp.scrollLeft(driver);
		Thread.sleep(3000);
		sp.ClickEditButton();
		Thread.sleep(3000);
		sp.UpdateServiceCategory();
		Thread.sleep(3000);
		sp.ClickonActiveService();
		Thread.sleep(3000);
		sp.UpdateServiceName();
		Thread.sleep(3000);
		sp.UpdateServiceDesc();
		Thread.sleep(3000);
		sp.UpdateServicePrice();
		Thread.sleep(3000);
		sp.UpdateServiceOfferPrice();
		Thread.sleep(3000);
		sp.UpdateSaveBtn();
		Thread.sleep(3000);
		
		//Delete
		sp.DeleteService();
		Thread.sleep(3000);
		sp.ConformDeleteService();
		Thread.sleep(3000);
		
	}

}
