package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/Appfeature/scroll.feature",glue="stepDefinations")

public class RunnerClass {
	
	//it should Combine both feature file and stepdefination

}
       