package pageObjects.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Admin.CarsManagement.BasePage;

public class Register extends BasePage {
	
	public Register(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath= "//*[@id=\"root\"]/div/div[1]/div[1]/header/div/div/div[5]/button")
	 WebElement ClkLogin;
	 
	 @FindBy(xpath= "//*[@id=\"outlined-adornment-weight\"]")
	 WebElement EnterPhoneNumber;
	 
	 @FindBy(xpath= "//*[@id=\"otp-input-0\"]")
	 WebElement EnterOTP;

	 
	 @FindBy(xpath= "/html/body/div[3]/div[3]/div/div/div/div[2]/div/div/div/div[5]/div/button")
	 WebElement ClickVerify;

	 
	 @FindBy(xpath= "/html/body/div[3]/div[3]/div/div/div/div[2]/div/div/div/div[5]/div/button")
	 WebElement ClickLogin;
	 
	 @FindBy(xpath= "/html/body/div[3]/div[3]/div/div/div/div[2]/div/div/div[2]/div/div/div/input")
	 WebElement EnterName;
	 
	 @FindBy(xpath= "/html/body/div[3]/div[3]/div/div/div/div[2]/div/div/div[3]/div/div/div/input")
	 WebElement EnterEmail;
	 
	 @FindBy(xpath= "/html/body/div[3]/div[3]/div/div/div/div[2]/div/div/div[4]/div/button")
	 WebElement Register;
	 


public void EnterUsername(String Uname) {
	EnterName.sendKeys(Uname);
}

public void Email(String mail) {
	EnterEmail.sendKeys(mail);
}
public void ClickRegister() {
	EnterEmail.click();
}
public void clkLogin (){
	ClkLogin.click();

 }


public void setMobileNumber(String uname) {
	 EnterPhoneNumber.sendKeys(uname);

  }

public void ClickLogin(){
		ClickLogin.click();

	  }
public void clickVerify() {
	 ClickVerify.click();
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

}
