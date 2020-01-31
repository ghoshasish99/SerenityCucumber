@EmployeeOperations
Feature: Perform different Employee Operations
  I want to perform different employee operations

   @CreateEmployee
  Scenario: Validate employee can be succesfully created
    Given User succesfully logs in
    And Enter employee creation data
    Then Employee is successfully created
    And User Logs out
 
  @UpdateEmployee
  Scenario: Validate employee can be successfully updated
    Given User succesfully logs in
    And Enter employee updation data
    Then Employee is successfully updated
    And User Logs out

   
   @DeleteEmployee
   Scenario: Validate employee can be successfully deleted
    Given User succesfully logs in
    And Delete an employee
    Then Employee is successfully deleted
    And User Logs out

 