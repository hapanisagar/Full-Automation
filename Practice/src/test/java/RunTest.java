import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@Login",
        format = {"pretty","html:html","json:json/cucumber.json","junit:junit/cucumber.xml"},
        //glue = {"StepDefinations"},
        // tags = {"@Login"},
        dryRun = false
)

public class RunTest {
}
