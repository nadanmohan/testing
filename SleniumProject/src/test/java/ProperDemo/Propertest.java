package ProperDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertest {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("/Users/somashekarr/eclipse-workspace/SeleniumMorningSession/src/test/resources/config/config.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		
		
		
		
		
		
		
		
	}

}
