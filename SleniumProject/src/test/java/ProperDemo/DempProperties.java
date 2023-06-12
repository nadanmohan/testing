package ProperDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DempProperties {
	
	public WebDriver odriver;
	public Properties prop;
	
	/**
	 *  To launch app and returns driver
	 * @param browserName
	 * @return
	 * @throws IOException
	 */
	
	
	public WebDriver launchBrowser(Properties prop) 
	{
		String browserName= prop.getProperty("browser");
		
		System.out.println("browser name is"+ browserName);
	
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
	
		
		String testUrl=prop.getProperty("url");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get(testUrl);
		
		
		
		
		
		return odriver;
		
		
	}
	
	
	
	/**
	 * Reading the data from properties
	 * 
	 * 
	 * 
	 * @return
	 */
	
	
	public Properties initProp()
	{
		prop=new Properties();
		
		
		FileInputStream ip;
		try {
			ip = new FileInputStream("/Users/somashekarr/eclipse-workspace/SeleniumMorningSession/src/test/resources/config/test.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
		
		return prop;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
