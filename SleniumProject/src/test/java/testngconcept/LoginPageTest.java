package testngconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	
	WebDriver odriver;
	
	@Test
	void loginPage()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		odriver.get("https://login.salesforce.com/");
		WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
		ole.sendKeys("nucot");
		WebElement ole1=odriver.findElement(By.xpath("//input[@type='password']"));
		ole1.sendKeys("abcd123");
		odriver.quit();
		
	}
	/*
	@Test
	void closeBrowser()
	{
		odriver.close();
	}
	*/
	
	//dependsOnMethods
	//dependsOnGroups
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	@Test 
	@Parameters({"us","pwd"})
	void login()
	{
		
	}
	
	
	@DataProvider(name="logainpageDATA")
	void home()
	{
		
	}
	@Test(priority=3)
	void s()
	{
		
	}
	@Test(dependsOnGroups= {"home"})

	void d()
	{
		
	}
	
	@Test(enabled=true)
	void dd()
	{
		
	}
	
	@Test(enabled=false)
	void ddd()
	{
		
	}
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	

}
