package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.BodyType;
import pageObjects.Admin.CarsManagement.EditBodyTypes;
import testBase.BaseClass;

@Test
public class TC003_AddBodyType extends BaseClass {
	
	public void verify_CarManagement_AddBodyType() throws InterruptedException
	{
		BodyType bt =new BodyType(driver);
		
		bt.ClickCarsManagement();
		bt.SelectBodyType();
		Thread.sleep(3000);
		bt.AddBodyType();
		Thread.sleep(3000);
		bt.EnterBodyName();
		bt.CreateBodyType();
		
		EditBodyTypes ebt =new EditBodyTypes(driver);
		
		ebt.ClickPageSize();
		ebt.SetPageSize();
		ebt.BodyTypeEditButton();
		Thread.sleep(3000);
		ebt.EnterBodyTypeName();
		ebt.SaveEditBodyType();
		Thread.sleep(3000);
		
		ebt.DeleteBody();
		Thread.sleep(3000);
		ebt.ConformDeleteBody();
		Thread.sleep(3000);
		
		
	}

}
