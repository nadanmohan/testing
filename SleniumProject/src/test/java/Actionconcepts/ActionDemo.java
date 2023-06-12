package Actionconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDemo {

	
	
	
	
static WebDriver odriver;
	
	@Test
	void alertHandling() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://google.com");
		WebElement oele=odriver.findElement(By.name("q"));
		
		Thread.sleep(3000);
	//Shift key selenium	
		Actions oaction=new Actions(odriver);
		oaction.keyDown(oele,Keys.SHIFT).sendKeys("Selenium course concept").build().perform();
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
