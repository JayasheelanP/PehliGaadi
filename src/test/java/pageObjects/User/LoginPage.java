package pageObjects.User;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Admin.CarsManagement.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath= "//*[@id=\"root\"]/div/div[1]/div[1]/header/div/div/div[5]/button")
	 WebElement ClkLogin;
	 
	 @FindBy(xpath= "//*[@id=\"outlined-adornment-weight\"]")
	 WebElement EnterPhoneNumber;
	 
	 @FindBy(xpath= "/html/body/div[3]/div[3]/div/div/div/div[2]/div/div/div/div[5]/div/button")
	 WebElement ClickLogin;
	 
	 
	 @FindBy(xpath= "//*[@id=\"otp-input-0\"]")
	 WebElement EnterOTP;

	 @FindBy(xpath= "/html/body/div[3]/div[3]/div/div/div/div[2]/div/div/div/div[5]/div/button")
	 WebElement ClickVerify;

	 @FindBy(xpath= "/html/body/div[4]/div[3]/div/div/div/div[2]/div/div/div/div[5]/div")
	   WebElement LoginButton;

	 @FindBy(css= "body > div > div.mainLoginContent > div > div > div.col-md-5.col-lg-4.col-12 > div > div:nth-child(2) > form > div:nth-child(3) > div > div > input")
	   WebElement BtnLogin;



	@FindBy(xpath= "/html/body/div[1]/div/div[1]/div[1]/header/div/div/div[4]/button[1]")
	WebElement BuyCar;

	@FindBy(xpath= "/html/body/div[4]/div[3]/ul/li[1]/p")
	  WebElement BuyUsedCars;

	@FindBy(xpath= "/html/body/div[1]/div/div[4]/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div/div[3]/div/div[3]/button/svg")
	WebElement ClickFvt;

	@FindBy(xpath= "//*[@id=\"root\"]/div/div[1]/header/div/div/div[4]/button[6]/span[1]/svg")
	WebElement ClickLandingPageFvt;

	@FindBy(xpath= "/html/body/div[4]/div[3]/div/div/div/div[1]/div/div[1]/img")
	WebElement ClickCar;

	@FindBy(xpath= "//*[@id=\"root\"]/div/div[4]/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/div[4]/div/button")
	WebElement ClickCheckNow;


	public void clkLogin (){
		ClkLogin.click();

	  }


	 public void setMobileNumber(String uname) {
		 EnterPhoneNumber.sendKeys(uname);

	   }
	 
	 public void ClickLogin(){
			ClickLogin.click();

		  }

	 public void setOTP(String otp) {
		 EnterOTP.sendKeys(otp);
		 
		
	     
	     // Find all OTP input fields
	     java.util.List<WebElement> otpFields = driver.findElements(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/div/div/div/div[3]/div"));

	    
	     if (otpFields.size() != otp.length()) {
	         
	         return;
	     }

	     //loop to iterate over each digit and input box
	     for (int i = 0; i < otp.length(); i++) {
	         otpFields.get(i).sendKeys(String.valueOf(otp.charAt(i)));
	     }

	     System.out.println("OTP entered successfully!");

	 
	}


	   

	//public void setPassword(String pwd) {
	// password.sendKeys(pwd);
	//  
	//}
	 public void clickVerify() {
		 ClickVerify.click();
	}
	 
	 public void clickBuyCar() {
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(BuyCar)).click();
		

	}
	public void clickBuyUsedCar() {
		BuyUsedCars.click();

	}
	public void scrollToButtonsAndClick() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("scroll(0, 200)");
	    
	}


	public void clickSubmit() {
	BtnLogin.click();


	}
	public void clkFvt (){
		ClickFvt.click();

	  }

	public void clkLandingFvt(){
		ClickLandingPageFvt.click();

	  }
	public void clkCar(){
		ClickCar.click();

	  }

	public void clkCheckNow (){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("scroll(0, 200)");
		 ClickCheckNow.click();

	  }




	//
	//public void clickLogout()
	//{
//		lnkLogout.click();
	//}
	//}

}
