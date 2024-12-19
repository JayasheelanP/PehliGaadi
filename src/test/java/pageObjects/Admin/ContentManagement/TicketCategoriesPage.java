package pageObjects.Admin.ContentManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Admin.CarsManagement.BasePage;

public class TicketCategoriesPage extends BasePage {
	
	public TicketCategoriesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-gxg9xr-MuiPaper-root-MuiCard-root']//div[4]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement ContentManagementdd;
	
	@FindBy(xpath = "//span[normalize-space()='Ticket Categories']")
	WebElement ticketcategories;
	
	@FindBy(xpath ="//button[normalize-space()='Add Category']")
	WebElement addcategorybtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement categorynametxt;
	
	@FindBy(xpath ="//button[normalize-space()='Inactive']")
	WebElement InActivecat;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/textarea[1]")
	WebElement categorydesc;
	
	@FindBy(xpath ="//button[normalize-space()='Create']")
	WebElement createcatbtn;
	
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[9]/div/button[1]")
	WebElement editticketcategories;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement updatecatnametxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/button[1]")
	WebElement activecatbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/textarea[1]")
	WebElement updatecatDesctxt;
	
	@FindBy(xpath ="//button[normalize-space()='Save']")
	WebElement EditcatSavebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[9]/div/button[2]")
	WebElement Catdeletebtn;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deleteCatconfirmation;
	
	public void ClickContentManagement() {
		ContentManagementdd.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 400)");
	}

	public void SelectCategories() {
		ticketcategories.click();
	}
	
	public void AddCategory()
	{
		addcategorybtn.click();
	}
	
	public void EnterCategoryName()
	{
		categorynametxt.sendKeys("warranty claims");
	}
	
	public void ClickoncatInActive()
	{
		InActivecat.click();
	}
	
	public void EnterCategoryDesc()
	{
		categorydesc.sendKeys("I need to climb warrenty for my car");
	}
	
	public void CreateCat()
	{
		createcatbtn.click();
	}
	
	public void ClickEditButton() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("return window.pageYoffset;");
		Thread.sleep(3000);
		editticketcategories.click();
	}
	
	public void UpdateCatName()
	{
		updatecatnametxt.sendKeys(Keys.CONTROL + "a");
		updatecatnametxt.sendKeys(Keys.DELETE);
		updatecatnametxt.sendKeys("warranty ");
	}
	
	public void ClickonActive()
	{
		activecatbtn.click();
	}
	
	public void UpdatecatDes()
	{
		updatecatDesctxt.sendKeys(Keys.CONTROL + "a");
		updatecatDesctxt.sendKeys(Keys.DELETE);
		updatecatDesctxt.sendKeys("I need to climb warrenty for my battery");
	}
	
	public void CatSavebtn()
	{
		EditcatSavebtn.click();
	}
	
	public void Deletecat() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		Catdeletebtn.click();
	}

	public void ConformDeleteCat()
	{
		deleteCatconfirmation.click();
	}

	

}
