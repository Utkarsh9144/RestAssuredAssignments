package futureDateAssignment;

import java.time.LocalDate;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class futureDateInput {
	
	Response response;
	
	@Given("Rates API with future date for the Specific date Foreign Exchange rates")
	public void rates_api_with_future_date_for_the_specific_date_foreign_exchange_rates() {
	    // Write code here that turns the phrase above into concrete actions
		
		RestAssured.baseURI = "https://api.ratesapi.io";
	    
	}

	@When("The API is Available")
	public void the_api_is_available() {
	    // Write code here that turns the phrase above into concrete actions
		response=RestAssured.get("/api/2035-01-12");
	    
	}

	@Then("Assert the  response with current date")
	public void assert_the_response_with_current_date() {
	    // Write code here that turns the phrase above into concrete actions
		
		LocalDate current=LocalDate.now();
		
		System.out.println("Currentdate::"+current);
		JsonPath json=response.jsonPath();
		String responsedate=json.get("date");
		System.out.println("Date in future:"+responsedate);
		Assert.assertEquals(responsedate,current);
		
	}

}
