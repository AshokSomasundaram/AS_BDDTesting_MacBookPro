package Pages.AppleMainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class page {
	
	public static WebDriver driver;
	
	public void getDriver()
	{
		driver=new FirefoxDriver();
	}

}
