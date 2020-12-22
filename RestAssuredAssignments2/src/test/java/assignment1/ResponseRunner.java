package assignment1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="F:/1.Workspaces/Java workspace/RestAssuredAssignments2/src/test/resources/Feature/assignment1.feature",
				glue={"assignment1"},
				tags="@tag4"
				
		)
public class ResponseRunner {

}