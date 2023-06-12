package waitsconcept.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept2 {

	public static void main(String[] args) {
		//launching the browser
		WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		//passing url to browser
		odriver.get("https://app.hubspot.com/login");
		
		//passing the value to username
		WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
		ole.sendKeys("abc");
		//handle Ajax calls
		FluentWait wait =new FluentWait(odriver);
		wait.withTimeout(Duration.ofMillis(5));
		wait.pollingEvery(Duration.ofMillis(5));
		wait.ignoring(Exception.class);
		
		
		
		//passing the value for password
		WebElement ole1=odriver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
		ole1.sendKeys("abcd123");

		//getting the title page 
		String title=odriver.getTitle();
		System.out.println(title);
		
		odriver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
