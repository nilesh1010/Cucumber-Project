package com.tk20.cucumber.test.login;




//Comments 1 for GIT


import org.testng.Assert;

import com.tk20.cucumber.test.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//step layer
public class LoginTest {
	 WebConnector selenium = WebConnector.getInstance();
	//	Logger logger = Logger.getLogger("devpinoyLogger");

	/*@Before
	public void setUp() {
		selenium = new WebConnector();
	}*/


	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_Go_tk20(String URL,String browser) throws Throwable{
		System.out.println("I am going to "+URL+"on"+browser);
		selenium.openBrowser(browser);
		selenium.navigate(URL);
	}


	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter(String object,String text)throws Throwable{

		System.out.println("Entering in "+ object +" value "+ text);
		selenium.type(text, object);
		//logger.debug("Entering in "+ object +" value "+ text);

	}


	@And("^I click on \"([^\"]*)\"$")
	public void I_Click_On(String object) throws Throwable{
		System.out.println("click on button"+object);
		selenium.click(object);
	}

	@Then("^Login should be \"([^\"]*)\"$")
	public void Then_login_should_be(String expectedResult){
		System.out.println("Login - "+ expectedResult);
		boolean result=selenium.isElementPresent("helptext");
		String actualResult=null;

		if(result)
			actualResult="success";
		else
			actualResult="failure";

		Assert.assertEquals(expectedResult, actualResult);

	}
}