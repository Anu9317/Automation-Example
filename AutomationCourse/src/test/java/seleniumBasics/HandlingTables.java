package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base {

	public void verifyTables() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table=driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(table.getText());
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
		System.out.println(tablerow.getText());
		WebElement tablecolumn=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]/td[2]"));
		System.out.println(tablecolumn.getText());
		WebElement tablelastrow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[last()]"));
		System.out.println(tablelastrow.getText());
		WebElement tablelastcolumn=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]/td[last()]"));
		System.out.println(tablelastcolumn.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingTables handletable=new HandlingTables();
		handletable.initializeBrowser();
		handletable.verifyTables();
	}

}
