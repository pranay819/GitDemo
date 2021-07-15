package stepsdefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefination {
	
	@Given("^User open the browser$")
    public void user_open_the_browser() throws Throwable {
        System.out.println("Browser opened");
    }

    @When("^User hit the link in browser$")
    public void user_hit_the_link_in_browser() throws Throwable {
        System.out.println("link entered");
    }

    @Then("^application login page gets displayed$")
    public void application_login_page_gets_displayed() throws Throwable {
        System.out.println("login page gets displayed");
    }



    @When("^User enter below details on sign up page$")
    public void user_enter_below_details_on_sign_up_page(DataTable data) throws Throwable {
    List<List<String>> obj	=data.asLists();
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(1).get(0));
      
    }
	
	
	 @When("^User enter username (.+) and password (.+)$")
	    public void user_enter_username_and_password(String username, String password) throws Throwable {
	        System.out.println("username");
	        System.out.println("password");
	    }
	
	 @When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enter_something_and_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	    }
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Login page displayed");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("User name and pwd entered");
	}

	@When("Click login button")
	public void click_login_button() {
		System.out.println("Login button clicked");
	}

	@Then("User gets logged in")
	public void user_gets_logged_in() {
		System.out.println("User logged in successfully");
	}

	@When("User enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
		System.out.println("Invalid details entered");
	}

	@Then("Error message gets displayed")
	public void error_message_gets_displayed() {
	   System.out.println("Error message displayed");
	}
}