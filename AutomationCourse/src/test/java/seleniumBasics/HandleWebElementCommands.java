package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleWebElementCommands extends Base {
	public void verifyCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	
		messagebox.sendKeys("Anu");
		System.out.println(messagebox.getText());
		System.out.println(messagebox.getTagName());
		System.out.println(messagebox.getCssValue("background-color"));
	WebElement button =	driver.findElement(By.xpath("//button[@id='button-one']"));
	button.click();
	messagebox.clear();
	WebElement messagetext=driver.findElement(By.xpath("//div[@id='message-one']"));
	System.out.println(messagetext.getText());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HandleWebElementCommands handleWebElement=new HandleWebElementCommands();
    handleWebElement.initializeBrowser();
    handleWebElement.verifyCommands();
	}

}
