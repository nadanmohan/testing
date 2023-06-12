package OtherwayofWritingScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * 
 * Somashekar
 * 
 * By locator concept
 * 
 */

public class OthewayScript {
	
	
	
	static WebDriver odriver;
	
	//generic method 
	
	public static WebElement getElement(By loactor)
	{
		return odriver.findElement(loactor);
	}
	
	
	public static void passSendKeys(By loactor,String value)
	{
		getElement(loactor).sendKeys(value);
	}
	
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://www.saucedemo.com/");
		
		/*//By locator
			By username=By.xpath("(//input[@autocapitalize='none'])[1]");
			By passWord=By.id("password");
			WebElement usele=odriver.findElement(username);
			WebElement pwele=odriver.findElement(passWord);
			usele.sendKeys("abc");
			pwele.sendKeys("abc@123");
			*/
		
		
		By username=By.id("user-name");
		By passWord=By.id("password");
		//OthewayScript.getElement(username);
		OthewayScript.passSendKeys(username, "nucot123456");
		//explicitwait
		WebDriverWait wait=new WebDriverWait(odriver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(username));
		
		
		OthewayScript.passSendKeys(passWord, "12345");
		odriver.quit();
		
		
	}

}
