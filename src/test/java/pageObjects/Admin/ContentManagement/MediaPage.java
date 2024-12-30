package pageObjects.Admin.ContentManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Admin.CarsManagement.BasePage;

public class MediaPage extends BasePage {

	public MediaPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-l3s2qg']//div[4]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement ContentManagementdd;

	@FindBy(xpath = "//span[normalize-space()='Media']")
	WebElement selectmedia;

	@FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[1]/button")
	WebElement addmediabtn;

	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement pagenametxt;

	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/input")
	WebElement containernametxt;

	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[3]/input")
	WebElement fileupload;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savebtn;
	
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[9]/div/button[1]")
	WebElement mediaeditbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement editpagenametxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/input")
	WebElement editcotinernametxt;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement Editsavebtn;
	
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[9]/div/button[2]")
	WebElement mediadeletebtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement deleteconformbtn;

	public void ClickContentManagement() {
		ContentManagementdd.click();
	}

	public void SelectMedia() {
		selectmedia.click();
	}

	public void AddMedia() {
		addmediabtn.click();
	}

	public void EnterPageName() {
		pagenametxt.sendKeys("Hello");
	}

	public void EnterContainerName() {
		containernametxt.sendKeys("Test");
	}

	public void FileUpload() {
		fileupload.sendKeys("C:\\Users\\jayasheelanp\\eclipse-workspace\\PehliGaadi\\src\\test\\resources\\Files\\HIGHLANDER.jpg");
				
	}

	public void ClickonSave() {
		savebtn.click();
	}
	
	public void ClickonEdit() {
		mediaeditbtn.click();
	}
	
	public void UpdatePageName() {
		editpagenametxt.sendKeys(Keys.CONTROL + "a");
		editpagenametxt.sendKeys(Keys.DELETE);
		editpagenametxt.sendKeys("Hello");
	}
	
	public void UpdateContainerName() {
		editcotinernametxt.sendKeys(Keys.CONTROL + "a");
		editcotinernametxt.sendKeys(Keys.DELETE);
		editcotinernametxt.sendKeys("World");
	}
	
	public void ClickonEditSave() {
		Editsavebtn.click();
	}
	
	public void ClickonDelete() {
		Editsavebtn.click();
	}
	
	public void ClickonDeleteConf() {
		Editsavebtn.click();
	}

}
