package seleniumBasics;

public class HandleBrowserCommands  extends Base{
	public void Verifycommands() {
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String handleid=driver.getWindowHandle();
		System.out.println(handleid);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HandleBrowserCommands handleBrowserCommand=new HandleBrowserCommands();
  handleBrowserCommand.initializeBrowser();
  handleBrowserCommand.Verifycommands();
	}

}
