package Pages.AppleMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppleMainPage extends page{

	public static void NavigateUrl() 
	{
		String url="https://www.apple.com/uk/";
		driver.navigate().to(url);
		}

	public static WebElement MacBookhref() {
		return driver.findElement(By.xpath("//a[@href='/uk/mac/']"));
	}
}
 