package negativeScenerio;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NegativeScenerioWithBase {
	
	Response response;
	
	@Given("API for foreign exchange with base.")
	public void api_for_foreign_exchange_with_base() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://api.ratesapi.io";
	    
	}

	@When("API with incorrect base")
	public void api_with_incorrect_base() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.get("/api/latest?base=IN,US");
	    
	}

	@Then("validate negative code for base")
	public void validate_negative_code_for_base() {
	    // Write code here that turns the phrase above into concrete actions
		
		int statusCode = response.getStatusCode();
		System.out.println("Status Code returned is "+statusCode);
		Assert.assertEquals(400, statusCode);
	    
	}

}
