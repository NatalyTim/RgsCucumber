import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features"},
        glue = {"example.core.steps"},
      //  plugin = { "ru.tinkoff.autotests.core.reporter.AllureReporter"},
        tags = {"@all"}
        )
public class CucumberRunnerTest {

}
