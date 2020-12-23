package negativeScenerio;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NegativeScenerioAssignment {
	
	Response response;
	
	@Given("API for foreign exchange.")
	public void api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://api.ratesapi.io";
	    
	}

	@When("posted with incorrect information")
	public void posted_with_incorrect_information() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.get("/api");
	   
	}

	@Then("validate negative response code received")
	public void validate_negative_response_code_received() {
	    // Write code here that turns the phrase above into concrete actions
		 int statusCode = response.getStatusCode();
			System.out.println("Status Code returned is "+statusCode);
			Assert.assertEquals(400, statusCode);
	    
	}
	
	
	

}
