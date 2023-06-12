package testngconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngConcept2 {
	
	
	WebDriver odriver;
	//1-->second//1
	@BeforeMethod
	void loginSetUp()
	{
		odriver=new ChromeDriver();
		odriver.manage().window().maximize();
		odriver.get("https://app.hubspot.com/login");
		
	}
	
	/*
	@Test
	void openApp()
	{
		odriver.get("https://app.hubspot.com/login");
		
	}
	*/
	
	//2
	@Test(priority=1)
	void titleOfPage()
	{
		String title=odriver.getTitle();
		System.out.println(title);
	
	}
	//2 for second flow
	@Test(priority=2)
	void loginPage() throws InterruptedException
	{
		Thread.sleep(3000);
		odriver.findElement(By.id("username")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		odriver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("abc@123");
		
	}
	
	@Test(priority=3)
	void selectRememberMe() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement ole=odriver.findElement(By.xpath("//span[@class='UICheckbox__PrivateCheckboxIndicator-sc-4hb1iv-1 fRMgaj private-checkbox__indicator']"));
		ole.click();
	}
	
	//3--//3 for second flow
	@AfterMethod
	void closePage()
	{
		odriver.quit();
	}
	
	
	/*
	before method
	test
	after method
	before method 
	test2
	aftermethod
	beforemethod
	test3
	aftermethod
	*/
	
	

}
