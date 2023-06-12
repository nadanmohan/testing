package ElementsDisplayedConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedRadioConcept {

	static WebDriver odriver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://skillrary.com/user/login");
		WebElement radioCheck=odriver.findElement(By.id("usertype_yes"));
		radioCheck.click();
		boolean rc=radioCheck.isSelected();
		System.out.println(rc);
	}

}
