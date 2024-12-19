package testCases.Admin.ContentManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.ContentManagement.FAQPage;
import testBase.BaseClass;

public class TC003_FAQs extends BaseClass {
	
	@Test
	public void verify_ContentManagement_FAQs() throws InterruptedException
	{
		FAQPage fq = new FAQPage(driver);
		
		fq.ClickContentManagement();
		Thread.sleep(3000);
		fq.SelectFAQs();
		Thread.sleep(3000);
		fq.AddFaqs();
		Thread.sleep(3000);
		fq.ClickCategory();
		Thread.sleep(3000);
		fq.SelectCategory();
		Thread.sleep(3000);
		fq.EnterQuestion();
		Thread.sleep(3000);
		fq.EnterAnswer();
		Thread.sleep(3000);
		fq.Savebtn();
		Thread.sleep(3000);
		
		//Edit
		fq.ClickEditButton();
		Thread.sleep(3000);
		fq.ClickCategory();
		Thread.sleep(3000);
		fq.UpdateCategory();
		Thread.sleep(3000);
		fq.ClickonActiveFaq();
		Thread.sleep(3000);
		fq.UpdateQuestion();
		Thread.sleep(3000);
		fq.UpdateAnswer();
		Thread.sleep(3000);
		fq.EditSaveBTN();
		Thread.sleep(3000);
		
		//Delete
		fq.DeleteFaq();
		Thread.sleep(3000);
		fq.ConformDeleteFaq();
		Thread.sleep(3000);
	}

}
