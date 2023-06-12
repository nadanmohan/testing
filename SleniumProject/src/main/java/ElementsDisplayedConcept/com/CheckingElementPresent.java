package ElementsDisplayedConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//isDisplayed()-->We are used to verify the presence of web element present in the page or not
//isEnabled-->it used to check buttons are enabled or not-->applied for buttons
//isSelected-->Webelement is selected or not -->checkbox,radio button,dropdown
public class CheckingElementPresent {
	
	static WebDriver odriver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://eportal.incometax.gov.in/iec/foservices/#/login");
	/*	//1.isDisplayed()
		boolean usName=odriver.findElement(By.id("username")).isDisplayed();
		if(usName)
		{
			System.out.println("Pass");
			System.out.println(usName);
			
		}
		else
		{
			System.out.println("fail");
		}
		*/
	/*	//2.isEnabled
		
		//odriver.findElement(By.id("username")).sendKeys("abc");
		boolean loginButton=odriver.findElement(By.xpath("//button[@class='large-button-primary width marTop16']")).isEnabled();
		if(loginButton)
		{
			System.out.println("Is enabled");
			System.out.println(loginButton);
			
		}
		else
		{
			System.out.println("Not enabled");
		
		}
		odriver.quit();
		
		*/
		
		//3.isSelected
		
		
		
		
		
		
		
		
		
		

	}

}
