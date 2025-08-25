package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser()
	{
	

	 //driver=new FirefoxDriver();
		driver=new ChromeDriver();
	 
	 driver.get("https://www.saucedemo.com/v1/");
	 driver.manage().window().maximize();
	// driver.manage().window().minimize();
	 
	}
	@AfterMethod
	public void closeBrowser()
	{
	//	driver.close();
		driver.quit();
	}

}
