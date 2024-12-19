package testCases.Admin.More;

import org.testng.annotations.Test;

import pageObjects.Admin.More.TicketsPage;
import testBase.BaseClass;

public class TC003_Ticket extends BaseClass {
	
	@Test
	public void verify_More_SurveyQuestions() throws InterruptedException
	{
		TicketsPage clkMore=new TicketsPage(driver);
		
		clkMore.ClkMoreMenu();
		 Thread.sleep(3000);
		 clkMore.ClkTicket();
		 Thread.sleep(3000);
		 clkMore.scrollToButtonsAndClick();
		 Thread.sleep(3000);
		 clkMore.scrollLeft(driver);
		 clkMore.ClkAssign();
		 Thread.sleep(3000);
        clkMore.Assign();
		 clkMore.Select();
		 Thread.sleep(3000);
		 clkMore.ClkSave();
		 Thread.sleep(3000);
		 clkMore.scrollToButtonsAndClick();
		 Thread.sleep(3000);
		 clkMore.scrollLeft(driver);
		 Thread.sleep(3000);
		 clkMore.History();
		 Thread.sleep(3000);
		 clkMore.ClkClose();
		 Thread.sleep(3000);
		
	}

}
