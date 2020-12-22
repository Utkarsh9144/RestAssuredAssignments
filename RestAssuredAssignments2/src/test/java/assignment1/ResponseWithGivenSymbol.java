package assignment1;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseWithGivenSymbol {
	
	Response response;
	
	@Given("API for foreign exchange with symbols")
	public void api_for_foreign_exchange_with_symbols() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://api.ratesapi.io";
	   
	}

	@When("Posted with correct symbol")
	public void posted_with_correct_symbol() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.get("/api/latest?symbols=GBP,USD");
	    
	}

	@Then("Validate positive response for given symbol")
	public void validate_positive_response_for_given_symbol() {
	    // Write code here that turns the phrase above into concrete actions
		int statusCode = response.getStatusCode();
		System.out.println("Status Code returned is "+statusCode);
		Assert.assertEquals(200, statusCode);
	    
	}

}
