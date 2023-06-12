package testngconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderConcept1 {
	
	WebDriver odriver;
	
	
	public boolean loginPage(String userName,String passWord)
	{
		odriver.findElement(By.id("id_username")).clear();
		odriver.findElement(By.id("id_username")).sendKeys(userName);
		odriver.findElement(By.id("id_password")).clear();
		odriver.findElement(By.id("id_password")).sendKeys(passWord);
		odriver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		return true;
	}
	
	

	@BeforeTest
	public void setUpCon()
	{
		odriver =new ChromeDriver();
		odriver.get("https://pixabay.com/accounts/login/");
		
	}
	
	

	@DataProvider
	public Object[][] getDataForLoginDetails()
	{
		
		return new Object[][]
		{
			{"nucot@gmail.com","nucot@123"},
			{"nucot1@gmail.com","nucot1@123"},
			{"nucot2@gmail.com","nucot2@gmail.com"},
	
		};
	}
	
	@Test(dataProvider="getDataForLoginDetails")
	void loginTestWithDetails(String userName,String passWord)
	{
		boolean ab=loginPage(userName,passWord);
		Assert.assertTrue(ab);
		
	}
	
	@AfterTest
	public void closeTest()
	{
		
		odriver.close();
		
	}
	
	
	
	
	

}
