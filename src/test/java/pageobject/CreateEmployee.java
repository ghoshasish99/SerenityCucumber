package pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import  pageobject.CommonObjects;

public class CreateEmployee extends PageObject {
	
	CommonObjects commonobjects;
	
	@FindBy(id = "bAdd")
	WebElement CreateButton;
	
	@FindBy(xpath = "/html/body/div/div/div/form/fieldset/div/button[2]")
	WebElement AddButton;
    
	public void createEmployee(String fname, String lname, String sdate, String email) {
		CreateButton.click();
		commonobjects.FirstName.sendKeys(fname);
		commonobjects.LastName.sendKeys(lname);
		commonobjects.StartDate.sendKeys(sdate);
		commonobjects.Email.sendKeys(email);
		AddButton.click();
	}
	public void createEmployeeIsSuccessful(String fname) throws InterruptedException {
		Thread.sleep(5000);
		assertTrue(commonobjects.UserList.getText().contains(fname));
	}
}
