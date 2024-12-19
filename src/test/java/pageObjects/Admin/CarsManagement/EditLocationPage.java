package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditLocationPage extends BasePage {
	
	public EditLocationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement CarsManagementdd;
	
	@FindBy(xpath="//span[normalize-space()='Locations']")
	WebElement SelectLocationbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[3]/div/div[2]/div")
	WebElement pagesize;

	@FindBy(xpath="//li[normalize-space()='100']")
	WebElement pagesize100;

	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[74]/div[11]/div/button[1]")
	WebElement LocationEditbtn;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement citynametxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/input")
	WebElement citycategorytxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement citypintxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[4]/div/div/input")
	WebElement citylogotxt;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement editsavebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[74]/div[11]/div/button[2]")
	WebElement locationdeletebtn;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deletelocationconfirmation;
	
	public void ClickCarsManagemet()
	{
		CarsManagementdd.click();
	}

	public void SelectLocation()
	{
		SelectLocationbtn.click();
	}

	public void ClickPageSize() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		Thread.sleep(5000);
		pagesize.click();
		Thread.sleep(5000);
	}

	public void SetPageSize()
	{
		pagesize100.click();
	}

	public void LocationEditButton()
	{
		LocationEditbtn.click();
	}

	public void EnterCityName() throws InterruptedException
	{
		//editmodelnametxt.clear();
		//editmodelnametxt.click();
		citynametxt.sendKeys(Keys.CONTROL + "a");
		citynametxt.sendKeys(Keys.DELETE);
		citynametxt.sendKeys("Bangalore");
	}
	
	public void EnterCityCatName() throws InterruptedException
	{
		//editmodelnametxt.clear();
		//editmodelnametxt.click();
		citycategorytxt.sendKeys(Keys.CONTROL + "a");
		citycategorytxt.sendKeys(Keys.DELETE);
		citycategorytxt.sendKeys("North");
	}
	
	public void EnterPincode() throws InterruptedException
	{
		//editmodelnametxt.clear();
		//editmodelnametxt.click();
		citypintxt.sendKeys(Keys.CONTROL + "a");
		citypintxt.sendKeys(Keys.DELETE);
		citypintxt.sendKeys("560043");
	}
	
	public void EnterLogoURL() throws InterruptedException
	{
		//editmodelnametxt.clear();
		//editmodelnametxt.click();
		citylogotxt.sendKeys(Keys.CONTROL + "a");
		citylogotxt.sendKeys(Keys.DELETE);
		citylogotxt.sendKeys("https://adn.nestortech.io/api/va/6625ede4242e968507d1499f/BangloreCityLogo/DevPehliGaadi01/web?version=1");
	}

	public void SaveEditLocation() throws InterruptedException
	{
		editsavebtn.click();
		Thread.sleep(5000);
	}
	
	public void DeleteLocation()
	{
		locationdeletebtn.click();
	}

	public void ConformDeleteLocation()
	{
		deletelocationconfirmation.click();
	}

}