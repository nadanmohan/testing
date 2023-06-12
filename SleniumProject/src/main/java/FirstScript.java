import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {
	
	static WebDriver odriver;
	
	@Test
	void loginPage()
	{
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://payroll.razorpay.com/signup");
		WebElement drp=odriver.findElement(By.name("num-employees"));
		drp.click();
		
	}
	
	
	

}
