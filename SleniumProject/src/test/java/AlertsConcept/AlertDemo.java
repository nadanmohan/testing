package AlertsConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {

	
	static WebDriver odriver;
	
	@Test
	void alertHandling() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://the-internet.herokuapp.com/javascript_alerts");
		odriver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		//to handle alert
		
		Alert oalert=odriver.switchTo().alert();
		
		String textValue=oalert.getText();
		System.out.println(textValue);
		
		Thread.sleep(3000);
		oalert.accept();
		
	
	}

	@Test
	void alertHandling2() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://the-internet.herokuapp.com/javascript_alerts");
		odriver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
		//to handle alert
		
		Alert oalert=odriver.switchTo().alert();
		
		String textValue=oalert.getText();
		System.out.println(textValue);
		
		Thread.sleep(3000);
		oalert.dismiss();
		
	
	}
	
	
	
}
