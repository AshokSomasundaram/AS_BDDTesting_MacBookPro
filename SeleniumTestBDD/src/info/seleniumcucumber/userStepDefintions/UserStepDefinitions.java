package info.seleniumcucumber.userStepDefintions;
import org.openqa.selenium.WebDriver;

import Pages.AppleMainPage.AddToBagPage;
import Pages.AppleMainPage.AppleMainPage;
import Pages.AppleMainPage.CheckOutPage;
import Pages.AppleMainPage.Mac;
import Pages.AppleMainPage.MacAccessories;
import Pages.AppleMainPage.MacBookPro;
import Pages.AppleMainPage.MacBookProTradeIn;
import Pages.AppleMainPage.MacBookProTradeInCustomise15inch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
 
 

public class UserStepDefinitions {
	
	public static WebDriver driver;
	
	@Given("Given I go to the url")
	public void urlNavigation() {
	
		AppleMainPage.NavigateUrl();  
		
	}
	
	@When("When I choose a MacBook Pro with the following features and accessories")
	public void MacBookProSpecificationSelections() {
		 
		AppleMainPage.MacBookhref().click();
		Mac.MacBookProElement().click();
		MacBookPro.MacBook15inchShopNow().click(); //Screen selection//
		MacBookProTradeIn.MacBook15inchSilverSelectionIcon().click(); //Colour selection//
		MacBookProTradeIn.MacBook15inchSilverSelectButton().click(); 
		MacBookProTradeInCustomise15inch.MacBookProProcessor2_9Ghz().click(); //Processor selection//
		MacBookProTradeInCustomise15inch.MacBookProMemory16GB().click(); //Memory selection//
		MacBookProTradeInCustomise15inch.MacBookProSoftwareLogicProX().click(); //Software selection//
			
		
	}
	
	
	@Then("I can place an order for it")
	public void MacBookProOrder() {
		MacBookProTradeInCustomise15inch.AddToBag().click();
		AppleMainPage.MacBookhref().click();
		Mac.AccessoriesElement().click();
		MacAccessories.ShopPowerCables().click(); 
		MacAccessories.usbadapterselection().click(); //USB adapter selection//
		MacAccessories.AddToBagofUsbAdapter().click();
		 
	}
	
	//Scenario: The correct price and VAT are displayed for a MacBook 15” with accessories
	
	@Given("I choose the following items")
	    public void selectionCheck()
	    {
		String MacBookProItemCheck=AddToBagPage.MacBookProItemCheck().getText();
		String usbAdapterItemCheck=AddToBagPage.usbAdapterItemCheck().getText();
		String AdapterSummaryAmtValue=AddToBagPage.AdapterSummaryAmtValue().getText();
		String MacBookSummaryAmtValue=AddToBagPage.MacBookSummaryAmtValue().getText();
		
		//Validation can be done here with the values
		
		
	    }
	    
	    

	@When("I proceed to the checkout")
	public void checkout() {
		CheckOutPage.checkoutbutton().click();
		CheckOutPage.ContinueAsGuest().click();
		}
	  

	
	@Then("a total price of 3187.99 will be displayed")
	public void SummaryAmtcheckout() {
		CheckOutPage.ShowOrderSummary().click();
		//Assertion will be done verifying the total price
		String TotalPrice=CheckOutPage.TotalPrice().getText();
		//Assertion will be done verifying the VAT price
		String VATPrice=CheckOutPage.VATPrice().getText();
		}
	   
	
}