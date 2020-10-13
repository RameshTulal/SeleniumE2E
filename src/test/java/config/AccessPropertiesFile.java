package config;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import withTestNG.TestGoogleSearchWithTestNG;

public class AccessPropertiesFile {

	static Properties prop = new Properties();
	public static void main(String[] args) {
		//getProperties();
		setProperties();
		
	}

	public static void getProperties() {		
		try {						
			InputStream input = new FileInputStream("F:\\Ramesh\\Selenium\\SeleniumWorkSpace\\SeleniumJavaFramework\\src\\test\\java\\config\\Config.Properties");
			prop.load(input);
			TestGoogleSearchWithTestNG.BrowserName = prop.getProperty("Masterbrowser", null);						
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		} 
	}
	public static void setProperties() {		
		try {						
			FileOutputStream output = new FileOutputStream("F:\\Ramesh\\Selenium\\SeleniumWorkSpace\\SeleniumJavaFramework\\src\\test\\java\\config\\Config.Properties");
			DateFormat dtf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
			Date dateobj = new Date();		
			String status = " Pass, last modified:"+ dtf.format(dateobj);			
			prop.setProperty("Result",status.replace("\"",""));
			prop.store(output, null);						
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		} 
	}


}
