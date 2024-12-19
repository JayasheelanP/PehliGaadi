package testCases.Admin.UserManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.UserManagement.ResourcesPage;
import testBase.BaseClass;

public class TC003_Resources extends BaseClass {
	
	@Test
	public void verify_UserManagement_Resources() throws InterruptedException
	{
		ResourcesPage clkResource=new ResourcesPage(driver);
		
		//Add Resource		
				clkResource.ClkUserMng();
				 Thread.sleep(3000);
				 clkResource.ClkResource();
				 Thread.sleep(3000);
				 clkResource.ClkAdd();
				 Thread.sleep(3000);
				 clkResource.EnterRName("Landing Page");
				 Thread.sleep(3000);
				 clkResource.ClkStatus();
				 Thread.sleep(3000);
				 clkResource.EnterDesctiption("Navigate To Landing");
				 clkResource.ClkSave();
				 Thread.sleep(3000);
				 
						 
		//Edit Resource
				 clkResource.ClkEdit();
				 Thread.sleep(3000);
				 Thread.sleep(3000);
				 clkResource.EditRname("LandingPageRescource");
				 Thread.sleep(3000);
				 clkResource.ClkEditStatus();
				 clkResource.EditDesctiption("Navigate to Resource Page");
				 clkResource.ClkEditSave();
				 Thread.sleep(3000);
				 
		//Delete Resource
				 clkResource.scrollToButtonsAndClick();
				 Thread.sleep(3000);
				 clkResource.scrollLeft(driver);
				 Thread.sleep(5000);
				 clkResource.ClkDeleteResource();
				 clkResource.ClkDelete();
			     Thread.sleep(3000);
		
	}

}
