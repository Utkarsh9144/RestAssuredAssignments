package assignment1;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseWithGivenSymbolAndBase {
	Response response;
	
	@Given("API for foreign exchange with Symbols and base")
	public void api_for_foreign_exchange_with_symbols_and_base() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://api.ratesapi.io";
	    
	}

	@When("Posted with correct Symbol and base")
	public void posted_with_correct_symbol_and_base() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.get("/api/latest?base=USD&symbols=GBP");
	    
	}

	@Then("Validate positive response for given Sysmbol and base")
	public void validate_positive_response_for_given_sysmbol_and_base() {
	    // Write code here that turns the phrase above into concrete actions
		int statusCode = response.getStatusCode();
		System.out.println("Status Code returned is "+statusCode);
		Assert.assertEquals(200, statusCode);
	   
	}

}
