package Dataproviderconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	
	
	WebDriver odriver;
	@Parameters({"url","browser"})
	@BeforeMethod
	void setUp(String url,String browser) throws InterruptedException 
	{
		System.out.println("test cases are running on "+ browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			 odriver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			odriver=new FirefoxDriver();
			
			
		}else if(browser.equalsIgnoreCase("safari"))
		{
			odriver=new SafariDriver();
			
		}
		else
		{
			System.out.println("Pass vaild browser name");
		}
		
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get(url);
		Thread.sleep(3000);
	
	}
	
	@AfterMethod
	void closeBrwser()
	{
		odriver.close();
	}
	

}
