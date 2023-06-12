package Dataproviderconcept;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingDataToTestCase extends BaseTest {
	
	
	
	@Test(dataProvider="getTestData")
	void userLoginTest(String username,String passWord) throws InterruptedException
	{
		Thread.sleep(3000);
		//passing the userName to the input text field
		WebElement oleUserName=odriver.findElement(By.xpath("//input[@type='email']"));
		oleUserName.sendKeys(username);
		
		//passing the password to the input text field
		
		WebElement olePassword=odriver.findElement(By.xpath("//input[@type='password']"));
		olePassword.sendKeys(passWord);
		
		
	}
	
	
	
	@Test(priority=2)
	void getTitlePage()
	{
		String expectTile="Login | Salesforce";
		String actualTitle=odriver.getTitle();
		System.out.println(actualTitle);
		//validation
		Assert.assertEquals(actualTitle, expectTile);
		
		
	}
	
	
	@Test(priority=3)
	void getCurrentUrlPage()
	{
		
		String expecyUrl="https://login.salesforce.com/";
		String actualCurrUrl=odriver.getCurrentUrl();
		System.out.println(actualCurrUrl);
		Assert.assertEquals(actualCurrUrl, expecyUrl);
		
		
	}
	
	
	
	/*
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
	//	 ArrayList<Object[]> testData=TestUtilMethod.getDataFromExcel();
		
	//	return testData.iterator();
	}
	
	
	*/
	
	
	
	
	
	
	
	

}
