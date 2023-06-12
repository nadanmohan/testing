package Actionconcepts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class ScrollDemo {
	
	//Keyboard Actions
	//1.sendKeys()--->enter the values to input box
	//2.keyDown()-->keypress without release
	//3.keyUp()==>Key release
	
	
	
	
	

	static WebDriver odriver;
	
	@Test
	void scrollDownandUp() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.amazon.com");
		
		Thread.sleep(5000);

		Actions oaction=new Actions(odriver);
		
		//Scroll down using Action Class
		oaction.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		
		//Thread.sleep(3000);
		//Scroll Up using Action Class
		//oaction.keyDown(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		
		odriver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
