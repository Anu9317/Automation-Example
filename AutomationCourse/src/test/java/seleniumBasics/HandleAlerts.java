package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleAlerts extends Base {
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement alertbutton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertbutton.click();
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
	}
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement alertbutton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alertbutton.click();
		Alert confirmAlert=driver.switchTo().alert();
		//confirmAlert.accept();
		confirmAlert.dismiss();

	}
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement alertbutton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		alertbutton.click();
		Alert promptAlert=driver.switchTo().alert();
	    promptAlert.sendKeys("Anu");
	   // promptAlert.accept();
	    promptAlert.dismiss();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandleAlerts handleAlert = new HandleAlerts();
		handleAlert.initializeBrowser();
		// handleAlert.verifySimpleAlert();
		//handleAlert.verifyConfirmAlert();
		handleAlert.verifyPromptAlert();
		
	}

}
