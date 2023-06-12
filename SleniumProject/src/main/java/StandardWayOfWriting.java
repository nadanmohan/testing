import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandardWayOfWriting {

public WebDriver odriver;
	
/**
 * This method is used to launch the browser based on the browser name right
 * @param Browser
 * @return
 */
	public WebDriver launchBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			odriver=new ChromeDriver();
		} 
		else if(browser.equals("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					odriver=new FirefoxDriver();
			
				}
		else if(browser.equals("safari"))
				{
					WebDriverManager.safaridriver().setup();
					odriver=new SafariDriver();
				}
			else
				{
					System.out.println("Please pass the correct browser name");
			
				}
		return odriver;
	}
	
	/**
	 * 
	 * This method is used to enter the Url
	 * 
	 */
	public WebDriver enterUrl(String url)
	{
		odriver.get(url);
		return odriver;
	
	}
	
	/**
	 * 
	 * This method is used for getting the title and validation
	 *
	 */
	
	void getTitleName()
	{
		String t=odriver.getTitle();
		System.out.println(t);
	
	}
	
	/**
	 * 
	 * This method is used to get the current url and validation
	 * 
	 */
	
	void getCurrentUrl()
	{
		String gcu=odriver.getCurrentUrl();
		System.out.println(gcu);
		
	}
	/**
	 * 
	 * This method is used to close the browser
	 * 
	 */
	
	void closeBrowser()
	{
		odriver.quit();
	}
	
	/**
	 * 
	 * Main method Entry point
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		StandardWayOfWriting obj=new StandardWayOfWriting();
		obj.launchBrowser("chrome");
		obj.enterUrl("https://www.gmail.com");
		obj.getTitleName();
		obj.getCurrentUrl();
		obj.closeBrowser();
		

	}

}
