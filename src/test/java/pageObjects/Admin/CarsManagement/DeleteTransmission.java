package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteTransmission extends BasePage {
	
	public DeleteTransmission(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement CarsManagementdd;
	
	@FindBy(xpath="//span[normalize-space()='Transmission']")
	WebElement SelectTransmissionbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[9]/div/button[2]")
	WebElement delete_Transmissionbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deletebtn;
	

	public void ClickCarsManagement()
	{
		CarsManagementdd.click();
	}
	
	public void SelectTransmission()
	{
		SelectTransmissionbtn.click();
	}

	public void DeleteTransmissions()
	{
		delete_Transmissionbtn.click();
	}

	public void ConformDeleteTransmission()
	{
		deletebtn.click();
	}
}