package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModelsPage extends BasePage {
	
	public ModelsPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
WebElement CarsManagementdd;

@FindBy(xpath="//span[normalize-space()='Models']")
WebElement modelsop;

@FindBy(xpath="//button[normalize-space()='Add Model']")
WebElement addmodelbtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
WebElement modelnametxt;

@FindBy(xpath="//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-11u53oe-MuiSelect-select-MuiInputBase-input-MuiOutlinedInput-input']")
WebElement brandnamedd;

@FindBy(xpath="/html/body/div[5]/div[3]/ul/li[8]")
WebElement selectbrandop;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement createmodelbtn;

public void ClickCarsManageme()
{
	CarsManagementdd.click();
}

public void SelectModels()
{
	modelsop.click();
}

public void AddModel()
{
	addmodelbtn.click();
}

public void EnterModelName() throws InterruptedException
{
	modelnametxt.sendKeys("jaguar");
}

public void BrandNameDD()
{
	brandnamedd.click();
}

public void SelectBrandName()
{
	selectbrandop.click();
}

public void CreateModel()
{
	createmodelbtn.click();
}

}
