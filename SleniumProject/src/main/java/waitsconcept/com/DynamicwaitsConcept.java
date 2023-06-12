package waitsconcept.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicwaitsConcept {

	public static void main(String[] args) {
		        //2.dynamic waits
				//applied for all the web elements 
				//global wait
				//dynamic wait
				//1.Implicit wait
		//syntax-->driver.manage().timeouts().implicitlywait(specifiedtime,TimeUnit.seconds)
		/*WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		odriver.get("https://app.hubspot.com/login");
		
		//implicit wait
		
		odriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
		ole.sendKeys("abc");
		
		WebElement ole1=odriver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
		ole1.sendKeys("abcd123");

		String title=odriver.getTitle();
		System.out.println(title);
		
		odriver.quit();
		*/
		
		
		
		//Explicitwait
		
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		odriver.get("https://app.hubspot.com/login");
		
		//explicit wait
		
		
		
		WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
		ole.sendKeys("abc");
		
		WebElement ole1=odriver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
		ole1.sendKeys("abcd123");
		
		//explicit wait 
		
		//syntax
		/*
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeClickable(locator of webelement));
		 * 
		 */
		
		WebDriverWait wait=new WebDriverWait(odriver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(ole1));
		
		
		

		String title=odriver.getTitle();
		System.out.println(title);
		
		odriver.quit();
		
		
		
		
		
		
		
		
	}

}
