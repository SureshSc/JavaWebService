package org.tektutor;

import org.json.JSONObject;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdditionTest {
	Calculator calculator = new Calculator();
	String input = "{\"number_one\":20,\"number_two\":5}";
	String output = "<h1>Sum of 10 and 5 is 15</h1>";

	
	@Given("Two numbers in JSON format string")
	public void twoNumbersInJSONFormatString() {
	    // Write code here that turns the phrase above into concrete actions
	    JSONObject recoData = new JSONObject(input);
	    int variable1 = recoData.getInt("number_one");
	    int variable2 = recoData.getInt("number_two");
	    Assert.assertNotNull(variable1);
	    Assert.assertNotNull(variable2);
	}

	@When("user calls API")
	public void userCallsAPI() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertNotNull(calculator.doAddition(input));
	}

	@Then("sum of two numbers should be return as string response")
	public void sumOfTwoNumbersShouldBeReturnAsStringResponse() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(calculator.doAddition(input), output);
	}

}
