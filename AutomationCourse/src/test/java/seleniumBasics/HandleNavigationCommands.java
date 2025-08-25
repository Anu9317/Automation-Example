package seleniumBasics;

public class HandleNavigationCommands extends Base{
	
	public void verifyNavigationCommands() {
		//driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HandleNavigationCommands handle=new HandleNavigationCommands();
    handle.initializeBrowser();
    handle.verifyNavigationCommands();
	}
    
}
