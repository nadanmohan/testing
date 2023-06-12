package testngconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actitime {
	
	WebDriver odriver;
	@BeforeTest
	public void setUp()
	{		
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://demo.actitime.com/login.do");
	
	}
	
	@Test
	public void testTitle()
	{
		
		String title=odriver.getTitle();
		System.out.println(title);
		//validation-->act vs exp
		Assert.assertEquals(title, "actiTIME - Login");
		
	}
	
	@AfterTest
	public void elementIsSelect()
	{
		odriver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
