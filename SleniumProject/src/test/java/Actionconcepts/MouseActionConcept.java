package Actionconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionConcept {
	//Mouse Actions
	//1.clickAndHold()-->click on  mouse without releasing it
	//2.doubleClick()-->double click on  element
	//3.contextClick()-->right click on the mouse
	//4.moveToElement()
	//5.dragAndDrop(s,d)
	//6.dragAndDropBy(s,x-offset,y-offset)
	
	
	
static WebDriver odriver;
	
	@Test
	void singleClick() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://google.com");
		WebElement oele=odriver.findElement(By.name("q"));
		
		Thread.sleep(3000);
	//Shift key selenium	
		Actions oaction=new Actions(odriver);
		oaction.doubleClick(oele);
		oaction.keyDown(oele,Keys.SHIFT).sendKeys("Selenium course concept").build().perform();
		odriver.close();
		
	
	}
	
	
	
	
	
	
	
	
	

}
