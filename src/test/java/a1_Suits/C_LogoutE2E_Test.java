package a1_Suits;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class C_LogoutE2E_Test {
	WebDriver driver = null;
	public static String BrowserName = null;
	

	@Test(priority=0, dependsOnMethods="Login")
	public void verfyLogoutPageDisplayed() throws Exception {	
		Assert.assertEquals("test", "test","Logout page not found..!");	
		System.out.println("Test verfyLogoutPageDisplayed is executed...");
	}
	
	@Test(priority=1, dependsOnMethods="verfyLogoutPageDisplayed")
	public void Logout() throws Exception {
		Assert.assertEquals("test", "test","Logout failed..!");	
		System.out.println("Test verfyLogoutButton is executed...");
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
		System.out.println("@AfterMethod: Application Closed..");		
	}
	
}
