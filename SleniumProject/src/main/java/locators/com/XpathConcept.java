package locators.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		odriver.get("https://login.salesforce.com/");
		WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
		ole.sendKeys("nucot");
		WebElement ole1=odriver.findElement(By.xpath("//input[@type='password']"));
		ole1.sendKeys("abcd123");
		Thread.sleep(3000);
		odriver.quit();
		
		//1.//input[@type='email']
		//2.//input[@id='username']
		//3.//input[@name='username']
		//4.//*[@name='username']
		//5.//input[@class='input r4 wide mb16 mt8 username']
		
		
		//input[@type='password']
		//input[@id='password']
		//input[@name='pw']
		//input[@class='input r4 wide mb16 mt8 password']
		//*[@id='password']
		

	}

}
