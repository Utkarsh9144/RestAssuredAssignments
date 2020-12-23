package negativeScenerio;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
				features="C:/Users/hp/git/RestAssuredAssignments001/RestAssured/src/test/resources/feature/NegativeScenerio.feature",
				glue={"negativeScenerio"},
				tags="@tag4"
				)
public class NegativeScenerioRunner {

}
