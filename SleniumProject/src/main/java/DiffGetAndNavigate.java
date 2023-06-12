import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiffGetAndNavigate {
	public static void main(String[] args) {
		//There is no diff between get and navigate but when user want to go back and forward
		//if user is using get method then we cannot to this operation
		//but by using navigate we can do forward and back operation
		//1.launching the browser
				WebDriverManager.chromedriver().setup();
				WebDriver odriver=new ChromeDriver();
				odriver.navigate().to("http://www.google.com");
				odriver.navigate().refresh();				
				odriver.quit();
	
	}

}
