package com.project.Steps;

import com.project.Helper.BaseClass;
import com.project.Pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Step extends BaseClass 
{
	HomePage homepage = new HomePage();
	
	
	@Given("^I navigate to web$")
	public void i_navigate_to_web() throws Throwable {
		launchUrl("https://app.clearscore.com/login");
	    
	}

	@Then("^i input email$")
	public void i_input_email() throws Throwable {
		
	    homepage.andinputemail();
	}


}
