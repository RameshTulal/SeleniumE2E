package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.InputBoxPage;

public class InputBoxTest {


	private static WebDriver driver = null;	
	public static String Browser;	
	static String baseUrl = "https://www.seleniumeasy.com/test/charts-mouse-hover-demo.html"; 	
	static String InputText = "Test Message for InputBox";		

	@BeforeMethod
	public void setUpTest() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);	
		driver.manage().window().maximize();			
	}

	@Test
	public static void runTest() {					
		InputBoxPage objInputBoxPage = new InputBoxPage(driver);

		objInputBoxPage.clickInputFormLink(driver);	
		objInputBoxPage.clickSimpleFormDemoLink(driver);		
		objInputBoxPage.setTextInInputBox(InputText);
		objInputBoxPage.clickShowMessageButton();
		if(objInputBoxPage.verifyOutPutMessage()){
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Test Failed!");
		}		
	}	

	@AfterMethod
	public void tearDownTest() {
		driver.close();		
	}

}
