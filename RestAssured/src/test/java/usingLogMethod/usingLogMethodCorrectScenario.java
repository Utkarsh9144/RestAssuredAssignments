package usingLogMethod;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class usingLogMethodCorrectScenario {
	
	Response response;
	
	@Given("API for foreign  exchange.")
	public void api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://api.ratesapi.io";
	    
	}
	
	@When("posted with correct information.")
	public void posted_with_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("/api/latest");
	   
	}
	
	@Then("validate response for request using log method")
	public void validate_response_for_request_using_log_method() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.given().log().all().header("Content-Type", "application/json").body("").when().get("/api/latest").then()
				.log().all().statusCode(200).extract().response();
	    
	}
	
	

}
