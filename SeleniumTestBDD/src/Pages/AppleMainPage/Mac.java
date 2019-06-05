package Pages.AppleMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mac extends page {

	 

	public static WebElement MacBookProElement() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//span[text()='MacBook Pro']]"));
	}
	
	public static WebElement AccessoriesElement() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//span[text()='Accessories for Mac']]"));
	}
	
}
