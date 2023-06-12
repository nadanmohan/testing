package DropDownConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericDropdownConcept {

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
	
	
	public static void doClose()
	{
		odriver.quit();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://the-internet.herokuapp.com/dropdown");
		By dd=By.id("dropdown");
		GenericDropdownConcept.doSelectDropDownByIndex(dd, 1);
		Thread.sleep(2000);
		GenericDropdownConcept.doSelectDropDownByValue(dd, "1");
		Thread.sleep(2000);
		GenericDropdownConcept.doSelectDropDownByVisbleText(dd, "Option 2");
		Thread.sleep(2000);
		GenericDropdownConcept.doClose();
		
	
		

	}

}
