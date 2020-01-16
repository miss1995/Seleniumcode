package TestRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src\\main\\java\\FeatureFile",glue= {"StepDefination"})
public class LoginTestRunner extends AbstractTestNGCucumberTests
{

}
