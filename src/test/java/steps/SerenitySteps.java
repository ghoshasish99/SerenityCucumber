package steps;

import net.thucydides.core.annotations.Step;
import pageobject.*;

public class SerenitySteps {
	
	LoginPage loginpage;
	CreateEmployee createEmployee;
	UpdateEmployee updateEmployee;
	DeleteEmployee deleteEmployee;
	Logout logout;
	
	@Step
	public void openURL() {
		loginpage.open();
	}
	@Step
	public void login(String username, String password) {
		loginpage.login(username, password);
	}
	@Step
	public void loginIsSuccessful() {
		loginpage.loginIsSuccessful();
	}
	@Step
	public void createEmployee(String fname, String lname, String sdate, String email) {
		createEmployee.createEmployee(fname, lname, sdate, email);
	}
	@Step
	public void createEmployeeIsSuccessful(String fname) throws InterruptedException {
		createEmployee.createEmployeeIsSuccessful(fname);
	}
	@Step
	public void selectEmployeeToUpdate(String fname) throws InterruptedException {
		updateEmployee.selectEmployeeToBeUpdated(fname);
	}
	@Step
	public void updateEmployee(String fname, String lname, String sdate, String email) {
		updateEmployee.updateEmployee(fname, lname, sdate, email);
	}
	@Step
	public void updateEmployeeIsSuccessful(String fname) throws InterruptedException {
		updateEmployee.updateEmployeeIsSuccessful(fname);
	}
	@Step
	public void selectEmployeeToDelete(String fname) {
		deleteEmployee.selectEmployeeToBeDeleted(fname);
	}
	@Step
	public void deleteEmployee() {
		deleteEmployee.deleteEmployee();
	}
	@Step
	public void deleteEmployeeIsSuccessful(String fname) throws InterruptedException {
		deleteEmployee.deleteEmployeeIsSuccessful(fname);
	}
	@Step
	public void logout() throws InterruptedException {
		logout.logout();
	}

}
