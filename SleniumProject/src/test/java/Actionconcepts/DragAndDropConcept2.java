package Actionconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropConcept2 {
	
	
	//-->//a[text()=' BANK ']
	//-->(//li[@class='placeholder'])[1]
	
	
	static WebDriver odriver;
		
		@Test
		void dragAndDrop1() throws InterruptedException
		{
		
			odriver=new ChromeDriver();
			odriver.manage().deleteAllCookies();
			odriver.manage().window().maximize();
			odriver.get("https://demo.guru99.com/test/drag_drop.html");
			Thread.sleep(3000);
			WebElement oeleSource=odriver.findElement(By.xpath("//a[text()=' BANK ']"));
			WebElement oeleDesc=odriver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			
			
			//If you are performing multiple actions then we have to use build and perform-->multiple actions--build+perform
			Actions oaction=new Actions(odriver);
			//Thread.sleep(3000);
			//oaction.clickAndHold(oeleSource).moveToElement(oeleDesc).release().build().perform();
			Thread.sleep(3000);
			
			//or here we are doing single task-->perform--single action--perform
			oaction.dragAndDrop(oeleSource, oeleDesc).perform();
			
			
			
			
		
		}
		
	
	
	
	
	

}
