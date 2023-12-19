package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserTest {
    @Given("I am on Login page")
    public void iAmOnLoginPage() {
    }

    @When("Login to Application")
    public void loginToApplication() {
    }

    @And("Enter login Username")
    public void enterLoginUsername() {
        new LoginPage().setEnterUserName("Admin");
    }

    @And("Enter login Password")
    public void enterLoginPassword() {
        new LoginPage().setEnterPassword("admin123");
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("Click On Admin")
    public void clickOnAdmin() {
        new AdminPage().clickOnAdminButton();
    }

    @And("Verify Text {string}")
    public void verifyTextSystemUsers(String errorMessage) {
        }

    @And("Click On Add button")
    public void clickOnAddButton() {
        new AdminPage().clickOnAddButton();
    }

    @And("Select User Role Admin")
    public void selectUserRoleAdmin() {
        new AddUserPage().setSelectUserRole();
    }

    @And("Enter Employee Name Peter Mac Anderson")
    public void enterEmployeeName() throws InterruptedException {
        Thread.sleep(3000);
        new AddUserPage().setEnterEmployeeName("Peter Mac Anderson");
        Thread.sleep(3000);
        new AddUserPage().setAutoSuggestionList();
    }

    @And("Enter Username")
    public void enterUsername() {
        new AddUserPage().enterTheUserName("Alibaba");
    }

    @And("Select status Disable")
    public void selectStatusDisable() {
        new AddUserPage().selectDisable();
    }

    @And("Enter password")
    public void enterPassword() {
        new AddUserPage().enterPassword("Mankind007");
    }

    @And("Enter Confirm Password")
    public void enterConfirmPassword() {
        new AddUserPage().confirmPassword("Mankind007");
    }

    @And("Click On Save Button")
    public void clickOnSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }


    @And("Verify Text for {string}")
    public void verifyTextForAddUser(String textMessage) {
        Assert.assertEquals(new AddUserPage().verifyAddUserText(), textMessage, "Message not displayed");
    }

    @And("Click on username dropdown")
    public void clickOnUsernameDropdown() {
        new AddUserPage().clickOnUserDropDown();
    }

    @And("Click on status drop down")
    public void clickOnStatusDropDown() {
        new AddUserPage().clickOnStatusDropDown();
    }

    @And("Click on Search Button")
    public void clickOnSearchButton() {
        new ViewSystemUsersPage().setEnterSearch();
    }

    @And("Verify the User should be in Result list.")
    public void verifyTheUserShouldBeInResultList() {
        new ViewSystemUsersPage().setVerifyTheResult();
    }

    @And("Click on Check box")
    public void clickOnCheckBox() {
        new ViewSystemUsersPage().setTickOnCheckbox();
    }

    @And("Click on Delete Button")
    public void clickOnDeleteButton() {
        new ViewSystemUsersPage().setClickOnDeleteButton();
    }

    @And("Popup will display")
    public void popupWillDisplay() {
    }

    @And("Click on Ok Button on Popup")
    public void clickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDeleteOption();
    }

    @And("Enter Username to add user")
    public void enterUsernameToAddUser() throws InterruptedException {
        Thread.sleep(3000);
        new ViewSystemUsersPage().setEnterUsername("Cassidy.Hope");
    }

    @And("Enter Username {string}")
    public void enterUsername(String username) {
        new ViewSystemUsersPage().setEnterUsername(username);
    }

    @And("Select User Role {string}")
    public void selectUserRole(String userRole) {
        new ViewSystemUsersPage().selectUserRole(userRole);
    }

    @And("Enter EmployeeName {string}")
    public void enterEmployeeName(String employeeName) {
        new ViewSystemUsersPage().enterEmpName(employeeName);
    }

    @And("Select Status {string}")
    public void selectStatus(String Status) {
        new ViewSystemUsersPage().clickOnStatusDropDownInSystemUsers(Status);
    }

    @And("verify message {string}")
    public void verifyMessage(String message) {
        Assert.assertEquals(new ViewSystemUsersPage().getOneRecordFoundMessage(), message, "No record found");

    }

    @And("Verify username {string}")
    public void verifyUsername(String username) {
        Assert.assertEquals(new ViewSystemUsersPage().getDataFromUserNameInRecord(), username, "No record found");
    }

    @Then("Click on Reset Tab")
    public void clickOnResetTab() {
        new ViewSystemUsersPage().clickOnResetButtonInSystemUsers();
    }


    @Then("Verify message for success {string}")
    public void verifyMessageForSuccess(String successMessage) {
        Assert.assertEquals(new AddUserPage().getSuccessfullySavedMessageInAddUser(),successMessage,"Message not found");
    }
}
