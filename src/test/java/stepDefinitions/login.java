package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class login extends BaseClass {
	

	
//	@Given("User Launch Chrome browser")
//	public void user_launch_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver","E:\\EclipseProjects\\nopCommerce_Cucumber\\Drivers\\chromedriver.exe");
//		//System.getProperty("user.dir")+
//		driver = new ChromeDriver();
//		lp = new LoginPage(driver);
//	}
//
//	@When("User opens  URL {string}")
//	public void user_opens_url(String url) {
//		driver.get(url);
//	}	
//
//	@When("User enter Email as {string} and Password as {string}")
//	public void user_enter_email_as_and_password_as(String email, String password) {
//	   lp.setLoginEmail(email);
//	   lp.setPassword(password);
//	}
//
//	@When("Click on Login")
//	public void click_on_login() {
//	   lp.clickLoginBtn();
//	}
//
//	@Then("Page Title should be {string}")
//	public void page_title_should_be(String pageTitle) {
//	   
//		Assert.assertEquals(pageTitle, driver.getTitle() );
//	}
//
//	@When("User click on Log out link")
//	public void user_click_on_log_out_link() {
//	   lp.clickLogout(); 
//	}
//
//	@Then("close browser")
//	public void close_browser() {
//	    
//		driver.quit();
//	}

}
