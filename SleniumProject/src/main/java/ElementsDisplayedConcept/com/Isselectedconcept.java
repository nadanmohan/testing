package ElementsDisplayedConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//isSelected()--It is used to select the web element in the page -->check,radio,dropdown
public class Isselectedconcept {
	static WebDriver odriver;
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://demo.actitime.com/login.do");
		WebElement isSele=odriver.findElement(By.id("keepLoggedInCheckBox"));
		isSele.click();
		Thread.sleep(1000);
		boolean sele=isSele.isSelected();
		if(sele)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
		}
		odriver.quit();
		
		
		
		
		
	}

}
