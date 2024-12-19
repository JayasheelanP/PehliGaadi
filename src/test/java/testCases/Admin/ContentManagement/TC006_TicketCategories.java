package testCases.Admin.ContentManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.ContentManagement.TicketCategoriesPage;
import testBase.BaseClass;

public class TC006_TicketCategories extends BaseClass {
	
	@Test
	public void verify_ContentManagement_TicketCategories() throws InterruptedException
	{
		TicketCategoriesPage tc = new TicketCategoriesPage(driver);
		
		//Add
		tc.ClickContentManagement();
		Thread.sleep(3000);
		tc.SelectCategories();
		Thread.sleep(3000);
		tc.AddCategory();
		Thread.sleep(3000);
		tc.EnterCategoryName();
		Thread.sleep(3000);
		tc.ClickoncatInActive();
		Thread.sleep(3000);
		tc.EnterCategoryDesc();
		Thread.sleep(3000);
		tc.CreateCat();
		Thread.sleep(3000);
		
		//Edit
		tc.ClickEditButton();
		Thread.sleep(3000);
		tc.UpdateCatName();
		Thread.sleep(3000);
		tc.ClickonActive();
		Thread.sleep(3000);
		tc.UpdatecatDes();
		Thread.sleep(3000);
		tc.CatSavebtn();
		Thread.sleep(3000);
		
		//Delete
		tc.Deletecat();
		Thread.sleep(3000);
		tc.ConformDeleteCat();
		Thread.sleep(3000);
	
	}

}
