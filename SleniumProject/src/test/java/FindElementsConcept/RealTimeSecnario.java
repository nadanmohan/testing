package FindElementsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RealTimeSecnario {
	
	static WebDriver odriver;
	@Test
	void searchAndClickOn() throws InterruptedException
	{
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		odriver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		odriver.findElement(By.xpath("//input[@name='q']")).sendKeys("pendrive");
		Thread.sleep(3000);
		odriver.findElement(By.xpath("(//span[text()='pendrive'])[1]")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
