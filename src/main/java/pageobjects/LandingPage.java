package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myAccountLink;
	
	public WebElement myAccountLink() {
		return myAccountLink;
	}
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement registerLink;
	
	public WebElement registerLink() {
		return registerLink;
	}
	
	public RegisterPage getRegisterPage() {
		registerLink.click();
		return new RegisterPage(driver);
	}

}
