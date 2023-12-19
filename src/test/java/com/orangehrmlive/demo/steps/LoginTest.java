package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTest {

    @And("Enter login username")
    public void enterLoginUsername() {
        new LoginPage().setEnterUserName("Admin");
    }

    @And("Enter login password")
    public void enterLoginPassword() {
        new LoginPage().setEnterPassword("admin123");
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("Verify {string} Message")
    public void verifyMessage(String arg0) {
    }

    @Then("Verify Logo is Displayed")
    public void verifyLogoIsDisplayed() {
        Assert.assertTrue(new HomePage().verifyOrangeHRMLogo());
    }

    @When("I am using valid credential")
    public void iAmUsingValidCredential() {
       }

    @And("Click on User Profile logo")
    public void clickOnUserProfileLogo() {
        new HomePage().clickOnUserProfile();
    }


    @Then("Verify the text {string} is displayed")
    public void verifyTheTextIsDisplayed(String textMessage) {
        Assert.assertEquals(new HomePage().setVerifyLoginPanel(), textMessage, "LogonPanel not available");
    }

    @And("Mouse hover on Logout and click")
    public void mouseHoverOnLogoutAndClick() {
        new HomePage().clickOnLogoutButton();
    }

    @And("Enter username {string}")
    public void enterUsername(String username) {
        new LoginPage().setEnterUserName(username);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        new LoginPage().setEnterPassword(password);
    }

    @Then("Verify Error message {string}")
    public void verifyErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().requiredMessage(errorMessage),errorMessage,"Error not displayed");
    }
}
