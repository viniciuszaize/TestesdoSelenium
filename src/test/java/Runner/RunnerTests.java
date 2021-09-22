package Runner;





import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = {"src/test/resources/Features/Teste.feature"},
        glue = "classpath:steps", monochrome = true, dryRun = false,
        tags ="@teste")

public class RunnerTests {
}
