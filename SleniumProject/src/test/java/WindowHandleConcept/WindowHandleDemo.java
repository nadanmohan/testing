package WindowHandleConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandleDemo {
	
	
	
	
static WebDriver odriver;
	
	@Test
	void alertHandling() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement oele=odriver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		oele.click();
		
		
		
		Set<String> ohandles=odriver.getWindowHandles();
		
		Iterator<String> it=ohandles.iterator();
		
		String parentWindowID=it.next();
		System.out.println("This is parent Window Id-->" +parentWindowID);
		
		
		
		String childWindowID=it.next();
		
		System.out.println("This is child Window Id-->" +childWindowID);
		
		//switching to browser window
		odriver.switchTo().window(childWindowID);
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		
		String curl=odriver.getCurrentUrl();
		System.out.println(curl);
		
		
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
