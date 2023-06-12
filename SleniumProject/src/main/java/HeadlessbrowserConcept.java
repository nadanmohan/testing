import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessbrowserConcept {

	public static void main(String[] args) {
		//No browser is launching(Not visible/hidden browser)
		//faster
		//testing will happen behind the scene
		WebDriverManager.chromedriver().setup();
		//Runs in headless mode
		ChromeOptions objCo=new ChromeOptions();
		objCo.addArguments("--headless");
		WebDriver odriver=new ChromeDriver(objCo);
		//runs without headless
		//WebDriver odriver=new ChromeDriver();
		odriver.get("http://www.flipkart.com");
		System.out.println(odriver.getTitle());
		odriver.quit();		

	}

}
