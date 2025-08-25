package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Executor extends Base {
	public void verifyJavascriptExecutor() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessageButton);
		System.out.println(js.executeScript("return document.body.scrollHeight"));//Returns the total height of application in pixel
		js.executeScript("window.scrollBy(0,200)", "");
System.out.println(js.executeScript("return window.pageYOffset"));
		//js.executeScript("window.scrollBy(200,100)", "");
		js.executeScript("window.scrollTo(200,150)", "");
		System.out.println(js.executeScript("return window.pageYOffset"));
		//js.executeScript("window.scrollTo(0,400)", "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Executor execute=new Executor();
   execute.initializeBrowser();
   execute.verifyJavascriptExecutor();
	}

}
