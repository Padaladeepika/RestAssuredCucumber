package restAPI;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefs {
	
	Response response;
	RequestSpecification request;
	
	@Given("The base URI is {string}")
	public void the_base_URI_is(String URI) {
	    // Write code here that turns the phrase above into concrete actions
	    request = RestAssured.given().baseUri(URI);
	}

	@When("I Perform the Get Operation")
	public void i_Perform_the_Get_Operation() {
	    // Write code here that turns the phrase above into concrete actions
		response = request.get();
	}

	@Then("Response code should be {int}")
	public void response_code_should_be(int ResponseCode) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(response.statusCode(), 200);
	}

}
