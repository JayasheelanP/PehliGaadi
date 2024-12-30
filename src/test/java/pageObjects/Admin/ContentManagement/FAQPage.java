package pageObjects.Admin.ContentManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Admin.CarsManagement.BasePage;

public class FAQPage extends BasePage {
	
	public FAQPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-l3s2qg']//div[4]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement ContentManagementdd;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div/div/div[4]/div/div[2]/div/div/div/li[4]/div/span")
	WebElement SelectFAQs;
	
	@FindBy(xpath ="//button[normalize-space()='Add FAQ']")
	WebElement addFaqsbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div")
	WebElement selectcat;
	
	@FindBy(xpath ="//li[normalize-space()='Buyer']")
	WebElement selectcatdd;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement EnterQuestiontxt;
	
	@FindBy(xpath ="//textarea[@id='outlined-multiline-static']")
	WebElement EnterAnswertxt;
	
	@FindBy(xpath ="//button[normalize-space()='Save']")
	WebElement Savefaqbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/div[11]/div/button[1]")
	WebElement FAQeditbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement EnterCategorytxt;
	
	@FindBy(xpath="//button[normalize-space()='Active FAQ']")
	WebElement ClickActiveFaqbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement UpdateQuestiontxt;

	@FindBy(xpath="//textarea[@id='outlined-multiline-static']")
	WebElement UpdateAnswertxt;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement EditSavebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/div[11]/div/button[2]")
	WebElement Faqdeletebtn;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deleteFaqconfirmation;
	
	
	public void ClickContentManagement() {
		ContentManagementdd.click();
	}

	public void SelectFAQs() {
		SelectFAQs.click();
	}
	
	public void AddFaqs()
	{
		addFaqsbtn.click();
	}
	
	public void ClickCategory()
	{
		selectcat.click();
	}
	
	public void SelectCategory()
	{
		selectcatdd.click();
	}
	
	public void EnterQuestion()
	{
		EnterQuestiontxt.sendKeys("First time Buyer Offer");
	}
	
	public void EnterAnswer()
	{
		EnterAnswertxt.sendKeys("Yes we do have offer for First time Buyer");
	}
	
	public void Savebtn()
	{
		Savefaqbtn.click();
	}
	
	public void ClickEditButton() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("return window.pageYoffset;");
		Thread.sleep(3000);
		FAQeditbtn.click();
	}
	
	public void UpdateCategory()
	{
		EnterCategorytxt.sendKeys(Keys.CONTROL + "a");
		EnterCategorytxt.sendKeys(Keys.DELETE);
		EnterCategorytxt.sendKeys("Seller");
	}
	
	public void ClickonActiveFaq()
	{
		ClickActiveFaqbtn.click();
	}
	
	public void UpdateQuestion()
	{
		UpdateQuestiontxt.sendKeys(Keys.CONTROL + "a");
		UpdateQuestiontxt.sendKeys(Keys.DELETE);
		UpdateQuestiontxt.sendKeys("Second time Buyer Offer");
	}
	
	public void UpdateAnswer()
	{
		UpdateAnswertxt.sendKeys(Keys.CONTROL + "a");
		UpdateAnswertxt.sendKeys(Keys.DELETE);
		UpdateAnswertxt.sendKeys("No we do have offer for Second time Buyer");
	}
	
	public void EditSaveBTN()
	{
		EditSavebtn.click();
	}
	
	public void DeleteFaq() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("return window.pageYoffset;");
		Thread.sleep(3000);
		Faqdeletebtn.click();
	}

	public void ConformDeleteFaq()
	{
		deleteFaqconfirmation.click();
	}

	
}
