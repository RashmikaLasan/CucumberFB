package runner;


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@Cucumber.Options(features ="Features",glue = {"stepDef"})
public class TestRunner {
}
