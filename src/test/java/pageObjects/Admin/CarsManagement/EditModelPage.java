package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditModelPage extends BasePage {
	
	public EditModelPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
WebElement CarsManagementdd;

@FindBy(xpath="//span[normalize-space()='Models']")
WebElement modelsop;

@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[3]/div/div[2]/div")
WebElement pagesize;

@FindBy(xpath="//li[normalize-space()='100']")
WebElement pagesize100;

@FindBy(xpath="//div[@class='MuiDataGrid-row MuiDataGrid-row--lastVisible']//button[@type='button'][normalize-space()='Edit']")
WebElement editbtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
WebElement editmodelnametxt;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/div")
WebElement brandnamedd;

@FindBy(xpath="/html/body/div[5]/div[3]/ul/li[2]")
WebElement select_brand_namedd;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement editsavebtn;

@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[39]/div[9]/div/button[2]")
WebElement modeldeletebtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement deletemodelconfirmation;

public void ClickCarsManagemet()
{
	CarsManagementdd.click();
}

public void SelectModels()
{
	modelsop.click();
}

public void ClickPageSize() throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	js.executeScript("return window.pageYoffset;");
	Thread.sleep(5000);
	pagesize.click();
	Thread.sleep(5000);
}

public void SetPageSize()
{
	pagesize100.click();
}

public void ClickEditButton()
{
	editbtn.click();
}

public void EnterModelName() throws InterruptedException
{
	//editmodelnametxt.clear();
	//editmodelnametxt.click();
	editmodelnametxt.sendKeys(Keys.CONTROL + "a");
	editmodelnametxt.sendKeys(Keys.DELETE);
	editmodelnametxt.sendKeys("Lancer GT");
	brandnamedd.click();
	select_brand_namedd.click();
}

public void SaveEditModel() throws InterruptedException
{
	editsavebtn.click();
	Thread.sleep(5000);
}

public void DeleteModel()
{
	modeldeletebtn.click();
}

public void ConformDeleteModel()
{
	deletemodelconfirmation.click();
}

}