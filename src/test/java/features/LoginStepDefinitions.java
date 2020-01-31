package features;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.SerenitySteps;

public class LoginStepDefinitions {
	@Steps
	SerenitySteps SerenitySteps;
	
	@Given("User is on Login page")
	public void login()
	{
		SerenitySteps.openURL();;
	}
	@And("User enters valid credentials")
	public void enterValidcredentials()
	{
		SerenitySteps.login("Luke", "Skywalker");
	}
	@Then("User is successfully logged in")
	public void loginIsSuccessful()
	{
		SerenitySteps.loginIsSuccessful();
	}

}
