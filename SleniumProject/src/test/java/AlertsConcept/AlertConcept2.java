package AlertsConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertConcept2 {
	
	
	static WebDriver odriver;
	
	@Test
	void alertHandling() throws InterruptedException
	{
	
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://demo.guru99.com/test/delete_customer.php");
		odriver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("nucot");
		odriver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
		//to handle alert
		
		Alert oalert=odriver.switchTo().alert();
		
		String textValue=oalert.getText();
		System.out.println(textValue);
		
		Thread.sleep(3000);
		//oalert.accept();
		oalert.dismiss();
		
	
	}
	
	
	
	
	
	

}
