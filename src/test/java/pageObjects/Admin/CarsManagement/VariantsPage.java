package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VariantsPage extends BasePage {
	
	public VariantsPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
WebElement CarsManagementdd;

@FindBy(xpath="//span[normalize-space()='Variants']")
WebElement Variantsbtn;

@FindBy(xpath="//button[normalize-space()='Add Variant']")
WebElement addvariantbtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
WebElement add_variant_nametxt;

@FindBy(xpath="//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-11u53oe-MuiSelect-select-MuiInputBase-input-MuiOutlinedInput-input']")
WebElement model_name_dd;

@FindBy(xpath="//li[normalize-space()='Elantra']")
WebElement select_model_name;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement create_varient_button;

public void ClickCarsManagement()
{
	CarsManagementdd.click();
}

public void SelectVariants()
{
	Variantsbtn.click();
}

public void AddVarient()
{
	addvariantbtn.click();
}

public void EnterVarientName()
{
	add_variant_nametxt.sendKeys("Crysta");
}

public void ModelNameVarDD()
{
	model_name_dd.click();
}

public void SelecModelVarName()
{
	select_model_name.click();
}

public void CreateVarient()
{
	create_varient_button.click();
}

}