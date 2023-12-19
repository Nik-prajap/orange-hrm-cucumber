package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewSystemUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    WebElement VerifyTextSystemUser;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement clickingAddButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement enterUsername;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    List<WebElement> userRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement empName;

    @CacheLookup
    @FindBy(xpath = "(//i)[13]")
    List<WebElement> statusDropDownInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Disabled']")
    WebElement disableStatusOption;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Enable']")
    WebElement enableStatusOption;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement adminOption;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'ESS')]")
    WebElement essOption;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement enterSearch;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'ravinapansuriya')]")
    WebElement verifyTheResult;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement tickOnCheckbox;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Delete Selected']")
    WebElement clickOnDeleteButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement yesDeleteOption;

    @CacheLookup
    @FindBy(xpath = "(//div[@data-v-6c07a142])[1]")
    WebElement userNameInRecord;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement oneRecordFoundMessage;

    public String setVerifyTextSystemUser() {
        return getTextFromElement(VerifyTextSystemUser);
    }

    public void setClickingAddButton() {
        clickOnElement(clickingAddButton);
        log.info("Click on add button " + clickingAddButton.toString());
    }

    public void setEnterUsername(String user) {
        sendTextToElement(enterUsername, user);

        log.info("Enter the user name " + enterUsername.toString());
    }

    public void adminOption() {
        mouseHoverToElementAndClick(adminOption);
        log.info("Select Admin option " + adminOption.toString());
    }

    public void essOption() {
        mouseHoverToElementAndClick(essOption);
        log.info("Select ESS option " + essOption.toString());
    }

    public void selectDisable() {
        mouseHoverToElementAndClick(disableStatusOption);
        log.info("Select disable option " + disableStatusOption.toString());
    }

    public void selectEnable() {
        mouseHoverToElementAndClick(enableStatusOption);
        log.info("Select enable option " + enableStatusOption.toString());
    }

    public void selectUserRole(String userrole) {
        for (WebElement role : userRole) {
            if (role.getText().contains(userrole)) {
                mouseHoverToElementAndClick(role);
            }
        }
    }

    public void enterEmpName(String username) {
        sendTextToElement(empName, username);
        log.info("Enter the employee name " + empName.toString());
    }

    public void clickOnStatusDropDownInSystemUsers(String status) {
        for (WebElement statusOption : statusDropDownInSystemUsers) {
            if (statusOption.getText().contains(status)) {
                clickOnElement(statusOption);
            }
        }
    }

    public void setEnterSearch() {
        clickOnElement(enterSearch);
        log.info("Enter the search " + enterSearch.toString());
    }

    public String setVerifyTheResult() {
        return getTextFromElement(verifyTheResult);

    }

    public void setTickOnCheckbox() {
        clickOnElement(tickOnCheckbox);
        log.info("Select checkbox " + tickOnCheckbox.toString());
    }

    public void setClickOnDeleteButton() {
        clickOnElement(clickOnDeleteButton);
        log.info("Click on delete button " + clickOnDeleteButton.toString());
    }

    public void clickOnYesDeleteOption() {
        clickOnElement(yesDeleteOption);
        log.info("Click on yes button " + yesDeleteOption.toString());
    }

    public void clickOnResetButtonInSystemUsers() {
        clickOnElement(resetButton);
        log.info("Clicking on reset button " + resetButton.toString());
    }

    public String getDataFromUserNameInRecord() {
        return getTextFromElement(userNameInRecord);
    }

    public String getOneRecordFoundMessage() {
        return getTextFromElement(oneRecordFoundMessage);
    }

}


