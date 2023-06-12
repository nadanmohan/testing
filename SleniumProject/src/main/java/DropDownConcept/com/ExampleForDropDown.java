package DropDownConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleForDropDown {

	
	
	static WebDriver odriver;
	
	
	/*
	 * Method for getting the element
	 * 
	 */
	public static WebElement getElement(By locator) {
		return odriver.findElement(locator);	
	}
	
	/*
	 * Selecting the value by selectByIndex()
	 * 
	 */
	
	public static void doSelectDropDownByIndex(By locator,int index)
	{
		Select oselect=new Select(getElement(locator));
		oselect.selectByIndex(index);	
	}
	
	/*
	 * Selecting the value by selectByValue()
	 * 
	 */
	
	public static void doSelectDropDownByValue(By locator,String value)
	{
		Select oselect=new Select(getElement(locator));
		oselect.selectByValue(value);	
	}
	
	/*
	 * Selecting the value by selectByVisbleText()
	 * 
	 */
	
	public static void doSelectDropDownByVisbleText(By locator,String value)
	{
		Select oselect=new Select(getElement(locator));
		oselect.selectByVisibleText(value);	
	}
	
	public static void passSendKeys(By loactor,String value)
	{
		getElement(loactor).sendKeys(value);
	}
	
	public static void doSelectCheck(By loactor)
	{
		getElement(loactor).click();
	}

	public static void doClose()
	{
		odriver.quit();
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		//locating the check box
		By selCheck=By.id("gender-male");
		//Selecting the checkbox
		ExampleForDropDown.doSelectCheck(selCheck);
		
		//locating inputbox
		By useName=By.id("FirstName");
		ExampleForDropDown.passSendKeys(useName, "Nucot");
		By lastName=By.id("LastName");
		ExampleForDropDown.passSendKeys(lastName, "Company");
		//Locating the day dropdown
		By dayOfBirth=By.name("DateOfBirthDay");
		//selecting day
		ExampleForDropDown.doSelectDropDownByIndex(dayOfBirth, 15);
		Thread.sleep(2000);
		
		//Selecting month
		By dd=By.name("DateOfBirthMonth");
		ExampleForDropDown.doSelectDropDownByIndex(dd, 1);
		Thread.sleep(2000);
		ExampleForDropDown.doSelectDropDownByValue(dd, "1");
		Thread.sleep(2000);
		ExampleForDropDown.doSelectDropDownByVisbleText(dd, "January");
		Thread.sleep(2000);
		
		//Selecting year
		
		By doby=By.name("DateOfBirthYear");
		ExampleForDropDown.doSelectDropDownByValue(doby, "1917");
		
		Thread.sleep(3000);
		ExampleForDropDown.doClose();
		
		
		
		
		
		
		

	}

}
