package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationsPage extends BasePage {
	
	public LocationsPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement CarsManagementdd;

@FindBy(xpath="//span[normalize-space()='Locations']")
	WebElement locationbtn;

@FindBy(xpath="//button[normalize-space()='Add Location']")
WebElement add_locationbtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
WebElement enter_cityNametxt;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
WebElement enter_categoryNametxt;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[4]/div/div/input")
WebElement enter_pincodetxt;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement locationsavebtn;

public void ClickCarsManagement()
{
	CarsManagementdd.click();
}

public void SelectLocation()
{
	locationbtn.click();
}

public void AddLocation()
{
	add_locationbtn.click();
}

public void EnterCityName()
{
	enter_cityNametxt.sendKeys("Bengaluru");
}

public void CatrgoryName()
{
	enter_categoryNametxt.sendKeys("Urban");
}

public void EnterPincode()
{
	enter_pincodetxt.sendKeys("560043");
}

public void SaveLocation()
{
	locationsavebtn.click();
}


}
