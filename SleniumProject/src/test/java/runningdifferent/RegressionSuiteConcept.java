package runningdifferent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegressionSuiteConcept extends BaseTestExecution {


	@Parameters({"username","passWord"})
	@Test(priority=1)
	void userLoginTest(String username,String passWord) throws InterruptedException
	{
	
		Thread.sleep(3000);
		//passing the userName to the input text field
		WebElement oleUserName=odriver.findElement(By.name("username"));
		oleUserName.sendKeys(username);
		
		//passing the password to the input text field
		
		WebElement olePassword=odriver.findElement(By.name("password"));
		olePassword.sendKeys(passWord);
		
		//clicking on login in button
		WebElement oleLoginButton=odriver.findElement(By.xpath("//button[@type='submit']"));
		
		oleLoginButton.click();
		Thread.sleep(3000);
	}
	
	
	
	@Test(priority=2)
	void getTitlePage()
	{
		String expectTile="OrangeHRM";
		String actualTitle=odriver.getTitle();
		System.out.println(actualTitle);
		//validation
		Assert.assertEquals(actualTitle, expectTile);
		
		
	}
	
	
	@Test(priority=3)
	void getCurrentUrlPage()
	{
		
		String expecyUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actualCurrUrl=odriver.getCurrentUrl();
		System.out.println(actualCurrUrl);
		Assert.assertEquals(actualCurrUrl, expecyUrl);
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
