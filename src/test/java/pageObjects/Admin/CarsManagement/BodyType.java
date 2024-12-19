package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BodyType extends BasePage {
	
	public BodyType(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
WebElement CarsManagementdd;

@FindBy(xpath="//span[normalize-space()='Body Type']")
WebElement bodytypebtn;

@FindBy(xpath="//button[normalize-space()='Add Body Type']")
WebElement add_body_type_btn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div/div/div/input")
WebElement add_body_nametxt;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement create_body_button;

public void ClickCarsManagement()
{
	CarsManagementdd.click();
}

public void SelectBodyType()
{
	bodytypebtn.click();
}

public void AddBodyType()
{
	add_body_type_btn.click();
}

public void EnterBodyName()
{
	add_body_nametxt.sendKeys("Convertible");
}

public void CreateBodyType()
{
	create_body_button.click();
}

}