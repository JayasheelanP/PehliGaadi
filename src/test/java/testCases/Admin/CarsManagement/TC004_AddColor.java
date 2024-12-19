package testCases.Admin.CarsManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.CarsManagement.ColorsPage;
import pageObjects.Admin.CarsManagement.EditColorPage;
import testBase.BaseClass;

public class TC004_AddColor extends BaseClass {
	
	@Test
	public void verify_CarManagement_AddColor() throws InterruptedException
	{
		ColorsPage cp =new ColorsPage(driver);
		
		cp.ClickCarsManagement();
		cp.SelectColors();
		Thread.sleep(3000);
		cp.Addcolor();
		Thread.sleep(3000);
		cp.EnterColorName();
		Thread.sleep(3000);
		cp.EnterColorCode();
		Thread.sleep(3000);
		cp.Click_on_SaveColor();
		Thread.sleep(3000);
		
		EditColorPage ecp =new EditColorPage(driver);
		
		ecp.ClickPageSize();
		ecp.SetPageSize();
		Thread.sleep(3000);
		ecp.ColorEditButton();
		Thread.sleep(3000);
		ecp.EnterColorName();
		ecp.EnterColorCodeName();
		ecp.SaveEditcolor();
		Thread.sleep(3000);
		
		ecp.DeleteColor();
		Thread.sleep(3000);
		ecp.ConformDeleteColor();
		Thread.sleep(3000);
	}
}
