package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\SAGAR\\IdeaProjects\\SimpleBDDFrameWork1\\src\\test\\resources\\Features\\Login.feature",
        glue = {"StepDefinations"},
        dryRun = false


)
public class TestRunner {

}
