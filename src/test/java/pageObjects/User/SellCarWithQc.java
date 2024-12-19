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

public class SellCarWithQc extends BasePage {
	
	public SellCarWithQc(WebDriver driver) {
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
	 
	 @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/header/div/div/div[4]/button[2]")
		WebElement SellCar;

		@FindBy(xpath = "/html/body/div[4]/div[3]/ul/li/p")
		WebElement SellMyCar;
		
//		@FindBy(xpath = "//*[@id=\"root\"]/div/div[4]/div[1]/div[1]/div/div/div/div[2]/div/button/p")
//		WebElement SellCarButton;
//		
		@FindBy(xpath = "/html/body/div[1]/div/div[4]/div[1]/div[1]/div[1]/div/div/div/div/input")
		WebElement EnterCarNumber;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div/div[4]/div[1]/div[1]/div[2]/div/button")
		WebElement SellCarButton;
		
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div/div[2]/p")
		WebElement WithQC;
		

		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/span")
		WebElement ClkBrand;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/button")
		WebElement ClkPeriod;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/button")
		WebElement ClkModel;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/button")
		WebElement ClkVariant;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/img")
		WebElement ClkFuelType;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div[4]/div[1]/div/div/img")
		WebElement ClkTransmission;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/button")
		WebElement ClkOwnerShip;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/button")
		WebElement ClkOdometer;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div")
		WebElement ClkLocation;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div[1]/div[1]/div/div[4]/div[1]/span/input")
		WebElement ClkCheckBox;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div[1]/div[1]/div/div[5]/button")
		WebElement ClkContinue;
		
		@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/button[4]")
		WebElement ClkDate;
		
		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div[4]/span[13]")// //span[@aria-label='12 hours']
		WebElement ClkTime;
		
		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div[2]/div/div/div/div/div[2]/svg/path")// //*[name()='path' and contains(@d,'M12 8c-2.2')]
		WebElement ClkMapLocation;
		
		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div[3]/div/button")// //button[normalize-space()='Book Now']
		WebElement Book;
		
		
		

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
		 java.util.List<WebElement> otpFields = driver.findElements(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/div/div/div/div[3]/div"));
           if (otpFields.size() != otp.length()) {
	         System.out.println("Mismatch between OTP digits and input fields!");
	         return;
	     }

	     //loop to iterate over each digit and input box
	     for (int i = 0; i < otp.length(); i++) {
	         otpFields.get(i).sendKeys(String.valueOf(otp.charAt(i)));
	     }

	     System.out.println("OTP entered successfully!");
         }

	 public void clickVerify() {
		 ClickVerify.click();
	}
	 
  public void clickSubmit() {
	BtnLogin.click();
   }

  public void clickSellCar() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(SellCar)).click();
		
	}

	public void clickSellMyCar() {
		SellMyCar.click();
	}
		public void clickSellCarButton() {
			SellCarButton.click();

		}
		public void EnterCarNumber(String CarNumber) {
			EnterCarNumber.sendKeys(CarNumber);
		}
			
		public void scrollToButtonsAndClick() {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("scroll(0, 400)");
		    
		}
		public void clickWithQC() {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.elementToBeClickable(WithQC)).click();
			

		}
		public void clickBrand() {
			ClkBrand.click();

		}
		public void clickPeriod() {
			ClkPeriod.click();

		}
		public void clickModel() {
			ClkModel.click();

		}
		public void clickVariant() {
			ClkVariant.click();

		}
		public void clickFuel() {
			ClkFuelType.click();

		}
		public void clickTransmission() {
			ClkTransmission.click();

		}
		public void clickOwnership() {
			ClkOwnerShip.click();

		}
		public void clickOdometer() {
			ClkOdometer.click();

		}
		public void clickLocation() {
			ClkLocation.click();

		}
		public void ClkCheckBox() {
			ClkCheckBox.click();

		}
		public void ClkContinueButton() {
			ClkContinue.click();

		}
		public void ClkDate() {
			ClkDate.click();

		}
		public void ClkTime() {
			ClkTime.click();

		}
		public void ClkMapLocation() {
			ClkMapLocation.click();

		}
		public void ClkBook() {
			Book.click();

		}

}
