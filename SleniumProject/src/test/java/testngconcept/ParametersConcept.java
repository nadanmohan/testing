package testngconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersConcept {
	
	WebDriver odriver;
	
	@Parameters({"browser"})
	@Test
	public void launchURL(String browser)
	{
		WebDriverManager.chromedriver().setup();
		
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
			System.out.println("Pass vaild data");
		}
		
		odriver.get("https://login.salesforce.com/");
		
		
		
	}
	
	@Parameters({"uName","pWord"})
	@Test
	public void loginPageTest(String uName,String pWord)
	{
		WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
		ole.sendKeys(uName);
		WebElement ole1=odriver.findElement(By.xpath("//input[@type='password']"));
		ole1.sendKeys(pWord);
		odriver.quit();
		
	}
	
	
	
	

}
