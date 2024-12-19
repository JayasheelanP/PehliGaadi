package pageObjects.Admin.UserManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Admin.CarsManagement.BasePage;

public class UsersPage extends BasePage { 
	
	public UsersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-uddlpv-MuiButtonBase-root-MuiIconButton-root']//*[name()='svg']")
	WebElement UserMngnt;
	
	
	@FindBy(xpath = "//span[normalize-space()='Users']")
	WebElement User;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[11]/div/button[1]")
	WebElement EditUser;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/div/input")
			WebElement EditUsername;
		
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div/div/input")
	WebElement EditUserNumber;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[5]/div/div/button[1]")
	WebElement ClkStatus;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[7]/div/div/div/input")
	WebElement Address;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[4]/div/div/div/input")
	WebElement EditRole;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[6]/div/div/button[1]")
	WebElement Verified;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[3]/div/div/div/input")
	WebElement emailtxt;

	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button[2]")
	WebElement ClkSave;
	
	
	
//	Delete User
	
	@FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[10]/div[11]/div/button[2]")
	WebElement DeleteUser;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[2]/button[2]")
     WebElement ClkYes;

	
	
	public void ClkUser() {
		User.click();
	}

	public void ClkUserMng() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(UserMngnt)).click();
	    }
		
	
  public void scrollLeft(WebDriver driver) {
       WebElement scrollableContainer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 300;", scrollableContainer);
		
		  WebElement EditElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[10]/div[11]/div/button[1]"));
		  JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("arguments[0].scrollLeft = arguments[1];", scrollableContainer, EditElement.getLocation().getX());
          js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});",EditElement);
          EditElement.click();
}
		
		
	public void EnterUserName(String Uname) {
		EditUsername.sendKeys(Uname);
		
	}
	public void ClearUserName() {
		EditUsername.clear();
		
	}
	public void EnterUserNumber(String Unumber) {
		EditUserNumber.sendKeys(Unumber);
		
	}
	public void ClearUserNumber() {
		EditUserNumber.clear();
		
	}
	
	public void ClearRole() {
		EditRole.clear();
		
	}
	public void EnterRole(String Role) {
		EditRole.sendKeys(Role);
		
	}
	public void ClkVerified() {
		Verified.click();
	}
	
	public void EnterEmail(String email)
	{
		emailtxt.sendKeys(email);
	}
	
	public void EnterAddress()
	{
		Address.sendKeys();
	}
	
	public void ClkStatus() {
		ClkStatus.click();
	}
	public void ClkSave() {
		 ClkSave.click();
      
	}
	
      public void ClkEditUser() {
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
//    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.elementToBeClickable(EditUser)).click();
            js.executeScript("arguments[0].scrollIntoView();", EditUser); 
    		
    	

      }
//    To delete User
      
      public void scrollToButtonsAndClick() {
          JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("scroll(0, 400)");
          
  	}
  	
  	public void scrollLeftDelete(WebDriver driver) {
         WebElement scrollableContainer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[3]"));//Add scrollbar webelement
  		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 300;", scrollableContainer);
             //Enter Delete Button Locator
  		  WebElement DeleteElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[10]/div[11]/div/button[2]"));
  		  JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollLeft = arguments[1];", scrollableContainer, DeleteElement.getLocation().getX());
            js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});",DeleteElement);
            DeleteElement.click();
  }
  	
  	public void ClkDelete() {
  		ClkYes.click();
  	}

}
