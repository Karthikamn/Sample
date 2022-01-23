package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Then;

public class Scripts1 {
	
	@Given("Open chrome and url of the application")
	public void open_chrome_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given");
	}

	@When("Enter username , password And click  login button")
	public void enter_username_password_And_click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when");
	}

	@Then("login Success")
	public void login_Success() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then");
	}



}
