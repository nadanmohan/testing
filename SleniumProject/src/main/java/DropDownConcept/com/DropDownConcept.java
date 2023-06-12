package DropDownConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept {

	static WebDriver odriver;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://payroll.razorpay.com/signup");
		WebElement drp=odriver.findElement(By.name("num-employees"));
		drp.click();
		Thread.sleep(3000);
		
		//while automating dropdown --if there is select class how to automate?
		
		//1.First create the object for Select class 
		//pass the locator to the select class
		//We can handle by three ways
		//a.selectByIndex()-->1,2,3
		//b.selectByValue()
		//c.selectByVisbleText()
		
		Select noofemp=new Select(drp);
		//noofemp.selectByIndex(1);
		//noofemp.selectByValue("1-5");
		
		noofemp.selectByVisibleText("1-5");
		Thread.sleep(3000);
		odriver.quit();
		
		
		
		
		
		
		
	}

}
