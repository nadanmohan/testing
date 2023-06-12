package locators.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypesofWaitConcept {

	//1.static wait
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		odriver.get("https://app.hubspot.com/login");
		//Thread.sleep(1000);//static wait
		WebElement ole=odriver.findElement(By.xpath("//input[@type='email' and contains(@type,'email')]"));
		ole.sendKeys("abc");
		//Thread.sleep(1000);
		WebElement ole1=odriver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
		ole1.sendKeys("abcd123");

		String title=odriver.getTitle();
		System.out.println(title);
		//Thread.sleep(1000);
		odriver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
