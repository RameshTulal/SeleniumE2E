package a1_Suits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginE2E {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Execution started..!");	
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/ChromeDriver/85/chromedriver.exe");		
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https:/www.google.co.in");	
	}	
	
	@Test
	public void verfyLoginPageDisplayed() {	
		driver.manage().window().maximize();	
		Assert.assertEquals("test", "test","Login page not found..!");		
		System.out.println("test verfyLoginPageDisplayed executed");	
	}
	
	@Test
	public void verfyUserNameTextBoxDisplayed() {
		driver.manage().window().maximize();	
		Assert.assertEquals("test", "test","UserName TextBox is not found..!");	
		System.out.println("test verfyUserNameTextBoxDisplayed executed");	
	}
	
	@Test
	public void verfyPasswordTextBoxDisplayed() {	
		driver.manage().window().maximize();	
		Assert.assertEquals("test", "test","Password TextBox is not found..!");	
		System.out.println("test verfyPasswordTextBoxDisplayed executed");	
	}
	
	@Test
	public void verfyLoginButtonDisplayed() {	
		driver.manage().window().maximize();	
		Assert.assertEquals("test", "test","Login Button is not found..!");	
		System.out.println("test verfyLoginButtonDisplayed executed");	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Execution Finished..!");			
	}
	
			
			
	

}
