package ProperDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProperDemo2 {


	public WebDriver odriver;
	public static Properties  prop;
	

	/**
	 * 
	 * To initializing the browser
	 * @param browserName
	 * @return
	 */
	
	public WebDriver launchBrowser(Properties  prop)
	{
		
		String browserName= prop.getProperty("browser").toLowerCase().trim();
		//System.out.println("The name od the browser "+ browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			odriver=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			odriver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			odriver=new EdgeDriver();
		}
		else
		{
			System.out.println("Pass right browser name");
		}
	
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("url");
		
		return odriver;
		
		
	}
	
	public Properties initProp()
	{
		prop=new Properties();
		
		try {
			FileInputStream ip=new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	}
	

	public static void main(String[] args) {
		ProperDemo2 obj =new ProperDemo2();
		obj.initProp();
		obj.launchBrowser(prop);

	}

}
