package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driverObj=null;
	
	By txtboxSearch = By.name("q");
	By btnSearch = By.name("btnK");
	
	//Constructor
	public GoogleSearchPage(WebDriver driverFromTestCase) {
		this.driverObj = driverFromTestCase;
	}	
	
	public void SetTextInSearchTextbox(String strSearchText) {
		driverObj.findElement(txtboxSearch).sendKeys(strSearchText);		
	}
	
	public String GetTextFromSearchTextbox() {
		String acctualText = driverObj.findElement(txtboxSearch).getText();		
		return acctualText;
	}
		
	public void ClickSearchButton() {
		driverObj.findElement(btnSearch).sendKeys(Keys.RETURN);		
	}

}
