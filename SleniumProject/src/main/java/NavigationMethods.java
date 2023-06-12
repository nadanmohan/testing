import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Navigation methods in selenium

//1.to
//2.back
//3.forward
//4.refresh
public class NavigationMethods {

	public static void main(String[] args) {
		
		//1.launching the browser
		WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		
		//2.Enter the url and getting the title of the page
		odriver.get("http://www.google.com");
		System.out.println(odriver.getTitle());
		
		//3.i have to navigate flipkart.com
		odriver.navigate().to("http://www.flipkart.com");
		System.out.println(odriver.getTitle());
		
		odriver.navigate().back();
		System.out.println(odriver.getTitle());
		
		odriver.navigate().forward();
		System.out.println(odriver.getTitle());
		
		odriver.navigate().back();
		System.out.println(odriver.getTitle());
		
		
		odriver.quit();
		
		
		
		

	}

}
