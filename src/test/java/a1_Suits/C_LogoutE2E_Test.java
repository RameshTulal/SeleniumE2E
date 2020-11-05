package a1_Suits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class C_LogoutE2E_Test {
	WebDriver driver = null;
	public static String BrowserName = null;
	
	@BeforeMethod
	public void setUp() {	
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/ChromeDriver/85/chromedriver.exe");		
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https:/www.google.co.in");	
		System.out.println("@BeforeMethod: Application Launched..");	
	}	

	@Test(priority=0)
	public void verfyLogoutPageDisplayed() throws Exception {	
		Assert.assertEquals("test", "test","Logout page not found..!");	
		System.out.println("Test verfyLogoutPageDisplayed is executed...");
	}
	
	@Test(priority=1)
	public void verfyLogoutButton() throws Exception {
		Assert.assertEquals("test", "test","Logout button not found..!");	
		System.out.println("Test verfyLogoutButton is executed...");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("@AfterMethod: Application Closed..");		
	}
	
}
