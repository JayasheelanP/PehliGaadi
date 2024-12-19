package pageObjects.Admin.ContentManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Admin.CarsManagement.BasePage;

public class BlogCategoriesPage extends BasePage {
	
	public BlogCategoriesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-gxg9xr-MuiPaper-root-MuiCard-root']//div[4]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement ContentManagementdd;
	
	@FindBy(xpath = "//span[normalize-space()='Blog Categories']")
	WebElement Blogcategories;
	
	@FindBy(xpath ="//button[normalize-space()='Add Blog Category']")
	WebElement addBlogcategorybtn;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement Blogcategorynametxt;
	
	@FindBy(xpath ="//div[normalize-space()='Inactive']")
	WebElement blogcatinactive;
	
	@FindBy(xpath ="//li[normalize-space()='Active']")
	WebElement blogcatactive;
	
	@FindBy(xpath ="/html/body/div[5]/div[3]/div/div[2]/button[2]")
	WebElement blogcatsavebtn;
	
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[5]/div[8]/div/button[1]")
	WebElement editBlogcategories;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/div/input")
	WebElement updateBlogcategorynametxt;
	
	@FindBy(xpath ="//li[normalize-space()='Active']")
	WebElement updateblogcatactive;
	
	@FindBy(xpath ="//button[normalize-space()='Save']")
	WebElement updateblogcatsave;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[5]/div[8]/div/button[2]")
	WebElement blogCatdeletebtn;

	@FindBy(xpath="/html/body/div[5]/div[3]/div/div[2]/button[2]")
	WebElement blogdeleteCatconfirmation;
	

	public void ClickContentManagement() {
		ContentManagementdd.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 400)");
	}

	public void SelectCategories() {
		Blogcategories.click();
	}
	
	public void AddBlogCategory()
	{
		addBlogcategorybtn.click();
	}
	
	public void EnterBlogCategoryName()
	{
		Blogcategorynametxt.sendKeys("Seller");
	}
	
	public void ClickonBlogcatActive()
	{
		blogcatinactive.click();
		blogcatactive.click();
	}
	
	public void ClickonBlogSave()
	{
		blogcatsavebtn.click();
	}
	
	public void ClickEditButton() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("return window.pageYoffset;");
		Thread.sleep(3000);
		editBlogcategories.click();
	}
	
	public void UpdateBlogCatName()
	{
		updateBlogcategorynametxt.sendKeys(Keys.CONTROL + "a");
		updateBlogcategorynametxt.sendKeys(Keys.DELETE);
		updateBlogcategorynametxt.sendKeys("Car");
	}
	
	public void ClickonActive()
	{
		blogcatinactive.click();
		updateblogcatactive.click();
	}
	
	
	public void BlogCatSavebtn()
	{
		updateblogcatsave.click();
	}
	
	public void Deletecat() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		blogCatdeletebtn.click();
	}

	public void ConformDeleteCat()
	{
		blogdeleteCatconfirmation.click();
	}

}
