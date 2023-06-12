import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//1.to open the browser(top casting)
		WebDriver odriver=new FirefoxDriver();
		//2.Open the application--->Enter URl
		odriver.get("https://www.amzon.com/");
		//3.Get the page title
		String t=odriver.getTitle();
		System.out.println(t);
		//4.Validation
		if(t.equals("Amazon.com. Spend less. Smile more."))
		{
			System.out.println("Details are correct");
			
		}
		else
		{
			System.out.println("Details are not correct");
		}
		
		//5.Getting page source
		/*String ps=odriver.getPageSource();
		System.out.println(ps);*/
		
		//6.Getting Current URL
		String gcu=odriver.getCurrentUrl();
		System.out.println(gcu);
		//7.Validation
		if(gcu.equals("https://www.amazon.com/"))
		{
			System.out.println("This correct url");
			
		}
		else
		{
			System.out.println("This not correct url");
		}
		//8.Close the browser
		
		
		//Case1.//Interview question---NoSuchSessionException--Invaild seesion Id
		//odriver.close();
		//or
		//Case2.//NoSuchSessionException--Session ID is null
		odriver.quit();
		
		//3.Get the page title-------
				/*String tt=odriver.getTitle();
				System.out.println(tt);*/
		

	}

}
