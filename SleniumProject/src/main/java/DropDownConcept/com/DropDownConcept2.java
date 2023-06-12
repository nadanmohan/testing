package DropDownConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept2 {

	static WebDriver odriver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://the-internet.herokuapp.com/dropdown");
		
		//To locat on dropdown
		WebElement dd=odriver.findElement(By.id("dropdown"));
		//toclick on dropdown
		dd.click();
		//1.method-1-->selectByIndex()
	/*	//to select values in the dropdown we have create the select class and pass locator to the select class
		Select sele=new Select(dd);
		sele.selectByIndex(1);
		Thread.sleep(1000);
		odriver.quit();	
		*/	
		
		/*//2.method-2-->selectByValue()
		Select sele=new Select(dd);
		sele.selectByValue("2");
		Thread.sleep(2000);
		
		
		odriver.quit();	
		*/	
		
		//3.method-3-->selectByVisibleText()
		
		Select sele=new Select(dd);
		sele.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		odriver.quit();	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
