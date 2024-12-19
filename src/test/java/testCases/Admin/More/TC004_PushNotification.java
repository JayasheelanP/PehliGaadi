package testCases.Admin.More;

import org.testng.annotations.Test;

import pageObjects.Admin.More.PushNotificationPage;
import testBase.BaseClass;

public class TC004_PushNotification extends BaseClass {
	
	@Test
	public void verify_More_PushNotification() throws InterruptedException
	{
		PushNotificationPage clkMore =new PushNotificationPage(driver);
		
		clkMore.ClkMoreMenu();
		 Thread.sleep(3000);
		 clkMore.ClkPushNotification();
		 Thread.sleep(3000);
		 clkMore.ClkCreateNotification();
		 Thread.sleep(3000);
		 clkMore.EnterTitle("Car Details");
		 clkMore.EnterBody("Your car has been addeded to platform");
		 clkMore.ClkTime();
		 clkMore.SelectType("Application");
		 Thread.sleep(3000);
		 clkMore.NDuration("2 hour");
		 Thread.sleep(3000);
		 clkMore.ClkSelectAll();
		 Thread.sleep(3000);
		 clkMore.ClkNotification();
		 Thread.sleep(3000);
		
	}

}
