package a1_Suits;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestGoogleSearchWithTestNG {
	WebDriver driver = null;
	public static String BrowserName = null;
	

	@BeforeTest
	public void setUp() {			
		System.out.println("setup Started...");	
		System.out.println("setup is up and ready...");	
		System.out.println("Test execution Started...");
	}

	@Test
	public void GoogleSearchTest1() throws Exception {			
		System.out.println("GoogleSearchTest1 is executed...");
	}
	
	@Test
	public void GoogleSearchTest2() throws Exception {
		System.out.println("GoogleSearchTest2 is executed...");
	}
	
	@Test
	public void GoogleSearchTest3() throws Exception {	
		System.out.println("GoogleSearchTest3 is executed...");
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		System.out.println("Test execution Finished...");
		System.out.println("setup dismissed...");
		System.out.println("setup Stoped...");	
	}

}
