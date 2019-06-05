package Pages.AppleMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 

public class MacBookProTradeInCustomise15inch extends page{

	public static WebElement MacBookProProcessor2_9Ghz()
	{
		return driver.findElement(By.xpath("//div[[@class='as-configuration-category as-configuration-categoryhardware']/div[1]/div[1]/div[1]/div//div/div[1]/div/div//div[contains(text(),'2.6GHz 6-core 9th-generation Intel Core i7 processor, Turbo Boost up to 4.5GHz')]"));
	
	}
	
	public static WebElement MacBookProMemory16GB()
	{
		return driver.findElement(By.xpath("//div[[@class='as-configuration-category as-configuration-categoryhardware']//div[contains(text(),'16GB']"));
	
	}
	
	public static WebElement MacBookProSoftwareLogicProX()
	{
		return driver.findElement(By.xpath("//div[[@class='as-configuration-category as-configuration-categorypresoftware']//div[contains(text(),'Logic Pro X']"));
	
	}
	
	
	public static WebElement AddToBag()
	{
		return driver.findElement(By.xpath("//div[[@id='actiontray']//button[name='add-to-cart']"));
	
	}
	
}
