package a1_Suits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_LoginPageE2E_Test {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {	
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/ChromeDriver/85/chromedriver.exe");		
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https:/www.google.co.in");
		System.out.println("@BeforeMethod: Application Launched..");
	}	
	
	@Test(groups = { "Login" })
	public void verfyLoginPageDisplayed() {	
		driver.manage().window().maximize();	
		Assert.assertEquals("test", "test","Login page not found..!");		
		System.out.println("test verfyLoginPageDisplayed executed");	
	}
	
	@Test(dependsOnMethods = { "verfyLoginPageDisplayed" }, groups = { "Login" })
	public void verfyUserNameTextBox() {
		driver.manage().window().maximize();	
		Assert.assertEquals("test", "test","UserName TextBox is not found..!");	
		System.out.println("test verfyUserNameTextBox executed");	
	}
	
	@Test(dependsOnMethods = { "verfyLoginPageDisplayed" }, groups = { "Login" })
	public void verfyPasswordTextBox() {	
		driver.manage().window().maximize();	
		Assert.assertEquals("test", "test","Password TextBox is not found..!");	
		System.out.println("test verfyPasswordTextBox executed");	
	}
	
	@Test(dependsOnMethods = { "verfyLoginPageDisplayed" }, groups = { "Login" })
	public void verfyLoginButton() {	
		driver.manage().window().maximize();	
		Assert.assertEquals("test", "test","Login Button is not found..!");	
		System.out.println("test verfyLoginButton executed");	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("@AfterMethod: Application Closed..");		
	}		
			
	

}
