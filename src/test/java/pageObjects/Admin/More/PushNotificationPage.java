package pageObjects.Admin.More;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Admin.CarsManagement.BasePage;

public class PushNotificationPage extends BasePage {
	
	public PushNotificationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-2 css-o0rlmm']//button[@type='button']//*[name()='svg']")
    WebElement More;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div/div/div[5]/div/div[2]/div/div/div/div[5]/div/span")
    WebElement PushNotification;

    
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div[1]/button")
    WebElement CreateNotification;
    
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/div/input")
    WebElement EnterTitle;

    
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[4]/div/div/textarea[1]")
    WebElement EnterBody;
    
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/label[1]/span[1]/input")
    WebElement SelectTime;
    
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[4]/div/div/input")
    WebElement SelectType;
    
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[5]/div/div/input")
    WebElement NotificationDuration;
  
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[6]/ul/div[1]/label/span[1]/input")
    WebElement SelectAll;
    
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button[2]")
    WebElement SendNotification;


    public void ClkPushNotification() {
    	PushNotification.click();
    }

    public void ClkMoreMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(More)).click();
    }
    
  
	
	public void ClkCreateNotification() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CreateNotification)).click();
    }
	public void EnterTitle(String Title) {
		EnterTitle.sendKeys(Title);
    }
	public void EnterBody(String Body) {
		EnterBody.sendKeys(Body);
    }
	public void ClkTime() {
		SelectTime.click();
    }
	public void SelectType(String Type) {
		SelectType.sendKeys(Type);
    }
	public void NDuration(String dur) {
		NotificationDuration.sendKeys(dur);
    }
	public void ClkSelectAll() {
		SelectAll.click();
    }
	public void ClkNotification() {
		SendNotification.click();
    }

}
