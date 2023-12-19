package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement verifyAddUserText;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[1]")
    WebElement userRoleDropDownInAddUser;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement enterEmployeeName;

    @CacheLookup
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    WebElement enterTheUserName;

    // By enterTheUserName = By.xpath("//input[@class='oxd-input oxd-input--focus']");

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']")
    WebElement selectStatus;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement selectAdmin;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'-- Select --')]")
    WebElement statusDropDown;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement selectDisable;
    //span[normalize-space()='Disabled']

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//font[contains(text(),'Save')]")
    WebElement clickOnSaveButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successfullySavedMessageInAddUser;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-autocomplete-text-input--after']")
    WebElement autoSuggestionList;


    public String verifyAddUserText() {
        return getTextFromElement(verifyAddUserText);
    }
    public void setSelectUserRole() {
        clickOnElement(selectAdmin);

    }
    public void clickOnUserDropDown() {
        mouseHoverToElementAndClick(userRoleDropDownInAddUser);
    }

    public void clickOnStatusDropDown() {
        mouseHoverToElementAndClick(statusDropDown);
    }

    public void setEnterEmployeeName(String name) {
        sendTextToElement(enterEmployeeName, name);

        keyboardclick(enterEmployeeName);
        log.info("Enter the employee name " + enterEmployeeName.toString());
    }
    public void setAutoSuggestionList() {
        keyboardclick(autoSuggestionList);
        //log.info("Enter the employee name " + enterEmployeeName.toString());
    }

    public void enterTheUserName(String userName) {
        sendTextToElement(enterTheUserName, userName);
        log.info("Enter the user name " + enterTheUserName.toString());
    }

    public void selectStatus() {
        clickOnElement(selectStatus);
        log.info("Selecting status" + selectStatus.toString());
    }

    public void selectAdmin() {
        selectByContainsTextFromDropDown((By) selectAdmin, "Admin");
        log.info("Select admin " + selectAdmin.toString());
    }

    public void selectDisable() {
        selectByIndexFromDropDown(selectDisable, 0);
        log.info("Select disable " + selectDisable.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(this.password, password);
        log.info("Enter the password " + password.toString());
    }

    public void confirmPassword(String confirmPassword1) {
        sendTextToElement(confirmPassword, confirmPassword1);
        log.info("Enter the confirm password " + confirmPassword.toString());
    }

    public void clickOnSaveButton() {
        clickOnElement(clickOnSaveButton);
        log.info("Click on save button " + clickOnSaveButton.toString());
    }
    public String getSuccessfullySavedMessageInAddUser() {
        return getTextFromElement(successfullySavedMessageInAddUser);
    }
}
