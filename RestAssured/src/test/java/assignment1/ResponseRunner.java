package assignment1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="C:/Users/hp/git/RestAssuredAssignments001/RestAssured/src/test/resources/feature/assignment1.feature",
				glue={"assignment1"},
				tags="@tag4"
				
		)
public class ResponseRunner {

}

