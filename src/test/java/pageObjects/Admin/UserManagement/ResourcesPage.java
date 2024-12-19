package pageObjects.Admin.UserManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Admin.CarsManagement.BasePage;

public class ResourcesPage extends BasePage {
	
	public ResourcesPage(WebDriver driver) {
		super(driver);
	}
	
//	Add Resource
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-uddlpv-MuiButtonBase-root-MuiIconButton-root']//*[name()='svg']")
	WebElement UserMngnt;
	
	
	@FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/div[4]/div/span")
	WebElement Resource;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[1]/button")
	WebElement AddResource;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
			WebElement EnterResourceName;
		
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement EnterDescription;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/button[1]")
	WebElement ClkStatus;
	
	

	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement ClkSave;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[10]/div/button[1]")
	WebElement EditButton;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
	WebElement EditResourceName;
		
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/button[2]")
	WebElement ClkEditStatus;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement EditDescription;
	

	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement ClkEditSave;
	
	
//	Delete Resource

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[10]/div/button[2]")
	WebElement DeleteButton;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement DeleteResource;
	
	public void ClkResource() {
		Resource.click();
	}

	public void ClkUserMng() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(UserMngnt)).click();
	    }
	
	public void ClkAdd() {
		AddResource.click();
	}
		
	
	public void EnterRName(String Rname) {
		EnterResourceName.sendKeys(Rname);
		
	}
	public void EnterDesctiption(String Descr) {
		EnterDescription.sendKeys(Keys.CONTROL + "a");
		EnterDescription.sendKeys(Keys.DELETE);
		EnterDescription.sendKeys(Descr);
		
	}
	public void ClkStatus() {
		ClkStatus.click();
	}
	public void ClkSave() {
		 ClkSave.click();
	}
	
	//Edit Resource
	public void ClkEdit() {
		EditButton.click();
		}
	
	public void scrollToButtonsAndClick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 400)");
        
	}
	
	
		
		
	public void EditRname(String Rname) {
		
		EditResourceName.sendKeys(Keys.CONTROL + "a");
		EditResourceName.sendKeys(Keys.DELETE);
		EditResourceName.sendKeys(Rname);
		
	}
	
	public void EditDesctiption(String Desc) {
		EditDescription.sendKeys(Keys.CONTROL + "a");
		EditDescription.sendKeys(Keys.DELETE);
	    EditDescription.sendKeys(Desc);
		
	}
	public void ClkEditStatus() {
		ClkEditStatus.click();
	}
	public void ClkEditSave() {
		 ClkEditSave.click();
	}
	
//	Delete Resource

	public void scrollLeft(WebDriver driver) {
	       WebElement scrollableContainer = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[3]"));//Add scrollbar webelement
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 300;", scrollableContainer);
	           
	}
		
		public void ClkDelete() {
			DeleteResource.click();
			 driver.navigate().refresh();
			
		}
		   public void ClkDeleteResource() {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(DeleteButton)).click();
		        
		    }

}
