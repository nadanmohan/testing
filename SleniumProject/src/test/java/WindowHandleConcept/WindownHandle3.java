package WindowHandleConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindownHandle3 {
	
	
static WebDriver odriver;
	
	@Test
	void windownHandleDemo() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		odriver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(3000);
		
		
		
		String parentwindowId=odriver.getWindowHandle();
		System.out.println(parentwindowId);
		
		
		WebElement ole=odriver.findElement(By.cssSelector("#regform > div:nth-child(2)"));
		ole.click();		
		

		WebElement ole2=odriver.findElement(By.cssSelector("#regform > div:nth-child(2)"));
		ole.click();	
		WebElement ole3=odriver.findElement(By.cssSelector("#regform > div:nth-child(2)"));
		ole.click();		
			
		
	    Set<String> windows = odriver.getWindowHandles(); //s holds the set of all browser windows
	    
	    System.out.println("No. of browser windows opened - " + windows.size());
	    
	    for(String window : windows){
	        if(!parentwindowId.equals(window)) { //skip main window switching now
	            odriver.switchTo().window(window);
	            System.out.println(odriver.getCurrentUrl());
	            System.out.println(odriver.getTitle());
	            odriver.close();
	        }
	    }

	    odriver.switchTo().window(parentwindowId); //return back to main window
	    //do some testing on main window
	 
	    odriver.quit();
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
