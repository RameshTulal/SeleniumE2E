package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioCheckBoxPage {

	WebDriver driver = null;
	
	By linkCheckBoxDemo = By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Checkbox Demo')]");
	By chkboxSingle = By.xpath("//input[@id='isAgeSelected']");
	By lblSuccessMsg = By.xpath("//div[@id='txtAge']");
	By chkboxOption1 = By.xpath("//label[text()='Option 1']//input[@class='cb1-element']");
	By chkboxOption2 = By.xpath("//label[text()='Option 2']//input[@class='cb1-element']");
	By chkboxOption3 = By.xpath("//label[text()='Option 3']//input[@class='cb1-element']");
	By chkboxOption4 = By.xpath("//label[text()='Option 4']//input[@class='cb1-element']");
	By btnCheckAll = By.xpath("//input[@id='check1']");
	
	public RadioCheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSingleCheckBox() {
		driver.findElement(chkboxSingle).click();		
	}
	public boolean verifySusseccMessage() {
		 return driver.findElement(lblSuccessMsg).isDisplayed();		
	}
	public void clickCheckAllButton() {
		driver.findElement(btnCheckAll).click();		
	}
	public boolean verifyCheckAllButtonWorks() {
		return driver.findElement(chkboxOption1).isSelected();		
	}
	public void clickCheckBoxDemoLink(WebDriver driver) { 
		driver.findElement(linkCheckBoxDemo).click();
			
	}	


}
