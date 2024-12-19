package testCases.Admin.ContentManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.ContentManagement.MediaPage;
import testBase.BaseClass;

public class TC001_Media extends BaseClass {
	
	@Test
	public void verify_ContentManagement_Media() throws InterruptedException
	{
		MediaPage mp =new MediaPage(driver);
		
		mp.ClickContentManagement();
		mp.SelectMedia();
		Thread.sleep(3000);
		mp.AddMedia();
		mp.EnterPageName();
		mp.EnterContainerName();
		mp.FileUpload();
		Thread.sleep(3000);
		mp.ClickonSave();
		
		mp.ClickonEdit();
		mp.UpdatePageName();
		mp.UpdateContainerName();
		mp.ClickonEditSave();
		Thread.sleep(3000);
		
		mp.ClickonDelete();
		Thread.sleep(3000);
		mp.ClickonDeleteConf();
		Thread.sleep(3000);
 
    }
}
