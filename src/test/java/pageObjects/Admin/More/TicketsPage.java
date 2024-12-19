package pageObjects.Admin.More;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Admin.CarsManagement.BasePage;

public class TicketsPage extends BasePage {
	
	public TicketsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-2 css-1o7apob-MuiGrid-root']//button[@type='button']//*[name()='svg']")
    WebElement More;

    @FindBy(xpath = "//span[normalize-space()='Tickets']")
    WebElement Ticket;

    
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[11]/div/button[1]")
    WebElement AssignTicket;
    
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[1]/div/div[1]/div/div/div")
    WebElement AssignAssistant;

    
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[2]/button[2]")
    WebElement Save;
    
    @FindBy(xpath = "/html/body/div[6]/div[3]/ul/li[3]")
    WebElement SelectIndex;
    
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/div[11]/div/button[2]")
    WebElement History;
    
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button")
    WebElement Close;


    public void ClkTicket() {
    	Ticket.click();
    }

    public void ClkMoreMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(More)).click();
    }
    
    public void scrollToButtonsAndClick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 400)");
        
	}
	public void scrollLeft(WebDriver driver) {
	       WebElement scrollableContainer = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[3]"));//Add scrollbar webelement
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 500;", scrollableContainer);
//			  WebElement AssignElement = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[10]/div[11]/div/button[1]"));
//			  JavascriptExecutor js = (JavascriptExecutor) driver;
//	          js.executeScript("arguments[0].scrollLeft = arguments[1];", scrollableContainer, AssignElement.getLocation().getX());
//	          js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});",AssignElement);
//	         AssignElement.click();
	           
	}
	
	public void ClkAssign() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(AssignTicket)).click();
    }
	public void Assign() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(AssignAssistant)).click();
    }
    	
    
//	public void selectAssistantByIndex(int index) {
//	      Select select = new Select(AssignAssistant);
//	      select.selectByIndex(index);
	   
public void Select() {
	SelectIndex.click();
}
	public void ClkSave() {
		Save.click();
    }
	public void History() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(History)).click();
    }
	public void ClkClose() {
		Close.click();
    }

}
