import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RuntheScriptIncognito {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions objCo=new ChromeOptions();
		objCo.addArguments("--incognito");
		WebDriver odriver=new ChromeDriver(objCo);
		odriver.get("http://www.flipkart.com");
		System.out.println(odriver.getTitle());
		odriver.quit();		
	}

}
