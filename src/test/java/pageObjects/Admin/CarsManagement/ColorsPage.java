package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ColorsPage extends BasePage {
	
	public ColorsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement CarsManagementdd;
	
	@FindBy(xpath="//span[normalize-space()='Colors']")
	WebElement Selectcolorbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[1]/button")
	WebElement add_colorbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement entercolortxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement enter_colorcodetxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement save_colorbtn;
	
	public void ClickCarsManagement()
	{
		CarsManagementdd.click();
	}

	public void SelectColors()
	{
		Selectcolorbtn.click();
	}

	public void Addcolor()
	{
		 add_colorbtn.click();
	}

	public void EnterColorName()
	{
		entercolortxt.sendKeys("Gold");
	}

	public void EnterColorCode()
	{
		enter_colorcodetxt.sendKeys("#ffd700");
	}
	
	public void Click_on_SaveColor()
	{
		save_colorbtn.click();
	}
}
