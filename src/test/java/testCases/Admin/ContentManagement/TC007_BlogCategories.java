package testCases.Admin.ContentManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.ContentManagement.BlogCategoriesPage;
import testBase.BaseClass;

public class TC007_BlogCategories extends BaseClass {
	
	@Test
	public void verify_ContentManagement_BlogtCategories() throws InterruptedException
	{
		BlogCategoriesPage bc = new BlogCategoriesPage(driver);
		
		//Add
		bc.ClickContentManagement();
		Thread.sleep(3000);
		bc.SelectCategories();
		Thread.sleep(3000);
		bc.AddBlogCategory();
		Thread.sleep(3000);
		bc.EnterBlogCategoryName();
		Thread.sleep(3000);
		bc.ClickonBlogcatActive();
		Thread.sleep(3000);
		bc.ClickonBlogSave();
		Thread.sleep(3000);
		
		//Edit
		bc.ClickEditButton();
		Thread.sleep(3000);
		bc.UpdateBlogCatName();
		Thread.sleep(3000);
		bc.ClickonActive();
		Thread.sleep(3000);
		bc.BlogCatSavebtn();
		Thread.sleep(3000);
		
		//Delete
		bc.Deletecat();
		Thread.sleep(3000);
		bc.ConformDeleteCat();
		Thread.sleep(3000);
		
	}

}
