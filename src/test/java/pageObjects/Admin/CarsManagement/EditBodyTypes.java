package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditBodyTypes extends BasePage {
	
	public EditBodyTypes(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
WebElement CarsManagementdd;

@FindBy(xpath="//span[normalize-space()='Body Type']")
WebElement bodytypesbtn;

@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[3]/div/div[2]/div")
WebElement pagesize;

@FindBy(xpath="//li[normalize-space()='100']")
WebElement pagesize100;

@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/div[8]/div/button[1]")
WebElement bodytypeEditbtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div/div/div/input")
WebElement editbodytypenametxt;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement editsavebtn;

@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/div[8]/div/button[2]")
WebElement bodytypedeletebtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement deletbodytypeconfirmation;

public void ClickCarsManagemet()
{
	CarsManagementdd.click();
}

public void SelectBodyType()
{
	bodytypesbtn.click();
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

public void BodyTypeEditButton()
{
	bodytypeEditbtn.click();
}

public void EnterBodyTypeName() throws InterruptedException
{
	//editmodelnametxt.clear();
	//editmodelnametxt.click();
	editbodytypenametxt.sendKeys(Keys.CONTROL + "a");
	editbodytypenametxt.sendKeys(Keys.DELETE);
	editbodytypenametxt.sendKeys("Lancer GT");
}

public void SaveEditBodyType() throws InterruptedException
{
	editsavebtn.click();
	Thread.sleep(5000);
}

public void DeleteBody()
{
	bodytypedeletebtn.click();
}

public void ConformDeleteBody()
{
	deletbodytypeconfirmation.click();
}

}