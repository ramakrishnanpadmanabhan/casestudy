package stepdef;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/scenarios/case4.feature", plugin = "json:target\\xmlreport.json")
	public class runner1 {

	
}
