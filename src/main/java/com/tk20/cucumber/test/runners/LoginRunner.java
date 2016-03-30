package com.tk20.cucumber.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// runner class


@CucumberOptions(
glue = {"com.tk20.cucumber.test.login"}, 
features = "classpath:com/tk20/cucumber/test/login/login.feature"
)
public class LoginRunner extends AbstractTestNGCucumberTests {
	
	
}
