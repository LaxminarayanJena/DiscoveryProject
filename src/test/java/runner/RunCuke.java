package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        monochrome=true,
        tags= {"@Favorite-Shows,@All-Shows"} 
        )

public class RunCuke extends AbstractTestNGCucumberTests {

}


