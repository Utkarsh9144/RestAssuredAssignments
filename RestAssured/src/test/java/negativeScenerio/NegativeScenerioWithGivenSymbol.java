package negativeScenerio;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NegativeScenerioWithGivenSymbol {
	
	Response response;
	@Given("API for foreign exchange with symbols.")
	public void api_for_foreign_exchange_with_symbols() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://api.ratesapi.io";
	  
	}

	@When("posted with incorrect symbols")
	public void posted_with_incorrect_symbols() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.get("/api/latest?symbols=IN,US");
	   
	}

	@Then("validate negative response code for symbols")
	public void validate_negative_response_code_for_symbols() {
	    // Write code here that turns the phrase above into concrete actions
		int statusCode = response.getStatusCode();
		System.out.println("Status Code returned is "+statusCode);
		Assert.assertEquals(400, statusCode);
	    
	}

}
