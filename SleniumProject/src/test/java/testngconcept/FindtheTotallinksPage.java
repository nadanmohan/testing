package testngconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindtheTotallinksPage {
	
	
WebDriver odriver;
	

	@Test
	void findingTheTotalLinks() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		odriver.get("https://amazon.com");
		Thread.sleep(3000);
			
		List<WebElement> listoflinks=odriver.findElements(By.tagName("img"));
		//print all the links on the page
		int countofLinks=listoflinks.size();
		System.out.println("Total links present in the page is -->"+countofLinks);
		
		for(int i=0;i<countofLinks;i++)
		{
			
			String valueOfText=listoflinks.get(i).getText();
			System.out.println(valueOfText);
			
		}
		
		
		
		
		
		
		
		
		
	}

	
	

}
