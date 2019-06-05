package Pages.AppleMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MacBookProTradeIn extends page{

	 
	public static WebElement MacBook15inchSilverSelectionIcon()
	{
		return driver.findElement(By.xpath("//label[text() = 'colorOptionGridGroup_MV922B/A']/@for)"));
				 
	}
	 
	public static WebElement MacBook15inchSilverSelectButton()
	{
		return driver.findElement(By.xpath("//div[@class='as-bundleselection-modelvariationsbox row']/div[1]/div[1]//button"));
				 }


	
}
