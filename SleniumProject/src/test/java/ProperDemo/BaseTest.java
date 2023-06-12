package ProperDemo;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseTest {
	
	DempProperties dp;
	WebDriver odriver;
	Properties prop;
	
	@Test
	public void appSetUp()
	{
		dp=new DempProperties();
		prop=dp.initProp();
		odriver=dp.launchBrowser(prop);
	}
	
	
	
	
	
	
	

}
