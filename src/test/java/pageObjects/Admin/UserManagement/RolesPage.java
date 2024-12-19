package pageObjects.Admin.UserManagement;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Admin.CarsManagement.BasePage;

public class RolesPage extends BasePage {
	
	public RolesPage(WebDriver driver) {
		super(driver);
	}
	
//	Add Roles
	
    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-uddlpv-MuiButtonBase-root-MuiIconButton-root']//*[name()='svg']")
    WebElement UserMngnt;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/span")
    WebElement Roles;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[1]/button")
    WebElement AddRoles;
    
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[1]/div/div[1]/div/div")
    WebElement RoleName;
    
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[1]/div/div[1]/div/div/input")
    WebElement RoleField;
    
    
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[1]/div/div[2]/div/button[1]")
    WebElement Status;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[2]/button[2]")
    WebElement Save;

    
//   EDIT ROLE
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[9]/div[9]/div/button[1]")
	WebElement EditRole;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/div/input")
	WebElement EditRoleName;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement EditSave;
	
	
//	Delete Role
	
	@FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[9]/div[9]/div/button[2]")
	WebElement DeleteButton;
	
	@FindBy(xpath = "/html/body/div[5]/div[3]/div/div[2]/button[2]")
	WebElement DeleteRole;
	

    public void ClkRoles() {
        Roles.click();
    }

    public void ClkUserMng() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(UserMngnt)).click();
    }
    public void ClkAddRole() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(AddRoles)).click();
    }
  
//    public void RoleTextField(String RName) {
//    	JavascriptExecutor js = (JavascriptExecutor) ldriver;
//          js.executeScript("arguments[0].value='" + RName + "';", RoleField);
//    	
//    }
    
    public void ClkRoleName() {
    	RoleName.click();
    }
    public void EnterRole(String RName) {
    	RoleField.sendKeys(RName);
    }
    public void ClkStatus() {
        Status.click();
    }
    public void ClkSave() {
        Save.click();
    }
    
//    Edit Role Methods
    
    public void scrollToButtonsAndClick() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 350)");
		
	}
	
	public void ClkEditRole() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(EditRole)).click();
		
	}
	
	public void ClkEditRoleName() {
		EditRoleName.click();
		
	}
	public void ClearEditRoleName() {
		
		EditRoleName.sendKeys(Keys.CONTROL + "a");
		EditRoleName.sendKeys(Keys.DELETE);
	}
	
	public void EnterRoleName(String Rname) throws InterruptedException {
		EditRoleName.sendKeys(Rname);
		Thread.sleep(3000);	
	}
	
	public void ClkSaveButton() {
		EditSave.click();
		
	}

//Delete Role Methods
	
	public void ClkDeleteButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(DeleteButton)).click();
		
	}
	
	public void ClkDeleteRoleName() {
		DeleteRole.click();
	
	}

}
