package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        
		monochrome = true,
		plugin= {"pretty","html:target/cucumber-html","json:target/cucumber.json"},
        features = "src/test/java/features",
        
        //  tags= {"@Regression,@Rachit"},  //Or Condition
      //  tags= {"@Regression","@Sanity"},  And Condition
        //		tags= {"~@DataTable"},   except that all other scenarios would run
        
        tags = {"@LoginFeature"},
        glue= {"stepdefs"}
 )

public class TestRunner {

}
