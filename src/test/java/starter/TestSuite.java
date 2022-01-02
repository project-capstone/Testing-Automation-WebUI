package starter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
    plugin = {"pretty"},
    features = "src/test/resources/features/demo/demo.feature",
    tags = "@post"
)
public class TestSuite {
}
