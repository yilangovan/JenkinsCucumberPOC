package com.cucumber.CucumberMavenSample;

import java.util.List;
import junit.framework.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleSteps {
	List<Integer> numbers;
	
    private int sum;
	
@Given("^a list of numbers$")
public void a_list_of_numbers(List<Integer> arg1) throws Throwable {
    this.numbers = arg1;
}

@When("^I summarize them$")
public void I_summarize_them() throws Throwable {
	for (Integer number : numbers) {
        sum += number;
    }
}

@Then("^should I get (\\d+)$")
public void should_I_get(int expectedSum) throws Throwable {
	//assertThat(sum, is(not(equalTo(expectedSum))));
	Assert.assertEquals(sum, expectedSum);
	
}

}
