package Actionconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandleconcpet {
	
	
	
static WebDriver odriver;
	
	@Test
	void windowHandle() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement oele1=odriver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		oele1.click();
		WebElement oele2=odriver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		oele2.click();
		WebElement oele3=odriver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		oele3.click();
		WebElement oele4=odriver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		oele4.click();
		
		Set<String> ohandles=odriver.getWindowHandles();
		
		Iterator<String> it=ohandles.iterator();
		
		while(it.hasNext())
		{
			
			String windowsID=it.next();
			odriver.switchTo().window(windowsID);
			System.out.println(odriver.getTitle()+" "+odriver.getCurrentUrl());
			
			odriver.close();			
			
			
			
			
		}
		
		
		
		
	}	
		
		
		
		
		
		

}
