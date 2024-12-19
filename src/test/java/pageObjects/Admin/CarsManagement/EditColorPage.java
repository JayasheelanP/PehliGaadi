package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditColorPage extends BasePage {
	
	public EditColorPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement CarsManagementdd;
	
	@FindBy(xpath="//span[normalize-space()='Colors']")
	WebElement Selectcolorbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[3]/div/div[2]/div")
	WebElement pagesize;

	@FindBy(xpath="//li[normalize-space()='100']")
	WebElement pagesize100;

	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[11]/div[9]/div/button[1]")
	WebElement colorEditbtn;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement colornametxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement colorcodetxt;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement editsavebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[11]/div[9]/div/button[2]")
	WebElement colordeletebtn;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deletcolorconfirmation;
	
	public void ClickCarsManagemet()
	{
		CarsManagementdd.click();
	}

	public void SelectColorType()
	{
		Selectcolorbtn.click();
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

	public void ColorEditButton()
	{
		colorEditbtn.click();
	}

	public void EnterColorName() throws InterruptedException
	{
		//editmodelnametxt.clear();
		//editmodelnametxt.click();
		colornametxt.sendKeys(Keys.CONTROL + "a");
		colornametxt.sendKeys(Keys.DELETE);
		colornametxt.sendKeys("Coffee");
	}
	
	public void EnterColorCodeName() throws InterruptedException
	{
		//editmodelnametxt.clear();
		//editmodelnametxt.click();
		colorcodetxt.sendKeys(Keys.CONTROL + "a");
		colorcodetxt.sendKeys(Keys.DELETE);
		colorcodetxt.sendKeys("#6F4E37");
	}

	public void SaveEditcolor() throws InterruptedException
	{
		editsavebtn.click();
		Thread.sleep(5000);
	}
	
	public void DeleteColor()
	{
		colordeletebtn.click();
	}

	public void ConformDeleteColor()
	{
		deletcolorconfirmation.click();
	}

}