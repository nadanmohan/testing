package Actionconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClickConcept {

	
	static WebDriver odriver;
	
	@Test
	void alertHandling() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement oele=odriver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action=new Actions(odriver);	
		
		action.contextClick(oele).build().perform();
		
		List<WebElement> list=odriver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[contains(@class,'context-menu-icon')]"));
		
		for(WebElement ole:list)
		{
			String textValue=ole.getText();
			System.out.println(textValue);
			if(textValue.equalsIgnoreCase("Quit"))
			{
				ole.click();
				//break;
			}
			
			
		}
		
		
		
		
		Thread.sleep(3000);
	
	
	}
	
	
	
	
	
	
	
	
}
