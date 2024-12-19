package testCases.Admin.UserManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.UserManagement.UsersPage;
import testBase.BaseClass;

public class TC001_User extends BaseClass {
	
	@Test
	public void verify_UserManagement_User() throws InterruptedException
	{
		UsersPage clkUser = new UsersPage(driver);
		
		clkUser.ClkUserMng();
		 Thread.sleep(3000);
		 clkUser.ClkUser();
		 Thread.sleep(3000);
		 clkUser.scrollToButtonsAndClick();
		 Thread.sleep(5000);
		 clkUser.scrollLeft(driver);
		 Thread.sleep(5000);
		 clkUser.ClearUserName();
		 Thread.sleep(5000);
		 clkUser.EnterUserName("Sumitra");
		 Thread.sleep(3000);
		 clkUser.ClearUserNumber();
		 Thread.sleep(5000);
		 clkUser.EnterUserNumber("1234567890");
		 Thread.sleep(3000);
		 clkUser.EnterEmail("pehligaadi@gmail.com");
		 Thread.sleep(3000);
		 clkUser.ClearRole();
		 Thread.sleep(3000);
		 clkUser.ClkStatus();
		 Thread.sleep(3000);
		 clkUser.EnterRole("Admin");
		 clkUser.ClkVerified();
		 clkUser.ClkSave();
		 Thread.sleep(3000);
        clkUser.scrollToButtonsAndClick();
		 Thread.sleep(5000);
		 clkUser.scrollLeftDelete(driver);
		 Thread.sleep(5000);
	     clkUser.ClkDelete();
		 Thread.sleep(3000);
		
	}
	

}
