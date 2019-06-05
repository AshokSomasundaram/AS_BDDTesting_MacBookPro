package Pages.AppleMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends page {

	public static WebElement ContinueAsGuest() {
		return driver.findElement(By.xpath("//button[text()='Check Out']]"));
	}
	
	public static WebElement checkoutbutton() {
		return driver.findElement(By.xpath("//button/span[text()='Continue as Guest']]"));
	}
	
	public static WebElement ShowOrderSummary()
	{
		return driver.findElement(By.xpath("//span[text()='Show Order Summary:']]"));
	}
	
	public static WebElement TotalPrice()
	{
		return driver.findElement(By.xpath("//div[@class='rs-companionbar-ordertotal']/ul/li[4]/span[2]"));
	}
	
	public static WebElement VATPrice()
	{
		return driver.findElement(By.xpath("//div[@class='rs-companionbar-ordertotal']/ul/li[5][text()='Includes VAT']"));
	}
}
