package pageObjects.Admin.More;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.Admin.CarsManagement.BasePage;

public class SubscriptionsPage extends BasePage {
	
	public SubscriptionsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-2 css-o0rlmm']//button[@type='button']//*[name()='svg']")
	WebElement Moredd;
	
	@FindBy(xpath = "//span[normalize-space()='Subscriptions']")
	WebElement SelectSubscriptions;
	
	@FindBy(xpath ="//button[normalize-space()='Add Subscription']")
	WebElement addsubscriptionbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/div/input")
	WebElement SubscriptionNametxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/div/input")
	WebElement monthlypricetxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[4]/div/div/div/input")
	WebElement quaterlypricetxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[5]/div/div/div/input")
	WebElement halfyearlypricetxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[6]/div/div/div/input")
	WebElement annaulpricetxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[7]/div/div/div/textarea[1]")
	WebElement subscriptionDes;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement savesubscriptionbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[13]/div/button[1]")
	WebElement SubscriptionEdit;
	
	@FindBy(xpath="/html/body/div[5]/div[3]/div/div[1]/div/div[2]/div/div/button[2]")
	WebElement subInActive;
	
	@FindBy(xpath= "/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[3]")
	WebElement scrollableContainer;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[1]/div/div/div/input")
	WebElement UpdateSubscriptionNametxt;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[3]/div/div/div/input")
	WebElement Updatemonthlypricetxt;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[4]/div/div/div/input")
	WebElement Updatequaterlypricetxt;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[5]/div/div/div/input")
	WebElement Updatehalfyearlypricetxt;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[6]/div/div/div/input")
	WebElement Updateannaulpricetxt;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[7]/div/div/div/textarea[1]")
	WebElement UpdatesubscriptionDes;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[2]/button[2]")
	WebElement Updatesavesubscriptionbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[5]/div[12]/div/button[2]")
	WebElement Subscritiondeletebtn;

	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/button[2]")
	WebElement deleteSubscritionconfirmation;
	
	
	
	public void ClickonMore() {
		Moredd.click();
	}

	public void SelectCategories() {
		SelectSubscriptions.click();
	}
	
	public void AddSubscription()
	{
		addsubscriptionbtn.click();
	}
	
	public void EnterSubscriptionName()
	{
		SubscriptionNametxt.sendKeys("Service");
	}
	
	public void EnterMonthlyPrice()
	{
		monthlypricetxt.sendKeys("3000");
	}
	
	public void EnterQuarterlyPrice()
	{
		quaterlypricetxt.sendKeys("8000");
	}
	
	public void EnterHalfYearlyPrice()
	{
		halfyearlypricetxt.sendKeys("15000");
	}
	
	public void EnterAnnualPrice()
	{
		annaulpricetxt.sendKeys("28000");
	}
	
	public void SubscriptionDes()
	{
		subscriptionDes.sendKeys("By availing the subscription you will two car wash free monthly ");
	}
	
	public void SubscriptionSavebtn() throws InterruptedException
	{
		savesubscriptionbtn.click();
		Thread.sleep(5000);
	}
	
	public void EditSubscription(WebDriver driver)
	{   
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 400;", scrollableContainer);
		//js.executeScript("window.scrollTo(document.body.scrollWidth, 0);");
		SubscriptionEdit.click();
	}
	
	public void UpdateSubscriptionName()
	{
		UpdateSubscriptionNametxt.sendKeys(Keys.CONTROL + "a");
		UpdateSubscriptionNametxt.sendKeys(Keys.DELETE);
		UpdateSubscriptionNametxt.sendKeys("PehliGaadi");
	}
	
	public void InActive()
	{
		subInActive.click();
	}
	
	public void UpdateEnterMonthlyPrice()
	{
		Updatemonthlypricetxt.sendKeys(Keys.CONTROL + "a");
		Updatemonthlypricetxt.sendKeys(Keys.DELETE);
		Updatemonthlypricetxt.sendKeys("2000");
	}
	
	public void UpdateEnterQuarterlyPrice()
	{
		Updatequaterlypricetxt.sendKeys(Keys.CONTROL + "a");
		Updatequaterlypricetxt.sendKeys(Keys.DELETE);
		Updatequaterlypricetxt.sendKeys("7000");
	}
	
	public void UpdateEnterHalfYearlyPrice()
	{
		Updatehalfyearlypricetxt.sendKeys(Keys.CONTROL + "a");
		Updatehalfyearlypricetxt.sendKeys(Keys.DELETE);
		Updatehalfyearlypricetxt.sendKeys("14000");
	}
	
	public void UpdateEnterAnnualPrice()
	{
		Updateannaulpricetxt.sendKeys(Keys.CONTROL + "a");
		Updateannaulpricetxt.sendKeys(Keys.DELETE);
		Updateannaulpricetxt.sendKeys("27000");
	}
	
	public void UpdateSubscriptionDes()
	{
		UpdatesubscriptionDes.sendKeys(Keys.CONTROL + "a");
		UpdatesubscriptionDes.sendKeys(Keys.DELETE);
		UpdatesubscriptionDes.sendKeys("By availing the subscription you will one car wash free monthly");
	}
	
	public void UpdateSubscriptionSavebtn()
	{
		Updatesavesubscriptionbtn.click();
	}
	
	public void DeleteSubscrition()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 400;", scrollableContainer);
		Subscritiondeletebtn.click();
	}

	public void ConformDeleteSubscrition()
	{
		deleteSubscritionconfirmation.click();
	}
	
	
}
