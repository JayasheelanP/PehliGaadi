package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransmissionsPage extends BasePage {
	
	public TransmissionsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement CarsManagementdd;
	
	@FindBy(xpath="//span[normalize-space()='Transmission']")
	WebElement SelectTransmissionbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[1]/button")
	WebElement add_Transmissionbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/p/div/div[1]/div/div/input")
	WebElement Transmissiontypetxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/p/div/div[2]/div/div/input")
	WebElement enter_imgurltxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement create_Transmissionbtn;
	
	public void ClickCarsManagement()
	{
		CarsManagementdd.click();
	}

	public void SelectTransmission()
	{
		SelectTransmissionbtn.click();
	}

	public void AddTransmission()
	{
		add_Transmissionbtn.click();
	}

	public void EnterTransmissionName()
	{
		Transmissiontypetxt.sendKeys("Semi-Automatic Transmission");
	}

	public void EnterTransmissionUrl()
	{
		enter_imgurltxt.sendKeys("https://adn.nestortech.io/api/va/6625ede4242e968507d1499f/automatic/DevPehliGaadi01/web?version=1");
	}
	
	public void Click_on_Create()
	{
		create_Transmissionbtn.click();
	}
}
