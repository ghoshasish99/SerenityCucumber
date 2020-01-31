package features;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.SerenitySteps;

public class EmployeeStepDefinitions {

	@Steps
	SerenitySteps steps;
	
	@Given("^User succesfully logs in$")
	public void user_succesfully_logs_in() {
		steps.openURL();
	    steps.login("Luke", "Skywalker");
	    steps.loginIsSuccessful();
	}


	@And("^Enter employee creation data$")
	public void enter_employee_creation_data() {
	    steps.createEmployee("a", "b", "2019-12-12", "a@b.com");
	}

	@Then("^Employee is successfully created$")
	public void employee_is_successfully_created() throws InterruptedException {
	    steps.createEmployeeIsSuccessful("a");
	}

	@Then("^User Logs out$")
	public void user_Logs_out() throws InterruptedException {
	    steps.logout();
	}

	@And("^Enter employee updation data$")
	public void enter_employee_updation_data() throws InterruptedException {
	    steps.selectEmployeeToUpdate("a");
	    steps.updateEmployee("a_1", "b", "2019-09-09", "a@b.com");
	}

	@Then("^Employee is successfully updated$")
	public void employee_is_successfully_updated() throws InterruptedException {
	    steps.updateEmployeeIsSuccessful("a_1");
	}

	@And("^Delete an employee$")
	public void delete_an_employee() {
	    steps.selectEmployeeToDelete("a_1");
	    steps.deleteEmployee();
	}

	@Then("^Employee is successfully deleted$")
	public void employee_is_successfully_deleted() throws InterruptedException {
	    steps.deleteEmployeeIsSuccessful("a_1");
	}
	


}
