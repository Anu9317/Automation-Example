package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleFrames extends Base{
	
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalFrames=driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames);
		driver.switchTo().frame(1);
		//driver.switchTo().frame("frame1");
		driver.switchTo().parentFrame();
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame);
		WebElement heading=driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		driver.switchTo().defaultContent();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HandleFrames handleframe=new HandleFrames();
    handleframe.initializeBrowser();
    handleframe.verifyFrames();
	}

}
