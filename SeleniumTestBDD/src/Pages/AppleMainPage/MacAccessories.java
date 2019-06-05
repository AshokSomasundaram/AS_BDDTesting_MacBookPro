package Pages.AppleMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MacAccessories extends page {

	 

	public static WebElement ShopPowerCables() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("div[@class='pd-billboard-info']//a[@href='/uk/shop/mac/mac-accessories/power-cables']"));
	}
	
	public static WebElement usbadapterselection() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//span[text()='USB-C to USB Adapter']]"));
	}
	
	public static WebElement AddToBagofUsbAdapter()
	{
		return driver.findElement(By.xpath("//span[text()='Add to Bag']]"));
	
	}
}
