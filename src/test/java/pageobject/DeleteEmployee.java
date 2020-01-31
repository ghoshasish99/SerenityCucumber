package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class DeleteEmployee extends PageObject {
	CommonObjects commonobjects;
	
	@FindBy(id = "bDelete")
	WebElement DeleteButton;
	
	public void deleteEmployeeIsSuccessful(String fname) throws InterruptedException {
		
		commonobjects.userToBeOperatedOn(fname).click();
		waitForCondition().until(ExpectedConditions.invisibilityOfElementWithText(By.id("employee-list"), fname));
		
	}
	public void selectEmployeeToBeDeleted(String fname) {
		commonobjects.userToBeOperatedOn(fname).click();
	}
	public void deleteEmployee() {
		DeleteButton.click();
		getAlert().accept();
	}
}
