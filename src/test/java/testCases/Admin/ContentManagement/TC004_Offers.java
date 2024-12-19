package testCases.Admin.ContentManagement;

import org.testng.annotations.Test;

import pageObjects.Admin.ContentManagement.OffersPage;
import testBase.BaseClass;

public class TC004_Offers extends BaseClass {
	
	@Test
	public void verify_ContentManagement_Offers() throws InterruptedException
	{
		OffersPage op = new OffersPage(driver);
		
		//Add Offer
		op.ClickContentManagement();
		Thread.sleep(3000);
		op.SelectOffers();
		Thread.sleep(3000);
		op.AddOffers();
		Thread.sleep(3000);
		op.EnterOfferName();
		Thread.sleep(3000);
		op.OfferStatus();
		Thread.sleep(3000);
		op.EnterOfferDes();
		Thread.sleep(3000);
		op.OfferCreatebtn();
		Thread.sleep(3000);
		
		//Update Offer
		op.ClickEditButton();
		Thread.sleep(3000);
		op.UpdateOfferName();
		Thread.sleep(3000);
		op.OfferStatus();
		Thread.sleep(3000);
		op.UpdateUpdateOfferDes();
		Thread.sleep(3000);
		op.OfferUpdatebtn();
		Thread.sleep(3000);
		
		//Delete
		op.DeleteOffer();
		Thread.sleep(3000);
		op.ConformDeleteOffer();
		Thread.sleep(3000);
		Thread.sleep(3000);
	}

}
