package Actionconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElementConcept {
	
	//move to  element--->parent to child menu
	
static WebDriver odriver;
	
	@Test
	void alertHandling() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("http://mrbool.com/search/?txtsearch=how+to+create-menu-with-submenu&o=&keyword=&lido=&tipo=0&vis=-1&site=0&codigobanca=");
		WebElement oele=odriver.findElement(By.cssSelector("a.menulink"));
		Actions oaction=new Actions(odriver);
		oaction.moveToElement(oele).perform();
		Thread.sleep(3000);
		odriver.findElement(By.linkText("COURSES")).click();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	

}
