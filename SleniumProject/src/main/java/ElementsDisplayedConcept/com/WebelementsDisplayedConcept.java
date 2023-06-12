package ElementsDisplayedConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OtherwayofWritingScript.OthewayScript;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementsDisplayedConcept {

	static WebDriver odriver;
	
	public static Boolean isElementDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	
	}
	
	public static WebElement getElement(By locator)
	{
		return	odriver.findElement(locator);	
	}
	
	public static void passSendKeys(By loactor,String value)
	{
		getElement(loactor).sendKeys(value);
	}
	
	public static void doClick(By loactor)
	{
		getElement(loactor).click();
	}
	
	public static String getValuetext(By loactor)
	{
		return getElement(loactor).getText();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://www.saucedemo.com/");
		/*Boolean oleme=odriver.findElement(By.className("login_logo")).isDisplayed();
		if(oleme)
		{
			System.out.println("Web elemnet is present on page");
		}
		else
		{
			System.out.println("Web elemnet is not present on page");
		}*/
		
		By oleme=By.className("login_logo");
		WebelementsDisplayedConcept.isElementDisplayed(oleme);
		
		if(isElementDisplayed(oleme))
		{
			System.out.println("Pass");
		}
		
		By username=By.id("user-name");
		By passWord=By.id("password");
		
		WebelementsDisplayedConcept.passSendKeys(username, "nucot123456");
		Thread.sleep(3000);
		WebelementsDisplayedConcept.passSendKeys(passWord, "nucot12");
		Thread.sleep(3000);
		By loginButton=By.id("login-button");
		WebelementsDisplayedConcept.doClick(loginButton);
		By errText= By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");
		String value=WebelementsDisplayedConcept.getValuetext(errText);
		System.out.println(value);
		String expectedValue="Epic sadface: Username and password do not match any user in this service";
				
		
		if(value.equalsIgnoreCase(expectedValue))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
				
		
		
		odriver.quit();

	}

}
