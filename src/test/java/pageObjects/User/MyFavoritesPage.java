package pageObjects.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.Admin.CarsManagement.BasePage;

public class MyFavoritesPage extends BasePage {
	
	public MyFavoritesPage(WebDriver driver) {
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
	
	@FindBy(xpath= "//*[@id=\"root\"]/div/div[1]/div[1]/header/div/div/div[4]/button[1]/svg")
	WebElement BuyCar;

	@FindBy(xpath= "//*[@id=\"buy-car-menu\"]/div[3]/ul/li[1]/p")
	  WebElement BuyUsedCars;
	
	@FindBy(xpath= "/html/body/div[1]/div/div[4]/div[1]/div/div/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/button[1]/svg/path")
	WebElement Favoritebtn;
	
	@FindBy(xpath= "/html/body/div[1]/div/div[4]/div[1]/div/div/div/div[1]/div/nav/ol/li[1]/span")
	WebElement Homebtn;
	
	@FindBy(xpath= "/html/body/div[1]/div/div[1]/div[1]/header/div/div/div[4]/button[6]/span[1]/svg")
	WebElement homefavbtn;
	
	@FindBy(xpath= "/html/body/div[1]/div/div[4]/div[1]/div/div/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div")
	WebElement clkcar;
	
	@FindBy(xpath ="/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div[1]/div[1]/div/h6")
	WebElement favcarnam1;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div[1]/div/div[2]/h6")
	WebElement favcarnam2;
	
	
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



	public void clickBuyCar() {
		 BuyCar.click();

	}
	public void clickBuyUsedCar() {
		BuyUsedCars.click();
	}
	
	public void ClickonFav()
	{
		clkcar.click();
		Favoritebtn.click();
	}
	
	public String FavoritesCarName1()
	{
		return favcarnam1.getText();
	}
	
	public void ClickonHome()
	{
		Homebtn.click();
	}
	
	public void ClickonHomeFavbtn()
	{
		homefavbtn.click();
	}
	
	public String FavoritesCarName2()
	{
		return favcarnam2.getText();
	}
	
	public void verfiyCarInFavorites()
	{
		String carName1 = FavoritesCarName1();
		String carName2 = FavoritesCarName2();
		
		if(carName1==carName2)
		{
			Assert.assertTrue(true, "The car is in the favorites list.");
		}
		else
		{
			Assert.fail("The car is not in the favorites list.");
		}
	}

}
