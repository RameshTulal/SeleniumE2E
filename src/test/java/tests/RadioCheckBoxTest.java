package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.RadioCheckBoxPage;
import pages.InputBoxPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioCheckBoxTest {

	private static WebDriver driver = null;	
	public static String Browser;	
	static String baseUrl = "https://www.seleniumeasy.com/test/charts-mouse-hover-demo.html"; 	
	
	@BeforeTest
	public void setUpTest() throws Exception {		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.get(baseUrl);
			Thread.sleep(3000);
			driver.manage().window().maximize();
	}

	@Test
	public static void runTest() {		
		RadioCheckBoxPage objCheckBoxPage = new RadioCheckBoxPage(driver);
		InputBoxPage objInputBoxPage = new InputBoxPage(driver);
		
		objInputBoxPage.clickInputFormLink(driver);	
		objCheckBoxPage.clickCheckBoxDemoLink(driver);	
		objCheckBoxPage.clickSingleCheckBox();
		if(objCheckBoxPage.verifySusseccMessage()){
			objCheckBoxPage.clickCheckAllButton();
			if(objCheckBoxPage.verifyCheckAllButtonWorks()) {	
				System.out.println("Test Passed!");
			}
		}
		else {
			System.out.println("Test Failed!");
		}
	
	}
	
	@Test
	public static void runTest2() {		
		RadioCheckBoxPage objCheckBoxPage = new RadioCheckBoxPage(driver);
		InputBoxPage objInputBoxPage = new InputBoxPage(driver);
		
		objInputBoxPage.clickInputFormLink(driver);	
		objCheckBoxPage.clickCheckBoxDemoLink(driver);	
		objCheckBoxPage.clickSingleCheckBox();
		if(objCheckBoxPage.verifySusseccMessage()){
			objCheckBoxPage.clickCheckAllButton();
			if(objCheckBoxPage.verifyCheckAllButtonWorks()) {	
				System.out.println("Test Passed!");
			}
		}
		else {
			System.out.println("Test Failed!");
		}
	
	}
	
	@Test
	public static void runTest3() {		
		RadioCheckBoxPage objCheckBoxPage = new RadioCheckBoxPage(driver);
		InputBoxPage objInputBoxPage = new InputBoxPage(driver);
		
		objInputBoxPage.clickInputFormLink(driver);	
		objCheckBoxPage.clickCheckBoxDemoLink(driver);	
		objCheckBoxPage.clickSingleCheckBox();
		if(objCheckBoxPage.verifySusseccMessage()){
			objCheckBoxPage.clickCheckAllButton();
			if(objCheckBoxPage.verifyCheckAllButtonWorks()) {	
				System.out.println("Test Passed!");
			}
		}
		else {
			System.out.println("Test Failed!");
		}
	
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();		
	}

}
