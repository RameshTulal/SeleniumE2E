package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;
public class TestGoogleSearchPage {
	private static WebDriver driver=null;	
		
	public static void GoogleSearchTest() {		
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/ChromeDriver/85/chromedriver.exe");		
		driver = new ChromeDriver();	
		
		GoogleSearchPage PageClassObj = new GoogleSearchPage(driver);
		
		driver.get("https://www.seleniumeasy.com/test/charts-mouse-hover-demo.html");	
		
		PageClassObj.SetTextInSearchTextbox("Testing Google Search Page");
		
		
				
		//Close Browser
		driver.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Execution started..!");
		
		GoogleSearchTest();
		
		System.out.println("                          ");
		System.out.println("                          ");
		System.out.println("Test Execution Completed..");
	}
	

}
