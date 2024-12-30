package testCases.Admin.More;

import org.testng.annotations.Test;

import pageObjects.Admin.More.SurveyQuestionPage;
import testBase.BaseClass;

public class TC002_SurveyQuestion extends BaseClass {
	
	@Test
	public void verify_More_SurveyQuestions() throws InterruptedException
	{
		SurveyQuestionPage sq = new SurveyQuestionPage(driver);
		
	    //Add
		sq.ClickonMore();
		Thread.sleep(3000);
		sq.SelectCategories();
		Thread.sleep(3000);
		sq.AddSurveyQuestion();
		Thread.sleep(3000);
		sq.EntersurveyCategory();
		Thread.sleep(3000);
		sq.EntersurveyQuestion();
		Thread.sleep(3000);
		sq.EntersurveyAnswer1();
		Thread.sleep(3000);
		sq.AddAnswer();
		Thread.sleep(3000);
		sq.EntersurveyAnswer2();
		Thread.sleep(3000);
		sq.SurveySave();
		Thread.sleep(3000);
		
		//Edit
		sq.EditSurvey(driver);
		Thread.sleep(3000);
		sq.UpdateSurveyCatName();
		Thread.sleep(3000);
		sq.UpdateQuestion();
		Thread.sleep(3000);
		sq.UpdateAnswer1();
		Thread.sleep(3000);
		sq.UpdateAnswer2();
		Thread.sleep(3000);
		sq.UpdateSurveySavebtn();
		Thread.sleep(3000);
		
		//Delete
		sq.DeleteSurveyQuestion();
		Thread.sleep(3000);
		sq.ConformDeleteSurveyQuestion();
		Thread.sleep(3000);
	}

}
