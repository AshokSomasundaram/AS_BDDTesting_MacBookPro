package Pages.AppleMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToBagPage extends page {

	  
	public static WebElement usbAdapterItemCheck() {
		return driver.findElement(By.xpath("//a[text()='USB-C to USB Adapter']]"));
	}
	
	public static WebElement MacBookProItemCheck() {
		return driver.findElement(By.xpath("//a[text()='15-inch MacBook Pro - Silver']]"));
	}
	
	public static WebElement MacBookSummaryAmtValue() {
	return driver.findElement(By.xpath("//div[@class='rs-summary']//div[@class='rs-summary-value']"));
			}
	
	public static WebElement AdapterSummaryAmtValue() {
		return driver.findElement(By.xpath("//div[@class='rs-iteminfo-details']//div[@class='rs-iteminfo-price']"));
				}
}
