package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BehavePage;

public class Behave {
	WebDriver driver;
	 BehavePage obj; 
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		 obj = new BehavePage(driver);
	   
	}

	@When("^user enter valid (.*) and (.*)$")
	public void user_enter_valid_username_and_password(String username , String password) {
	    // Write code here that turns the phrase above into concrete actions
		obj.user(username);
		obj.pass(password);
	   
	}

	@And("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.clickbtn();
	    
	}

	@Then("redirect to home page")
	public void redirect_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		obj.banner();
		driver.quit();
	    
	}


}
