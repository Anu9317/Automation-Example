package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick() {
		WebElement rightclick=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).build().perform();
}
	public void verifyMousehover() {
		WebElement hover=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action=new Actions(driver);	
		action.moveToElement(hover).build().perform();
	}
	public void verifyDragDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		Actions action=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).build().perform();
		
	}
	public void verifyKeyboardAction() throws AWTException {
		Robot robot = new Robot();
		//VK - Virtual key. keypress simulates key press activity.
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		//keyrelease to release the press of key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HandlingActions handleAction=new HandlingActions();
    handleAction.initializeBrowser();
   // handleAction.verifyRightClick();
   // handleAction.verifyMousehover();
   // handleAction.verifyDragDrop();
    try {
		handleAction.verifyKeyboardAction();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
	}

}
