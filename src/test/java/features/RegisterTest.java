package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LandingPage;
import pageobjects.RegisterPage;

public class RegisterTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void initializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	public void register() throws InterruptedException {
		System.out.println("Register is called..");
		driver.get("http://tutorialsninja.com/demo/");
		Thread.sleep(9000);
		LandingPage lp=new LandingPage(driver);
		lp.myAccountLink().click();
		RegisterPage rp=lp.getRegisterPage();
		
	}

}
