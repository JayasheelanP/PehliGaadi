package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditTransmissionPage extends BasePage {
	
	public EditTransmissionPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement CarsManagementdd;
	
	@FindBy(xpath="//span[normalize-space()='Transmission']")
	WebElement SelectTransmissionbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[9]/div/button[1]")
	WebElement Edit_Transmissionbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement EditTransmissiontypetxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement enter_imgurltxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement save_Transmissionbtn;
	
	public void ClickCarsManagement()
	{
		CarsManagementdd.click();
	}

	public void SelectTransmission()
	{
		SelectTransmissionbtn.click();
	}

	public void EditTransmission()
	{
		Edit_Transmissionbtn.click();
	}

	public void EnterTransmissionName() throws InterruptedException
	{
		//editmodelnametxt.clear();
		//editmodelnametxt.click();
		EditTransmissiontypetxt.sendKeys(Keys.CONTROL + "a");
		EditTransmissiontypetxt.sendKeys(Keys.DELETE);
		EditTransmissiontypetxt.sendKeys("Tiptronic Transmission");
	}

	
	public void EnterTransmissionUrl() throws InterruptedException
	{
		enter_imgurltxt.clear();
		enter_imgurltxt.sendKeys("https://adn.nestortech.io/api/va/6625ede4242e968507d1499f/automatic/DevPehliGaadi01/web?version=1");
		//enter_imgurltxt.sendKeys(Keys.CONTROL + "a");
		//enter_imgurltxt.sendKeys(Keys.DELETE);
		//enter_imgurltxt.sendKeys("https://adn.nestortech.io/api/va/6625ede4242e968507d1499f/automatic/DevPehliGaadi01/web?version=1");
	}
	
	public void Click_on_Save()
	{
		save_Transmissionbtn.click();
	}
}
