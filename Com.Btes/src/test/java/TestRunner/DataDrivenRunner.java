package TestRunner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	@CucumberOptions(features="src\\main\\java\\FeatureFile\\DataDriven.feature",glue= {"StepDefination"})
	public class DataDrivenRunner extends AbstractTestNGCucumberTests
	{

	}



