package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import java.lang.*;
@CucumberOptions(features = "src/test/resources/features",
                    glue = {"org.example.stepdefs"},
                    plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
                    monochrome = true,
                    publish = true

)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
