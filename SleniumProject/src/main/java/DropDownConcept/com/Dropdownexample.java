package DropDownConcept.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownexample {

	
	static WebDriver odriver;
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://www.save70.com/flights");
		By dd=By.id("dropdown");
		WebElement ole=odriver.findElement(By.name("flights_class"));
		ole.click();
		
		Select osele=new Select(ole);
		
		List<WebElement> dropDownValues=osele.getOptions();
		//System.out.println(dropDownValues.size()-1);
		
		//for each()
		for(WebElement ndv:dropDownValues)
		{
			
			String s=ndv.getText();
			if(s.equalsIgnoreCase("business"))
			{
				ndv.click();
				System.out.println("pass");
				break;
			}

		}
		odriver.quit();
		
		
		

	}

}
