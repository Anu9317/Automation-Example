package seleniumBasics;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown extends Base {
	public void verifyDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropDown);
		//select.selectByIndex(1);
		//select.selectByVisibleText("Python");
		select.selectByValue("sql");
			
	}
	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox.click();
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		if(checkbox.isSelected()){
			checkbox.click();
		}
		
	
	}
	public void verifyRadioButton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='purple']"));
		System.out.println(radioButton.isSelected());
		radioButton.click();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HandleDropDown handledropdown=new HandleDropDown();
     handledropdown.initializeBrowser();
     //handledropdown.verifyDropDown();
     handledropdown.verifyCheckBox();
     //handledropdown.verifyRadioButton();
     
     
	}

}
