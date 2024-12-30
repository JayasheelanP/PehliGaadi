package pageObjects.Admin.More;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Admin.CarsManagement.BasePage;

public class SurveyQuestionPage extends BasePage {
	
	public SurveyQuestionPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-2 css-o0rlmm']//button[@type='button']//*[name()='svg']")
	WebElement Moredd;
	
	@FindBy(xpath = "//span[normalize-space()='Survey Question']")
	WebElement SelectSurveyQuestion;
	
	@FindBy(xpath ="//button[normalize-space()='Add Survey Question']")
	WebElement addSurveyQuestionbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement Surveycattxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/input")
	WebElement SurveyQuestiontxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement SurveyAnswer1txt;
	
	@FindBy(xpath ="//button[normalize-space()='Add Answer']")
	WebElement addanswerbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[4]/div/div/input")
	WebElement SurveyAnswer2txt;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement savesurvey;
	
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[10]/div/button[1]")
	WebElement EditSurveybtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement updateSurveycat;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/input")
	WebElement updateSurveyQuestiontxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement updateSurveyAnswer1txt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[4]/div/div/input")
	WebElement updateSurveyAnswer2txt;
	
	@FindBy(xpath= "/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[3]")
	WebElement scrollableContainer;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement updateSurveySaveBtn;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[10]/div/button[2]")
	WebElement SurveyQuestiondeletebtn;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deleteSurveyQuestionconfirmation;
	
	
	public void ClickonMore() {
		Moredd.click();
	}

	public void SelectCategories() {
		SelectSurveyQuestion.click();
	}
	
	public void AddSurveyQuestion()
	{
		addSurveyQuestionbtn.click();
	}
	
	public void EntersurveyCategory()
	{
		Surveycattxt.sendKeys("Online Survey");
	}
	
	public void EntersurveyQuestion()
	{
		SurveyQuestiontxt.sendKeys("How was the User Experience with Us");
	}
	
	public void EntersurveyAnswer1()
	{
		SurveyAnswer1txt.sendKeys("Good");
	}
	
	public void AddAnswer()
	{
		addanswerbtn.click();
	}
	
	public void EntersurveyAnswer2()
	{
		SurveyAnswer2txt.sendKeys("bad");
	}
	
	public void SurveySave()
	{
		savesurvey.click();
	}
	
	public void EditSurvey(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 400;", scrollableContainer);
		EditSurveybtn.click();
	}
	
	public void UpdateSurveyCatName()
	{
		updateSurveycat.sendKeys(Keys.CONTROL + "a");
		updateSurveycat.sendKeys(Keys.DELETE);
		updateSurveycat.sendKeys("Survey");
	}
	
	public void UpdateQuestion()
	{
		SurveyQuestiontxt.sendKeys(Keys.CONTROL + "a");
		SurveyQuestiontxt.sendKeys(Keys.DELETE);
		SurveyQuestiontxt.sendKeys("How was the User Experience with PehliGaadi");
	}
	
	public void UpdateAnswer1()
	{
		updateSurveyAnswer1txt.sendKeys(Keys.CONTROL + "a");
		updateSurveyAnswer1txt.sendKeys(Keys.DELETE);
		updateSurveyAnswer1txt.sendKeys("Bad");
	}
	
	public void UpdateAnswer2()
	{
		updateSurveyAnswer2txt.sendKeys(Keys.CONTROL + "a");
		updateSurveyAnswer2txt.sendKeys(Keys.DELETE);
		updateSurveyAnswer2txt.sendKeys("Good");
	}
	
	public void UpdateSurveySavebtn()
	{
		updateSurveySaveBtn.click();
	}
	
	public void DeleteSurveyQuestion()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 400;", scrollableContainer);
		SurveyQuestiondeletebtn.click();
	}

	public void ConformDeleteSurveyQuestion()
	{
		deleteSurveyQuestionconfirmation.click();
	}
	
}
