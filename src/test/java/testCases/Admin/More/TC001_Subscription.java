package testCases.Admin.More;

import org.testng.annotations.Test;

import pageObjects.Admin.More.SubscriptionsPage;
import testBase.BaseClass;

public class TC001_Subscription extends BaseClass {
	
	@Test
	public void verify_More_Subscription() throws InterruptedException
	{
		SubscriptionsPage sp = new SubscriptionsPage(driver);
		
		//Add
		sp.ClickonMore();
	    Thread.sleep(3000);
		sp.SelectCategories();
		Thread.sleep(5000);
//		sp.AddSubscription();
//		Thread.sleep(3000);
//		sp.EnterSubscriptionName();
//		Thread.sleep(3000);
//		sp.EnterMonthlyPrice();
//		Thread.sleep(3000);
//		sp.EnterQuarterlyPrice();
//		Thread.sleep(3000);
//		sp.EnterHalfYearlyPrice();
//		Thread.sleep(3000);
//		sp.EnterAnnualPrice();
//		Thread.sleep(3000);
//		sp.SubscriptionDes();
//		Thread.sleep(3000);
//		sp.SubscriptionSavebtn();
//		Thread.sleep(5000);
		
		//Edit
		sp.EditSubscription(driver);
		Thread.sleep(3000);
		sp.UpdateSubscriptionName();
		Thread.sleep(3000);
		sp.InActive();
		Thread.sleep(3000);
		sp.UpdateEnterMonthlyPrice();
		Thread.sleep(3000);
		sp.UpdateEnterQuarterlyPrice();
		Thread.sleep(3000);
		sp.UpdateEnterHalfYearlyPrice();
		Thread.sleep(3000);
		sp.UpdateEnterAnnualPrice();
		Thread.sleep(3000);
		sp.UpdateSubscriptionDes();
		Thread.sleep(3000);
		sp.UpdateSubscriptionSavebtn();
		Thread.sleep(3000);
		
		//Delete
		sp.DeleteSubscrition();
		Thread.sleep(3000);
		sp.ConformDeleteSubscrition();
		Thread.sleep(3000);
		
		
	}

}
