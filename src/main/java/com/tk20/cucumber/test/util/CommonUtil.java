package com.tk20.cucumber.test.util;



import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CommonUtil {
	WebConnector selenium =WebConnector.getInstance();
	
	// clicking on object
	@And("^I click on \"([^\"]*)\"$")
	public void I_Click_On(String object){
		selenium.log("Clicking on "+object);
		selenium.click(object);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter(String object,String text){
		selenium.log("Typing in "+object);
		System.out.println("Entering in "+ object +" value "+ text);
		selenium.type(text, object);
	}
	// check if not logged in - then login
	@Given("^I am logged in salesforce in \"([^\"]*)\"$")
	public void I_am_logged_in_app(String browser){
		selenium.openBrowser(browser);
		Assert.assertEquals("Not logged in", selenium.isLoggedIn());
	}
	
	@Given("^Runmode is \"([^\"]*)\"$")
	public void Runmode_is(String runmode) throws Exception{
		if(runmode.equals("N"))
			throw new Exception("Skipping the test as Runmode is No");
	}
	
	@Given("^Browser is \"([^\"]*)\"$")
	public void Browser_is(String browser){
		selenium.openBrowser(browser);
	}
	
	@And("^\"([^\"]*)\"should be present$")
	public void Should_be_present(String object){
		Assert.assertEquals("Object not found "+ object, selenium.isElementPresent(object));
	}
	
	// compare tiles
	// compare text
	// compare values in droplist
	
	
	
	
	
}