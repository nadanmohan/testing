package TakingScreenshotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenDemo {
	
	static WebDriver odriver;
	
	@Test
	void takeScreen() throws InterruptedException, IOException
	{
		
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://demo.guru99.com/test/delete_customer.php");
		odriver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("nucot");
		//odriver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
		/*
		//take screenshot and store it as file format
		
		File ofile=((TakesScreenshot)odriver).getScreenshotAs(OutputType.FILE);
		
		//Now copy the screenshot to the some loc using copyfile method
		
		FileUtils.copyFile(ofile,new File("/Users/somashekarr/Desktop/Screen/screenshot.png"));
		
		*/
		
		File scrFile = ((TakesScreenshot)odriver).getScreenshotAs(OutputType.FILE);
	      Thread.sleep(4000);
	    FileUtils.copyFile(scrFile, new File("/Users/somashekarr/Desktop/Screen/screenshot.png"));

		
		

		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
