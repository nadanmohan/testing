package ProperDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class ProperDemo {

	public WebDriver odriver;
	public Properties  prop;
	
	
	@Test
	public WebDriver launchBrowser() throws IOException
	{
		
		prop=new Properties();
		FileInputStream ip=new FileInputStream("/Users/somashekarr/eclipse-workspace/SeleniumMorningSession/src/test/resources/config/config.properties");
		prop.load(ip);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			odriver=new ChromeDriver();
			
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			odriver=new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			odriver=new EdgeDriver();
		}
		else
		{
			System.out.println("Pass right browser name");
		}
	
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get(prop.getProperty("url"));
		
		return odriver;
		
		
	}
	
	
	
	
	

}
