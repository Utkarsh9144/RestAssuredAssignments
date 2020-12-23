package usingLogMethod;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="C:/Users/hp/git/RestAssuredAssignments001/RestAssured/src/test/resources/feature/usingLogMethod.feature",
				glue={"usingLogMethod"},
				tags="@tag2")
public class usingLogMethodRunner {

}
