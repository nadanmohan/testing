package Actionconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyAndPasteConcept {

	
	
static WebDriver odriver;
	
	@Test
	void alertHandling() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://demo.actitime.com/login.do");
		WebElement oele=odriver.findElement(By.xpath("//input[@id='username']"));
		oele.click();
		oele.sendKeys("nucot");
		WebElement oele2=odriver.findElement(By.xpath("//input[@name='pwd']"));
		oele.click();
		Thread.sleep(3000);
		//Shift key selenium	
		Actions oaction=new Actions(odriver);
		
		//windows Keys.CONTROL
		oaction.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		oaction.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		oele2.click();
		oaction.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
