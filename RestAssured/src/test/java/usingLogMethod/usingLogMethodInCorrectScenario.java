package usingLogMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class usingLogMethodInCorrectScenario {
	Response response;
	@Given("API for foreign exchange with incorrect URI")
	public void api_for_foreign_exchange_with_incorrect_uri() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://api.ratesapi.io";
		
	   
	}

	@When("posted with incorrect information.")
	public void posted_with_incorrect_information() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.get("/api");
	    
	}

	@Then("validate response code for request using log method")
	public void validate_response_code_for_request_using_log_method() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.given().log().all().header("Content-Type", "application/json").body("").when().get("/api").then()
				.log().all().statusCode(400).extract().response();
	    
	}

}
