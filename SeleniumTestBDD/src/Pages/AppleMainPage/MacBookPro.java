package Pages.AppleMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MacBookPro extends page{

	public static WebElement MacBook15inchShopNow()
	{
		return driver.findElement(By.xpath("//a[@href='/uk/shop/goto/macbook_pro/15_inch']"));
		
	}
	
	 
}
