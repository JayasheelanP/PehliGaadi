package testCases.Admin.ContentManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.ContentManagement.InspectionQuestionsPage;
import testBase.BaseClass;

public class TC002_InspectionQuestions extends BaseClass {
	
	@Test
	public void verify_ContentManagement_InspectionQuestions() throws InterruptedException
	{
		InspectionQuestionsPage iq = new InspectionQuestionsPage(driver);
		
		iq.ClickContentManagement();
		Thread.sleep(3000);
		iq.SelectInspectionQuestion();
		Thread.sleep(3000);
		iq.AddQuestion();
		Thread.sleep(3000);
		iq.ClickCategory();
		Thread.sleep(3000);
		iq.SelectCategory();
		Thread.sleep(3000);
		iq.EnterQuestion();
		Thread.sleep(3000);
		iq.EnterAnswer1();
		Thread.sleep(3000);
		iq.ClickOnCreate();
		Thread.sleep(3000);
		
		//Multi Answer
	    iq.AddQuestion();
		Thread.sleep(3000);
		iq.ClickCategory();
		Thread.sleep(3000);
		iq.SelectCategoryEng();
		Thread.sleep(3000);
		iq.EnterQuestionMul();
		Thread.sleep(3000);
		iq.ClickOnMultiAns();
		Thread.sleep(3000);
		iq.EnterAnswer1();
		Thread.sleep(3000);
		iq.ClickonAddAns();
		Thread.sleep(3000);
		iq.EnterAnswer2();
		Thread.sleep(3000);
		iq.ClickOnCreate();
		Thread.sleep(3000);
		
		//Edit IQ
		iq.ClickPageSize();
		Thread.sleep(3000);
		iq.SetPageSize();
		Thread.sleep(3000);
		iq.ClickEditButton();
		Thread.sleep(3000);
		iq.ClickCategory();
		Thread.sleep(3000);
		iq.UpdateCategory();
		Thread.sleep(3000);
		iq.UpdateQuestion();
		Thread.sleep(5000);
		iq.UpdateAnswer1();
		Thread.sleep(3000);
		iq.EditSaveBTN();
		Thread.sleep(3000);
		
		//Delete IQ
		iq.DeleteIQ();
		iq.ConformDeleteIQ();
	
	}

}
