package pageObjects.Admin.ContentManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Admin.CarsManagement.BasePage;

public class InspectionQuestionsPage extends BasePage {
	
	public InspectionQuestionsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-gxg9xr-MuiPaper-root-MuiCard-root']//div[4]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement ContentManagementdd;
	
	@FindBy(xpath = "//span[normalize-space()='Inspection Questions']")
	WebElement SelectInspection;
	
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[1]/button")
	WebElement addquestionbtn;
	
	@FindBy(xpath ="//div[@id='category-name']")
	WebElement selectcattxt;
	
	@FindBy(xpath ="//li[normalize-space()='Documentation']")
	WebElement selectcat;
	
	@FindBy(xpath="//input[@id='question']")
	WebElement questiontxt;
	
	@FindBy(xpath="//input[@id='answer-1']")
	WebElement answer1txt;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/p/div/div[5]/div/div/div/div/div/input")
	WebElement Updateanswer1txt;
	
	@FindBy(xpath="//button[normalize-space()='Create']")
	WebElement createbtn;
	
	@FindBy(xpath ="//li[normalize-space()='Engine']")
	WebElement selectEngine;
	
	@FindBy(xpath ="//button[normalize-space()='Multi Answer']")
	WebElement multiansbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/p/div/div[4]/div/button")
	WebElement addansbtn;
	
	@FindBy(xpath="//input[@id='answer-2']")
	WebElement answer2txt;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[3]/div/div[2]/div")
	WebElement pagesize;

	@FindBy(xpath="//li[normalize-space()='100']")
	WebElement pagesize100;

	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[38]/div[9]/div/button[1]")
	WebElement IQeditbtn;
	
	@FindBy(xpath ="//li[normalize-space()='Exterior Front']")
	WebElement selectExteriorFront;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement EditSavebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[38]/div[9]/div/button[2]")
	WebElement IQdeletebtn;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deleteIQconfirmation;
	
	
	public void ClickContentManagement() {
		ContentManagementdd.click();
	}

	public void SelectInspectionQuestion() {
		SelectInspection.click();
	}
	
	public void AddQuestion()
	{
		addquestionbtn.click();
	}
	
	public void ClickCategory()
	{
		selectcattxt.click();
	}
	
	public void SelectCategory()
	{
		selectcat.click();
	}
	
	public void EnterQuestion()
	{
		questiontxt.sendKeys("Do you have hypothecation?");
	}
	
	public void EnterAnswer1()
	{
		answer1txt.sendKeys("Yes");
	}
	
	public void ClickOnCreate()
	{
		createbtn.click();
	}
	
	public void SelectCategoryEng()
	{
		selectEngine.click();
	}
	
	public void ClickOnMultiAns()
	{
		multiansbtn.click();
	}
	
	public void ClickonAddAns()
	{
		addansbtn.click();
	}
	
	public void EnterQuestionMul()
	{
		questiontxt.sendKeys("engine noise problem");
	}
	
	public void EnterAnswer2()
	{
		answer2txt.sendKeys("No");
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
	
	public void ClickEditButton()
	{
		IQeditbtn.click();
	}
	
	public void UpdateCategory()
	{
	    selectExteriorFront.click();
	}
	
	public void UpdateQuestion()
	{
		questiontxt.sendKeys(Keys.CONTROL + "a");
		questiontxt.sendKeys(Keys.DELETE);
		questiontxt.sendKeys("Have you exterior front?");
	}
	
	public void UpdateAnswer1()
	{
		Updateanswer1txt.sendKeys(Keys.CONTROL + "a");
		Updateanswer1txt.sendKeys(Keys.DELETE);
		Updateanswer1txt.sendKeys("No");
	}
	
	public void EditSaveBTN()
	{
		EditSavebtn.click();
	}
	
	public void DeleteIQ()
	{
		IQdeletebtn.click();
	}

	public void ConformDeleteIQ()
	{
		deleteIQconfirmation.click();
	}


}
