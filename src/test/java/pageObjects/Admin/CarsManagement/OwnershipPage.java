package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OwnershipPage extends BasePage {
	
	public OwnershipPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement CarsManagementdd;

@FindBy(xpath="//span[normalize-space()='Ownership']")
	WebElement ownershipbtn;

@FindBy(xpath="//button[normalize-space()='Add Ownership']")
WebElement add_owner_shipbtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div/div/div/input")
WebElement add_owner_typetxt;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement save_owneebtnt;

public void ClickCarsManagement()
{
	CarsManagementdd.click();
}

public void SelectOwnership()
{
	ownershipbtn.click();
}

public void AddOwnership()
{
	add_owner_shipbtn.click();
}

public void EnterOwnershipType()
{
	add_owner_typetxt.sendKeys("5th Owner");
}

public void CreateOwnership()
{
	save_owneebtnt.click();
}


}
