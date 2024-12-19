package pageObjects.Admin.ContentManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Admin.CarsManagement.BasePage;

public class ServicesPage extends BasePage {
	
	public ServicesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-gxg9xr-MuiPaper-root-MuiCard-root']//div[4]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement ContentManagementdd;
	
	@FindBy(xpath = "//span[normalize-space()='Services']")
	WebElement SelectServices;
	
	@FindBy(xpath ="//button[normalize-space()='Add Services']")
	WebElement addServicesbtn;
	
	@FindBy(xpath ="//div[normalize-space()='Select a Category']")
	WebElement selectcat;
	
	@FindBy(xpath ="//li[normalize-space()='Services']")
	WebElement selectcatdd;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/button[2]")
	WebElement selectInActivebtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/div/input")
	WebElement EnterNametxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[4]/div/div/div/textarea[1]")
	WebElement EnterDectxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[5]/div/div/div/input")
	WebElement EnterPricetxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[6]/div/div/div/input")
	WebElement EntertheofferPricetxt;
	
	@FindBy(xpath ="//button[normalize-space()='Save']")
	WebElement serviveSavebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[12]/div[11]/div/button[1]")
	WebElement ServiceEditbtn;
	
	@FindBy(xpath ="//div[normalize-space()='Services']")
	WebElement clickCategorydd;
	
	@FindBy(xpath ="//li[normalize-space()='Warranty']")
	WebElement UpdateCategorydd;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[2]/div/div/button[1]")
	WebElement selectActivebtn;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[3]/div/div/div/input")
	WebElement updateservicenametxt;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[4]/div/div/div/textarea[1]")
	WebElement updateserviceDesctxt;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[5]/div/div/div/input")
	WebElement updateprice;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[6]/div/div/div/input")
	WebElement updateofferprice;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[2]/button[2]")
	WebElement offerupdatebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[3]/div/div[2]/div")
	WebElement pagesize;

	@FindBy(xpath="//li[normalize-space()='100']")
	WebElement pagesize100;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[12]/div[11]/div/button[2]")
	WebElement Servicedeletebtn;

	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/button[2]")
	WebElement deleteServiceconfirmation;
	
	public void ClickContentManagement() {
		ContentManagementdd.click();
	}

	public void SelectServices() {
		SelectServices.click();
	}
	
	public void AddServices()
	{
		addServicesbtn.click();
	}
	
	public void ClickCategory()
	{
		selectcat.click();
	}
	
	public void SelectCategory()
	{
		selectcatdd.click();
	}
	
	public void ClickInActive()
	{
		selectInActivebtn.click();
	}
	
	public void EnterName()
	{
		EnterNametxt.sendKeys("Vechile Buy Back");
	}
	
	public void EnterDescription()
	{
		EnterDectxt.sendKeys("Easy return, exchange and upgrade");
	}
	
	public void EnterServivePrice()
	{
		EnterPricetxt.sendKeys("500000");
	}
	
	public void EnterServiveOfferPrice()
	{
		EntertheofferPricetxt.sendKeys("5000");
	}
	
	public void ClickonServiceSavebtn()
	{
		serviveSavebtn.click();
	}
	
	public void ClickPageSize() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("return window.pageYoffset;");
		Thread.sleep(3000);
		pagesize.click();
		Thread.sleep(3000);
	}
	
	public void SetPageSize()
	{
		pagesize100.click();
	}
	
	public void scrollLeft(WebDriver driver) {
	       WebElement scrollableContainer = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[3]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 400;", scrollableContainer);
	}
	
	public void ClickEditButton()
	{
		ServiceEditbtn.click();
	}
	
	public void UpdateServiceCategory()
	{
		clickCategorydd.click();
		UpdateCategorydd.click();
	}
	
	public void ClickonActiveService()
	{
		selectActivebtn.click();
	}
	
	public void UpdateServiceName()
	{
		updateservicenametxt.sendKeys(Keys.CONTROL + "a");
		updateservicenametxt.sendKeys(Keys.DELETE);
		updateservicenametxt.sendKeys("Return Policy");
	}
	
	public void UpdateServiceDesc()
	{
		updateserviceDesctxt.sendKeys(Keys.CONTROL + "a");
		updateserviceDesctxt.sendKeys(Keys.DELETE);
		updateserviceDesctxt.sendKeys("90 days from the Date of Purchase");
	}
	
	public void UpdateServicePrice()
	{
		updateprice.sendKeys(Keys.CONTROL + "a");
		updateprice.sendKeys(Keys.DELETE);
		updateprice.sendKeys("600000");
	}
	
	public void UpdateServiceOfferPrice()
	{
		updateofferprice.sendKeys(Keys.CONTROL + "a");
		updateofferprice.sendKeys(Keys.DELETE);
		updateofferprice.sendKeys("6000");
	}
	
	public void UpdateSaveBtn()
	{
		offerupdatebtn.click();
	}
	
	public void DeleteService()
	{
		Servicedeletebtn.click();
	}

	public void ConformDeleteService()
	{
		deleteServiceconfirmation.click();
	}

}
