package testngconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginpageValidations {
	
	
	
	
WebDriver odriver;
	
	@BeforeMethod
	void loginSetUp()
	{
		
		odriver=new ChromeDriver();
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		
	}
	
	
	
	@Parameters({"firstname","lastname"})
	@Test
	void loginAppPageTest(String firstname,String lastname)
	{
		
		odriver.findElement(By.id("FirstName")).sendKeys(firstname);
		odriver.findElement(By.id("LastName")).sendKeys(lastname);
		
	}
	
	
	
	@Test
	void pageTileValidation()
	{
		String actualtiltle=odriver.getTitle();
		System.out.println(actualtiltle);
		String expectedTitle="nopCommerce demo store. Register";
		Assert.assertEquals(actualtiltle, expectedTitle);
			
	}
	
	@Test
	void selectCheckBox()
	{
		
		WebElement oele=odriver.findElement(By.id("gender-male"));
		oele.click();
		boolean actualtiltle=oele.isSelected();
		Assert.assertTrue(actualtiltle);
			
	}
	
	
	
	@AfterMethod
	void closeBrowser()
	{
		odriver.close();
	}
	
	
	

}
