package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base{
	
	public void fileUploadUsingSendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupload=driver.findElement(By.xpath("//input[@type='file']"));
		fileupload.sendKeys("C:\\Users\\Anu\\git\\Automation\\AutomationCourse\\src\\test\\resources\\java notes.pdf");
		WebElement fileterms=driver.findElement(By.xpath("//input[@type='checkbox']"));
		fileterms.click();
		WebElement filesubmit=driver.findElement(By.xpath("//button[@id='submitbutton']"));
		filesubmit.click();
	}
	public void fileUploadUsingRobot() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		StringSelection selection =  new StringSelection("C:\\Users\\Anu\\git\\Automation\\AutomationCourse\\src\\test\\resources\\java notes.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot= new Robot();
		//For handling the operating time and no error occur
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   FileUpload file=new FileUpload();
   file.initializeBrowser();
   //file.fileUploadUsingSendkeys();
   try {
	file.fileUploadUsingRobot();
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
