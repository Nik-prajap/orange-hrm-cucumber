package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(name = "username")
    WebElement UserName;

    @CacheLookup
    @FindBy(name = "password")
    WebElement Password;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement invalidCredential;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
    WebElement userNameFieldBlankErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    WebElement passwordFieldBlankErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    WebElement both;

    public void setEnterUserName(String userName) {
        sendTextToElement(UserName, userName);
        log.info("Enter the user name " + UserName.toString());
    }

    public void setEnterPassword(String password) {
        sendTextToElement(Password, password);
        log.info("Enter the password " + password.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on login button " + loginButton.toString());
    }

    public String requiredMessage(String message){
        switch (message){
            case "Required":
                return (getTextFromElement(both));
            default:
                return (getTextFromElement(invalidCredential));
        }
    }

}
