package pageObjects.Admin.ContentManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Admin.CarsManagement.BasePage;

public class OffersPage extends BasePage {
	
	public OffersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-gxg9xr-MuiPaper-root-MuiCard-root']//div[4]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement ContentManagementdd;
	
	@FindBy(xpath = "//span[normalize-space()='Offers']")
	WebElement SelectOffers;
	
	@FindBy(xpath ="//button[normalize-space()='Add Offer']")
	WebElement addOffersbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/p/div/div[1]/div/div/input")
	WebElement EnterOfferNametxt;
	
	@FindBy(xpath ="//input[@aria-label='controlled']")
	WebElement EnterOfferStatusbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/p/div/div[3]/div/div/input")
	WebElement EnterOfferDestxt;
	
	@FindBy(xpath ="//button[normalize-space()='Create']")
	WebElement OfferCreatebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/div[10]/div/button[1]")
	WebElement Offereditbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/p/div/div[1]/div/div/input")
	WebElement UpdateOfferNametxt;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/p/div/div[3]/div/div/input")
	WebElement UpdateOfferDestxt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement UpdateOfferbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/div[10]/div/button[2]")
	WebElement offerdeletebtn;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deleteOfferconfirmation;
	
	public void ClickContentManagement() {
		ContentManagementdd.click();
	}

	public void SelectOffers() {
		SelectOffers.click();
	}
	
	public void AddOffers()
	{
		addOffersbtn.click();
	}
	
	public void EnterOfferName()
	{
		EnterOfferNametxt.sendKeys("Special christmas offer");
	}
	
	public void OfferStatus()
	{
		EnterOfferStatusbtn.click();
	}
	
	public void EnterOfferDes()
	{
		EnterOfferDestxt.sendKeys("Three service Free");
	}
	
	public void OfferCreatebtn()
	{
		OfferCreatebtn.click();
	}
	
	public void ClickEditButton() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("return window.pageYoffset;");
		Thread.sleep(3000);
		Offereditbtn.click();
	}
	
	public void UpdateOfferName()
	{
		UpdateOfferNametxt.sendKeys(Keys.CONTROL + "a");
		UpdateOfferNametxt.sendKeys(Keys.DELETE);
		UpdateOfferNametxt.sendKeys("Special NewYear offer");
	}
	
	public void UpdateUpdateOfferDes()
	{
		UpdateOfferDestxt.sendKeys(Keys.CONTROL + "a");
		UpdateOfferDestxt.sendKeys(Keys.DELETE);
		UpdateOfferDestxt.sendKeys("One service Free");
	}
	
	public void OfferUpdatebtn()
	{
		UpdateOfferbtn.click();
	}
	
	public void DeleteOffer() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("return window.pageYoffset;");
		Thread.sleep(3000);
		offerdeletebtn.click();
	}

	public void ConformDeleteOffer()
	{
		deleteOfferconfirmation.click();
	}

}
