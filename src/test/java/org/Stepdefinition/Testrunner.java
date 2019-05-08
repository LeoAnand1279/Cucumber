package org.Stepdefinition;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Featurefiles", glue="org.Stepdefinition",plugin="html.target")


public class Testrunner {
	

}
