package a1_Suits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_LoginPageE2E_Test {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {	
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/ChromeDriver/85/chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement pop = driver.findElement(By.xpath("//*[@id=\'u_0_h\']"));
		pop.click();
		System.out.println("@BeforeMethod: Application Launched..");
	}	
	
	@Test(groups = { "Login" })
	public void verfyLoginPageDisplayed() {	
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));		
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\'u_0_b\']"));
		String str = btnLogin.getAttribute("name");	
		
		if(txtUserName.isDisplayed()&&txtPassword.isDisplayed()&&btnLogin.isDisplayed())			
			Assert.assertEquals(str, "login","Login page not found..!");		
		System.out.println("test: verfyLoginPageDisplayed executed");	
	}
	
	
	@Test(dependsOnMethods = { "verfyLoginPageDisplayed" }, groups = { "Login" })
	public void Login() {	
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\'u_0_b\']"));
		txtUserName.sendKeys("465282049");
		txtPassword.sendKeys("HighoneJ@1234");
		btnLogin.click();			
		
		WebElement friends = driver.findElement(By.xpath("//span[contains(text(),'Create a Story')]"));
		if(friends.isDisplayed())
			Assert.assertEquals(friends.getText(), "Create a Story","Login failed..!");	
		System.out.println("test verfyLoginButton executed");	
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
		System.out.println("@AfterMethod: Application Closed..");		
	}		
			
	

}
