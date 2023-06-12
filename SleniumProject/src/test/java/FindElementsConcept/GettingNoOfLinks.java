package FindElementsConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GettingNoOfLinks {
	static WebDriver odriver;
	
	@Test
	void gettingWebElements() throws InterruptedException
	{
		
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		List<WebElement> noOfLinks=odriver.findElements(By.tagName("a"));
		System.out.println("Total no of Links--->"+ noOfLinks.size());
		
		for(WebElement links:noOfLinks)
		{
			
		String hrefValue=links.getAttribute("href");
		String textLink=links.getText();
		System.out.println(hrefValue+" "+textLink );
		
	
		}
		
		List<WebElement> noOfImages=odriver.findElements(By.tagName("img"));
		System.out.println("Total no of Images--->"+noOfImages.size());
		
		for(WebElement images:noOfImages)
		{
			
		String srcValue=images.getAttribute("src");
		String textImage=images.getText();
		System.out.println(srcValue+" "+textImage );
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
