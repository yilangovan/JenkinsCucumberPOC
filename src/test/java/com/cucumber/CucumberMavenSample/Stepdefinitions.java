package com.cucumber.CucumberMavenSample;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {
	
	@Given("^User enters first and last name$")
	public void User_enters_first_and_last_name() throws Throwable {
	    
	}

	@When("^user enters firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
	public void user_enters_firstname_and_lastname(String arg1, String arg2) throws Throwable {
	    System.out.println("First Name:" + arg1 + "Last Name: " + arg2);
	}

	@Then("^system prints fullname \"([^\"]*)\"$")
	public void system_prints_fullname(String arg1) throws Throwable {
	    System.out.println("Full Name: " + arg1);
	}

}
