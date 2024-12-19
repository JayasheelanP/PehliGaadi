package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FuelPage extends BasePage {
	
	public FuelPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement CarsManagementdd;
	
	@FindBy(xpath="//span[normalize-space()='Fuel']")
	WebElement SelectFuelbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[1]/button")
	WebElement add_fuelbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement fuelnametxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/input")
	WebElement enter_imgurltxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement save_fuelbtn;
	
	@FindBy(xpath="//div[@class='MuiDataGrid-row MuiDataGrid-row--lastVisible']//button[@type='button'][normalize-space()='Edit']")
	WebElement Edit_fuelbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement Editfuel_nametxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div")
	WebElement Editfuel_urltxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement Editfuel_savebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[5]/div[9]/div/button[2]")
	WebElement deletefuelbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deletefuelconformbtn;
	
	
	public void ClickCarsManagement()
	{
		CarsManagementdd.click();
	}

	public void SelectFuel()
	{
		SelectFuelbtn.click();
	}

	public void AddFuel()
	{
		add_fuelbtn.click();
	}

	public void EnterFuelName()
	{
		fuelnametxt.sendKeys("White Petrol");
	}

	public void FuelUrl()
	{
		enter_imgurltxt.sendKeys("https://adn.nestortech.io/api/va/6625ede4242e968507d1499f/petrol/DevPehliGaadi01/web?version=1");
	}
	
	public void Click_on_Save()
	{
		save_fuelbtn.click();
	}
	
	public void EditFuel()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		Edit_fuelbtn.click();
	}

	public void EditFuelName() throws InterruptedException
	{
		//editmodelnametxt.clear();
		//editmodelnametxt.click();
		Editfuel_nametxt.sendKeys(Keys.CONTROL + "a");
		Editfuel_nametxt.sendKeys(Keys.DELETE);
		Editfuel_nametxt.sendKeys("Black petrol");
	
		/*WebElement firstTextbox = driver.findElement(By.xpath("Editfuel_nametxt"));
		firstTextbox.sendKeys(Keys.CONTROL + "a");
		firstTextbox.sendKeys(Keys.DELETE);
		firstTextbox.sendKeys("Black petrol");
		firstTextbox.sendKeys(Keys.TAB);
		WebElement secondTextbox = driver.switchTo().activeElement();
		secondTextbox.sendKeys("https://adn.nestortech.io/api/va/6625ede4242e968507d1499f/automatic/DevPehliGaadi01/web?version=1");
		secondTextbox.sendKeys(Keys.ENTER);*/
	}

	
	public void EditFuelUrl() throws InterruptedException
	{
		Editfuel_nametxt.sendKeys(Keys.TAB);
		WebElement secondTextbox = driver.switchTo().activeElement();
		secondTextbox.sendKeys("https://adn.nestortech.io/api/va/6625ede4242e968507d1499f/deisel/DevPehliGaadi01/web?version=1");
		secondTextbox.sendKeys(Keys.ENTER);
		//enter_imgurltxt.sendKeys(Keys.CONTROL + "a");
		//enter_imgurltxt.sendKeys(Keys.DELETE);
		//enter_imgurltxt.sendKeys("https://adn.nestortech.io/api/va/6625ede4242e968507d1499f/automatic/DevPehliGaadi01/web?version=1");
	}
	
	public void Click_on_EditSave()
	{
		Editfuel_savebtn.click();
	}
	
	public void DeleteFuel()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		deletefuelbtn.click();
	}

	public void ConformDeleteFuel()
	{
		deletefuelconformbtn.click();
	}
	
}
