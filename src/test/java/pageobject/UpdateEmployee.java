package pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import  pageobject.CommonObjects;


public class UpdateEmployee extends PageObject {
	
	CommonObjects commonobjects;
	
	@FindBy(id="bEdit")
	WebElement UpdateButton;
	
	@FindBy(xpath="/html/body/div/div/div/form/fieldset/div/button[1]")
	WebElement SubmitUpdateButton;
	
	public void updateEmployee(String fname, String lname, String sdate, String email) {
		UpdateButton.click();
		commonobjects.FirstName.clear();
		commonobjects.FirstName.sendKeys(fname);
		commonobjects.LastName.clear();
		commonobjects.LastName.sendKeys(lname);
		commonobjects.StartDate.clear();
		commonobjects.StartDate.sendKeys(sdate);
		commonobjects.Email.clear();
		commonobjects.Email.sendKeys(email);
		SubmitUpdateButton.click();
	}
	public void updateEmployeeIsSuccessful(String fname) throws InterruptedException {
		waitForCondition().until(ExpectedConditions.textToBePresentInElement(commonobjects.UserList, fname));
		assertTrue(commonobjects.UserList.getText().contains(fname));
	}
	public void selectEmployeeToBeUpdated(String fname) throws InterruptedException {
		WebElement EmployeeToUpdate = commonobjects.userToBeOperatedOn(fname);
		waitForCondition().until(ExpectedConditions.elementToBeClickable(EmployeeToUpdate));
		EmployeeToUpdate.click();	
	}
	
}
