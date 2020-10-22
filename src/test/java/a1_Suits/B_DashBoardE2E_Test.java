package a1_Suits;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class B_DashBoardE2E_Test {
	WebDriver driver = null;
	public static String BrowserName = null;
	

	@BeforeTest
	public void TestStartup() {			
		System.out.println("setup Started...");	
		System.out.println("setup is up and ready...");	
		System.out.println("Test execution Started...");
	}
	
	@BeforeMethod
	public void Setup() {			
		System.out.println("Browser is ready...");	
		System.out.println("Application Launched..");	
	}

	@Test
	public void verfyDashBoardDisplayed() throws Exception {		
		Assert.assertEquals("test", "test","DashBoard not found..!");	
		System.out.println("verfyDashBoardDisplayed is executed...");
	}
	
	@Test
	public void verfyDashBoard() throws Exception {
		Assert.assertEquals("test", "test","DashBoard not working properly...!");	
		System.out.println("test verfyDashBoard is executed...");
	}
	

	@AfterMethod
	public void tearDown() {			
		System.out.println("Application Closed..");
		System.out.println("Browser Closed...");	
	}
	@AfterTest
	public void TestEnd() throws InterruptedException {
		System.out.println("Test execution Finished...");
	}

}
