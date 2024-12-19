package pageObjects.Admin.CarsManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditVariantsPage extends BasePage {
	
	public EditVariantsPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]//*[name()='svg']")
WebElement CarsManagementdd;

@FindBy(xpath="//span[normalize-space()='Variants']")
WebElement Variantsbtn;

@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[3]/div/div[2]/div")
WebElement pagesize;

@FindBy(xpath="//li[normalize-space()='100']")
WebElement pagesize100;

@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[51]/div[9]/div/button[1]")
WebElement varientEditbtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
WebElement editVarientnametxt;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/div")
WebElement varientnamedd;

@FindBy(xpath="/html/body/div[5]/div[3]/ul/li[5]")
WebElement select_varient_namedd;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement editsavebtn;

@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[51]/div[9]/div/button[2]")
WebElement varientdeletebtn;

@FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/button[2]")
WebElement deletevarientconfirmation;

public void ClickCarsManagemet()
{
	CarsManagementdd.click();
}

public void SelectVarients()
{
	Variantsbtn.click();
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

public void VarientEditButton()
{
	varientEditbtn.click();
}

public void EnterVarientName() throws InterruptedException
{
	//editmodelnametxt.clear();
	//editmodelnametxt.click();
	editVarientnametxt.sendKeys(Keys.CONTROL + "a");
	editVarientnametxt.sendKeys(Keys.DELETE);
	editVarientnametxt.sendKeys("Lancer GT");
	varientnamedd.click();
	select_varient_namedd.click();
}

public void SaveEditVarient() throws InterruptedException
{
	editsavebtn.click();
	Thread.sleep(5000);
}

public void DeleteVarient()
{
	varientdeletebtn.click();
}

public void ConformDeleteVarient()
{
	deletevarientconfirmation.click();
}


}