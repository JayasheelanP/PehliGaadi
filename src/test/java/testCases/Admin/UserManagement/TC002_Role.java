package testCases.Admin.UserManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.UserManagement.RolesPage;
import testBase.BaseClass;

public class TC002_Role extends BaseClass {
	
	@Test
	public void verify_UserManagement_User() throws InterruptedException
	{
		RolesPage clkRoleMang =new RolesPage(driver);
		
		clkRoleMang.ClkUserMng();
		 Thread.sleep(3000);
		 clkRoleMang.ClkRoles();
		 Thread.sleep(3000);
		 clkRoleMang.ClkAddRole();
		 Thread.sleep(3000);
		 clkRoleMang.ClkRoleName();
		 Thread.sleep(3000);
//		 clkUserMang. RoleTextField("Dealers");
		 clkRoleMang.EnterRole("ASASAS");
		 Thread.sleep(3000);
//		 System.out.println("Role name 'Dealers' entered successfully.");
//		 clkUserMang.ClkStatus();
//		 Thread.sleep(3000);
		 clkRoleMang.ClkSave();
		 Thread.sleep(3000);
		 
		 
//Edit Role
		     clkRoleMang.scrollToButtonsAndClick();
			 Thread.sleep(5000);
			 
			 clkRoleMang.ClkEditRole();
			 Thread.sleep(3000);
			 clkRoleMang.ClkEditRoleName();
			 clkRoleMang.ClearEditRoleName();
			 Thread.sleep(3000);
			 clkRoleMang.EnterRoleName("User");
			 Thread.sleep(3000);
			 clkRoleMang.ClkSaveButton();
			 Thread.sleep(3000);
	 //Delete Role
			 clkRoleMang.scrollToButtonsAndClick();
			 Thread.sleep(5000);
			 clkRoleMang.ClkDeleteButton();
			 Thread.sleep(3000);
			 clkRoleMang.ClkDeleteRoleName();
			 Thread.sleep(3000);
		
	}

}
