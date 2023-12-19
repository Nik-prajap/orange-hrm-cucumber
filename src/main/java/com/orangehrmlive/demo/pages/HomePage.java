package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement orangeHRMLogo;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userprofile;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement verifyLoginPanel;


    public String setVerifyLoginPanel() {
        log.info("Verifying login text " + verifyLoginPanel.toString());
        return getTextFromElement(verifyLoginPanel);
    }

    public Boolean verifyOrangeHRMLogo() {
        return driver.findElement((By) orangeHRMLogo).isDisplayed();
    }

    public void clickOnUserProfile(){
        clickOnElement(userprofile);
        log.info("Clicking on user profile " + userprofile.toString());
    }

    public void clickOnLogoutButton(){
        clickOnElement(logout);
        log.info("Clicking on logout button " + logout.toString());
    }

}